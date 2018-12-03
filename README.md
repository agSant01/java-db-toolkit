# java-db-toolkit

A java database connection handler, table initializator, and model parser.

This project is made with the goal of reducing unecessary boiler plate in Database connection management, insertions, and other common tasks made using the Native Java Database API.

For the moment it only has implemented support for MySQL Database Engine, but you can make your own pluggins and implementations for other Database Engines by extending the `Connectable` abstract class.

## Usage

Everything starts with the `Connectable` object. This is the object responsible for storing all the related attributes for the respective DB engine.

```java
MySQL mySqlEng = new MySQL("localhost", "user", "12345", "MyDB");
```

This contains all the information needed for creating a successfull connection.

The `DbConHandler` recieves as an argument any instance of a `Connectable` object.

```java
DbConHandler dbHandler = new DbConHandler(mySqlEng);
```

The connections, insertions, and queries against the DB are managed throught this object.

```java
// simple query statement
dbHandler.execute("INSERT INTO MyTable(id, name, pass) VALUES(1, 'Name', '123456');");


// simple query statement with return (ex: select)
ResultSet result = dbHandler.query("SELECT * FROM myTable");

// get result
while(result.next()) {
    int data = result.get(1) // get by column position or name
    // additional code...
}
```

## Advanced Usage

This library allows to convert Java Models into Relational Models for ease of insertion in the DB.

Assuming we have this Java Model Object

```java
class MyObject extends Relational {
    private String a;
    private int b;

    // required constructor for the functionality of serializing into relational object
    public MyObject() {}

    // contructor
    MyObject(String a, int b) {
        this.a = a;
        this.b = b;
    }

    // getters and setters
    // ...
}
```

By extending the `Relational` abstract class and implementing the required methods the object can be inserted into the Database with the following code.

\*\*The object needs to explicitly hava an empty constructor implemented.

```java
// create connectable
MySQL mySqlEng = new MySQL("localhost", "user", "12345", "MyDB");

// initialize Database connection
DbConHandler dbHandler = new DbConHandler(mySqlEng);

// create new Object instance
MyObject object = new MyObject("Test", 1);

// insert object into DB
dbHandler.insert(object);
```

The `Relational` parser will only recognize fields that have public getters implemented. It will not add to the Row reprentation fields or variables that does not contain a getter that starts with "get".

## Testing

Tesing is also tied down to the implemetntation of this project.

You can intercept every execution of a query to a dummy driver by using the existing `MySQLTest` connectable which instead of returning a `Connection` object will return a `TestConnection` which in turn will behave like a regular connection object but instead of executing the commands against a real DB will provide the functionality and methods necessary for testing.

Example of a basic test:

```java
// test setup
// create a test connectable
MySQLTest sql = new MySQLTest(host, user, pass, db);
// initialize Database connection
DbConHandler dbHandler = new DbConHandler(mySqlEng);
TestConnetion driver = dbHadler.getConnection();

// predefined query
query = "Select * From Users;";

// test execute
dbHandler.execute(query);

// get used statement
// depending on the action made the Statetment object o PreparedStatement is used
// in this case is a Statement object
TestStatement stmt = driver.getStmt();

// assert that same query executed
assertTrue(stmt.getLastQuery().equals(query));
// assert statement was closed
assertTrue(stmt.lastExecuted().equals("close()"));
```

More advanced test:

```java
class MyObject extends Relational {
    private String a;
    private int b;
    // empty contructor
    // contructor
    // getters and setters
    // ...
}

// test setup
// ...

// create object to insert
MyObject object = new MyObject("Test", 1);

// object insertion
dbHandler.insert(object)
```

This insertion above should produce the following SQL statement:

```sql
INSERT INTO MyObject(a, b) VALUES('Test', 1)
```

The assertion would look like:

```java
// PreparedStatement used in this case
TestPreparedStatemnt stmt = driver.getPstmt();

// assert that same query executed
assertTrue(stmt.getLastQuery().equals(query));
// assert statement was closed
assertTrue(stmt.lastExecuted().equals("close()"));
```

## Documentation

### DbConHandler

Core functionality. Receives a Connectable object in order to know the implementation details of the different DB engines.

### Connectable

Abstract class representing the different DB engines attributes. It has to be extended in order to create new support for additional engines.

- MySQL (implemented)
- SQL Server (pending)
- PostgresSQL (pending)

### Relational

Converts Object Models into Relational objects for insertion into database.
This will only recognize fields that are accompanied by a respective public getter. Fileds that does not contain a getter\* would not be Relationized.

\* methods that does not start with "get" <br>
\*\* It is required that the object has an empty contructor with no arguments.

### Column

Object representation of the fileds of a model as columns. A collection of columns would be the representation of a the object as a DB table row.

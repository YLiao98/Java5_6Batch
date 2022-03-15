## Review 
- transaction in SQL
    - ACID principle
- stored procedure
    - what is a trigger?
- JDBC driver

## New Things I've learned

- What are the JDBC Statements?
  - Statement: It will execute SQL query (static) against the database by using createStatement() method of Connection class. It is preferred when a particular SQL query is to be executed only once.
  - PreparedStatement: It will execute parameterized query by using prepareStatement() method of Connection class. It is preferred when a particular query is to be executed multiple times. 
    - Prepared Statement is compiled only once.
  - CallableStatement: CallableStatement interface is used to call the stored procedures and functions.
```
      //Creating CallableStatement object
      CallableStatement cstmt = con.prepareCall("{call anyProcedure(?, ?, ?)}");
      //Use cstmt.setter() methods to pass IN parameters
      //Use cstmt.registerOutParameter() method to register OUT parameters
      //Executing the CallableStatement

      cstmt.execute();

      //Use cstmt.getter() methods to retrieve the stored procedure result
```


## Plan for Tomorrow
- coding problems
- review Java JDBC API components and their corresponding code examples
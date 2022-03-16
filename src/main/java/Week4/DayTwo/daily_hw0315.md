## Review 
- JAVA Keywords
- Hibernate JPA annotations
    - @Entity
    - @Table
    - @Id
    - @GeneratedValue
        - database generates (auto-increment) the id column.
    - @JoinTable
    - @JoinColumn
        - @JoinTable stores the id of both the table into a separate table while @JoinColumn stores id of the another table in a new column, Use @JoinColumn when the entities have direct relationship i.e a foreign key between two entity.


## New Things I've learned

- Hibernate
    - One-to-One, One-to-Many, Many-to-Many, Many-to-One
        - One-to-One: one object only associates with another distinct object
        - One-to-Many: the most commonly used which indicates that one object is linked/associated with multiple objects.
        - Many-to-Many: multiple relations between the instances of two entities.
        - Many-to-One: many instances of an entity are mapped to one instance of another entity
    - Hibernate Native SQL
        - use native SQL to express database queries if you want to utilize database-specific features such as query hints or the CONNECT keyword in Oracle. Hibernate 3.x allows you to specify handwritten SQL, including stored procedures, for all create, update, delete, and load operations.
        - create a native SQL query from the session with the createSQLQuery() method on the Session interface 
        ```
        public SQLQuery createSQLQuery(String sqlString) throws HibernateException
        ```

    - HQL
        - what is HQL?
            - an object-oriented query language, similar to SQL, but instead of operating on tables and columns, HQL works with persistent objects and their properties.
        - FROM
            - use FROM clause if we want to load a complete persistent objects into memory.
            ```
            // String hql = "FROM com.hibernatebook.criteria.Employee"; 
            // fully qualify a class name in HQL, just specify the package and class 
            // name
            String hql = "FROM Employee E";
            Query query = session.createQuery(hql);
            List results = query.list();
            ```
        - SELECT
            ```
            String hql = "SELECT E.id FROM Employee E";
            Query query = session.createQuery(hql);
            List results = query.list();
            ```
        - WHERE
            ```
            String hql = "FROM Employee E WHERE E.id = 10";
            Query query = session.createQuery(hql);
            List results = query.list();
            ```
        - GROUP BY and ORDER BY
            ```
            String hql = "SELECT SUM(E.salary), E.firtName FROM Employee E " + "GROUP BY E.firstName" + "ORDER BY E.firstName DESC";
            Query query = session.createQuery(hql);
            List results = query.list();
            ```
        - NAMED Parameters
            - This makes writing HQL queries that accept input from the user easy and you do not have to defend against SQL injection attacks.
            ```
            String hql = "FROM Employee E WHERE E.id = :employee_id";
            Query query = session.createQuery(hql);
            query.setParameter("employee_id",10);
            List results = query.list();
            ```
        - UPDATE op
            ```
            String hql = "UPDATE Employee set salary = :salary "  + "WHERE id = :employee_id";
            Query query = session.createQuery(hql);
            query.setParameter("salary", 1000);
            query.setParameter("employee_id", 10);
            int result = query.executeUpdate();
            System.out.println("Rows affected: " + result);
            ```
        - INSERT op
            ```
            String hql = "INSERT INTO Employee(firstName, lastName, salary)"  + "SELECT firstName, lastName, salary FROM old_employee";
            Query query = session.createQuery(hql);
            int result = query.executeUpdate();
            System.out.println("Rows affected: " + result);
            ```
        - DELETE op
            ```
            String hql = "DELETE FROM Employee "  + "WHERE id = :employee_id";
            Query query = session.createQuery(hql);
            query.setParameter("employee_id", 10);
            int result = query.executeUpdate();
            System.out.println("Rows affected: " + result);
            ```
        - Pagination
            - Query setFirstResult(int startPos)
            - takes an integer that represent the first row in ResultSet
            - Query setMaxsResults(int maxRes)
            - tells Hibernate to retrieve a fixed number of object
            - code example to fetch 10 rows at a time
            ```
            String hql = "FROM Employee";
            Query query = session.createQuery(hql);
            query.setFirstResult(1);
            query.setMaxResults(10);
            List results = query.list();
            ```

    - Criteria API
        - allows you to build up a criteria query object programmatically where you can apply filtration rules and logical conditions.
        - Session interface provides createCriteria() method, which can be used to create a Criteria object that returns instances of the persistence object's class when your application executes a criteria query.
            ```
            Criteria cr = session.createCriteria(Employee.class);
            List results = cr.list(); // return every object that corresponds to Employee class
            ```
        - Restrictions with Criteria
            - use add() method available for Criteria object to add restriction for a criteria query.
            ```
            Criteria cr = session.createCriteria(Employee.class);
            cr.add(Restrictions.eq("salary", 2000));
            List results = cr.list();
            ```
            - more filters example
            ```
            Criteria cr = session.createCriteria(Employee.class);

            // To get records having salary more than 2000
            cr.add(Restrictions.gt("salary", 2000));

            // To get records having salary less than 2000
            cr.add(Restrictions.lt("salary", 2000));

            // To get records having fistName starting with zara
            cr.add(Restrictions.like("firstName", "zara%"));

            // Case sensitive form of the above restriction.
            cr.add(Restrictions.ilike("firstName", "zara%"));

            // To get records having salary in between 1000 and 2000
            cr.add(Restrictions.between("salary", 1000, 2000));

            // To check if the given property is null
            cr.add(Restrictions.isNull("salary"));

            // To check if the given property is not null
            cr.add(Restrictions.isNotNull("salary"));

            // To check if the given property is empty
            cr.add(Restrictions.isEmpty("salary"));

            // To check if the given property is not empty
            cr.add(Restrictions.isNotEmpty("salary"));

            ```
            - AND & OR operation
            ```
            Criteria cr = session.createCriteria(Employee.class);

            Criterion salary = Restrictions.gt("salary", 2000);
            Criterion name = Restrictions.ilike("firstNname","zara%");

            // To get records matching with OR conditions
            LogicalExpression orExp = Restrictions.or(salary, name);
            cr.add( orExp );

            // To get records matching with AND conditions
            LogicalExpression andExp = Restrictions.and(salary, name);
            cr.add( andExp );

            List results = cr.list();
            ```
        - Pagination
            - Criteria setFirstResult(int firstResult)
            - Criteria setMaxResults(int maxResults)
        - Order the Result
            ```
            Criteria cr = session.createCriteria(Employee.class);

            // To get records having salary more than 2000
            cr.add(Restrictions.gt("salary", 2000));

            // To sort records in descening order
            cr.addOrder(Order.desc("salary"));

            // To sort records in ascending order
            cr.addOrder(Order.asc("salary"));

            List results = cr.list();
            ```
        - Aggregation
            ```
            Criteria cr = session.createCriteria(Employee.class);

            // To get total row count.
            cr.setProjection(Projections.rowCount());

            // To get average of a property.
            cr.setProjection(Projections.avg("salary"));

            // To get distinct count of a property.
            cr.setProjection(Projections.countDistinct("firstName"));

            // To get maximum of a property.
            cr.setProjection(Projections.max("salary"));

            // To get minimum of a property.
            cr.setProjection(Projections.min("salary"));

            // To get sum of a property.
            cr.setProjection(Projections.sum("salary"));
            ```



## Plan for Tomorrow
- coding problems
- more Hibernate-related topics
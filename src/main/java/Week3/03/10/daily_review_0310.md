## Review 
- SQL tuning
- concurrency control
- index 
    - clustered vs nonclustered: datastructure, performance, difference
## New Things I've learned
- Strongly Consistent vs Eventually Consistent
    - Strongly Consistent means that the data must be strongly consistent all the time, all nodes must contain the same value at any moment. 
        - Only way to do so is by locking down nodes while being updated. This would have high cost of latency
    - Eventually Consistent means that data store to be highly available, all reads of the data entity will eventually return the last updated value.
        - Although replicas are always available to read, some replicas may be inconsistent with the latest write on the originating node, at a particular moment in time.
- Spring Data JPA
    - Spring Data uses the default JPA implementation called Hibernated to create a complete abstraction over the Data Access Layer in a project
        - Repository interfaces
            - methods for sotring and finding the entity beans from database

## Plan for Tomorrow
- coding problems
- review Java Collection, and more in transactions & concurrency
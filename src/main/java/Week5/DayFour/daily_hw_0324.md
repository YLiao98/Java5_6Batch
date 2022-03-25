## Review
- Spring AOP
    - Pointcut -> determine the point where advice executes
        - execution
        - @within
        - this
        - @target
        - @args
- Spring Controller, Service and Entity mapping
    - @Entity
    - @Id, @GeneratedValue
        - value: AUTO, TABLE, SEQUENCE, IDENTITY
    - @OneToMany
        - @JoinColumn
    - @ManyToOne
    - @ManyToMany
    - @OneToOne


## New Things

- Http URL design
    - CRUD op
        - get	/api/employees	retrieves a list of employees
        - get	/api/employees/10	retrieve a specific employee
        - put	/api/employees/10	update employee #10
        - post	/api/employees	create a new employee
        - delete	/api/employees/10	delete employee #10
        - patch	/api/employees/10	partially update emp #10
    - filtering, sorting, searching
        - combine all:
            - get /api/employees?q=java&state=open&sort=created_at,-salary

        - Limit fields
            - get /api/employee?fields=id,department&...

        - auto loading
            - get /api/employees/10?embed=manage.name
            - get /api/employees/10?expand=manage.name

- Spring RESTful API Annotations
    - @RestController, @Controller, @Service, @Repsitory,
    @GetMapping, @PostMapping, @PutMapping, @DeleteMapping, @RequestMapping, 
    @PathVariable, @RequestParam
    @RequestBody, @ResponseBody

- Validation
    - common validation annotations
@NotNull, @NotEmpty, @NotBlank, @Min, @Max, @Pattern, @Email …

    - @Valid(partial validation), @Validated(group validation)

## Plans for Tomorrow
- Coding Problems
- Further Review Spring Boot project



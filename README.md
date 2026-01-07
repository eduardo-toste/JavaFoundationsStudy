# Java + Spring Study Plan — Correlation-Based

---

## How to use (daily)

- **Theory (25–40 min):** 1–2 items from the current cluster + 5–10 bullet notes
- **Practice (25–40 min):** 1 focused exercise/kata
- **Build (20–40 min):** mini-project increment aligned to the cluster (code + tests + commits)
- **Explain (2–5 min):** 30–60 second explanation (text/voice)

## Completion rule (for any checkbox)

- Understand the theory
- Solve at least 1 isolated exercise
- Apply it in a mini-project
- Explain it in 30–60 seconds

---

# Correlated Clusters (Learning Blocks)

## Cluster 1 — Java Foundations (language behavior + correctness)

### Theory (from your checklist)

- [ ]  Primitive types and Wrappers
- [ ]  Autoboxing and Unboxing
- [ ]  Difference between `==` and `.equals()`
- [ ]  Strings (immutability, StringBuilder)
- [ ]  BigDecimal
- [ ]  Control flow
- [ ]  Arrays and varargs
- [ ]  `final`, `static`, `this`, `super`
- [ ]  Access modifiers
- [ ]  Package organization
- [ ]  Static Binding vs Dynamic Binding
- [ ]  Shadowing and scope
- [ ]  Garbage Collector (concept)

### Practice (from your checklist)

- [ ]  Build small programs to compare Strings and wrappers
- [ ]  Implement operations with BigDecimal
- [ ]  Sort, filter, and manipulate arrays manually
- [ ]  Demonstrate static binding vs dynamic binding using inheritance

### Mini-project suggestions (pick 1)

- [ ]  **Budget CLI** (BigDecimal + control flow + strings)
- [ ]  **Text Stats CLI** (strings + arrays + control flow)

---

## Cluster 2 — OOP Design (SOLID + domain modeling)

### Theory (from your checklist)

- [ ]  Encapsulation, Inheritance, Polymorphism, Abstraction
- [ ]  Overriding and overloading
- [ ]  Interface vs abstract class
- [ ]  Association and composition
- [ ]  SOLID
- [ ]  Cohesion and coupling
- [ ]  Value Objects

### Practice (from your checklist)

- [ ]  Create simple hierarchies (Person → Student/Teacher)
- [ ]  Create immutable Value Objects
- [ ]  Refactor project classes applying SOLID

### Mini-project suggestions (pick 1)

- [ ]  **Library Lending Core** (Book/Member/Loan + rules)
- [ ]  **Task Manager Core (pure Java)** (Project/Task + rules)

---

## Cluster 3 — Data Structures & Transformations (Collections + Streams + Optional)

### Collections — Theory (from your checklist)

- [ ]  List, Set, Map
- [ ]  ArrayList, HashSet, HashMap
- [ ]  Iteration (`for`, `forEach`, `iterator`)
- [ ]  Comparator and Comparable
- [ ]  Big-O (concept)

### Collections — Practice (from your checklist)

- [ ]  Remove duplicates, sort, and group lists
- [ ]  Create a list of objects and sort by 2 fields

### Streams + Java 8 — Theory (from your checklist)

- [ ]  Lambda expressions
- [ ]  Method references
- [ ]  Streams: filter, map, collect
- [ ]  Optional
- [ ]  Collectors: groupingBy, joining
- [ ]  Solve problems with Streams (like first non-duplicate)

### Streams — Practice (from your checklist)

- [ ]  Solve: “First non-repeated character using Stream API”
- [ ]  Create pipelines using map → filter → collect
- [ ]  Group and count items using groupingBy

### Mini-project suggestions (pick 1)

- [ ]  **Log Analyzer** (Collections + grouping + sorting)
- [ ]  **Recipe Finder** (Streams + Optional)

---

## Cluster 4 — Reuse & Type Safety (Generics)

### Theory (from your checklist)

- [ ]  `<T>`, `<K, V>`
- [ ]  Wildcards: `<? extends T>`, `<? super T>`

### Practice (from your checklist)

- [ ]  Create generic utility methods
- [ ]  Implement simple generic DTO converters

### Mini-project suggestions (pick 1)

- [ ]  **Generic Toolkit** (Mapper/Converter + tests)

---

## Cluster 5 — Reliability (Exceptions mindset)

### Theory (from your checklist)

- [ ]  Checked vs Unchecked
- [ ]  try-catch-finally
- [ ]  throw vs throws
- [ ]  Custom Exceptions

### Practice (from your checklist)

- [ ]  Create custom exceptions
- [ ]  Throw and handle exceptions correctly

### Mini-project suggestions (pick 1)

- [ ]  **Payment Simulator** (domain errors + consistent messages)

---

## Cluster 6 — Concurrency Basics (Multithreading)

### Theory (from your checklist)

- [ ]  What a thread is
- [ ]  Create threads using `Thread`
- [ ]  Create threads using `Runnable`

### Practice (from your checklist)

- [ ]  Create a simple parallel task (simulate async sending)

### Mini-project suggestions (pick 1)

- [ ]  **Async Dispatch Simulator** (Thread/Runnable)

---

## Cluster 7 — Spring Boot Web Fundamentals (API basics)

### Theory (from your checklist)

- [ ]  Project structure
- [ ]  Controllers and endpoints
- [ ]  Services and business rules
- [ ]  Repositories
- [ ]  `@RestController` vs `@Controller`
- [ ]  `@Component` vs `@Service` vs `@Repository`
- [ ]  How `@SpringBootApplication` works

### Practice (from your checklist)

- [ ]  Create full CRUD endpoints with DTOs
- [ ]  Test everything in Postman/Insomnia

### Mini-project suggestions (pick 1)

- [ ]  **Habit Tracker API (v0)**

---

## Cluster 8 — API Contracts (DTO + Validation) + Error Consistency

### DTO + Validation — Theory (from your checklist)

- [ ]  `@RequestBody`
- [ ]  `@PathVariable`
- [ ]  Bean Validation: `@NotBlank`, `@Email`, `@Pattern`, etc.
- [ ]  `@Valid`
- [ ]  `ResponseEntity`

### DTO + Validation — Practice (from your checklist)

- [ ]  Create request and response DTOs
- [ ]  Validate user input
- [ ]  Test success and error responses

### Global Error Handling — Theory (from your checklist)

- [ ]  `@ControllerAdvice`
- [ ]  `@ExceptionHandler`
- [ ]  Error response structure

### Global Error Handling — Practice (from your checklist)

- [ ]  Create a global error handler
- [ ]  Create a standard error response format

### Mini-project suggestions (pick 1)

- [ ]  **Event Booking API (v0)** (DTO + validation + global errors)

---

## Cluster 9 — Persistence (JPA + Relationships + Querying)

### Entities & Relationships — Theory (from your checklist)

- [ ]  `@Entity`, `@Id`, `@GeneratedValue`
- [ ]  Relationships: OneToMany, ManyToOne, ManyToMany
- [ ]  Lazy vs Eager

### Entities & Relationships — Practice (from your checklist)

- [ ]  Create new entities
- [ ]  Implement a real relationship

### Queries + Pagination — Theory (from your checklist)

- [ ]  Query Methods
- [ ]  Basic JPQL
- [ ]  `Pageable` and `Sort`

### Queries + Pagination — Practice (from your checklist)

- [ ]  Create repository filters
- [ ]  Implement pagination

### Mini-project suggestions (pick 1)

- [ ]  **Support Tickets API** (filters + pageable + JPQL)

---

## Cluster 10 — Security (JWT + Roles)

### Theory (from your checklist)

- [ ]  Authentication vs Authorization
- [ ]  Roles
- [ ]  JWT basics
- [ ]  Filters (general concept)

### Practice (from your checklist)

- [ ]  Implement login + token generation
- [ ]  Create a public route and a protected route

### Mini-project suggestions (pick 1)

- [ ]  **Notes API (Secured)**

---

## Cluster 11 — Infra Fundamentals (SQL + Docker + Git)

### SQL — Theory (from your checklist)

- [ ]  SELECT, INSERT, UPDATE, DELETE
- [ ]  WHERE
- [ ]  JOINs
- [ ]  GROUP BY
- [ ]  Primary Key vs Foreign Key
- [ ]  Indexes

### SQL — Practice (from your checklist)

- [ ]  Write SQL queries from scratch
- [ ]  Create tables and test relationships

### Docker — Theory (from your checklist)

- [ ]  Dockerfile
- [ ]  Docker Compose (Postgres)
- [ ]  `.env` variables

### Docker — Practice (from your checklist)

- [ ]  Bring up a complete local environment

### Git & GitHub — Theory (from your checklist)

- [ ]  add, commit, push, pull
- [ ]  Branches
- [ ]  PR
- [ ]  Conflict resolution
- [ ]  Conventional Commits

### Git & GitHub — Practice (from your checklist)

- [ ]  Create a PR explaining your changes
- [ ]  Use Conventional Commits correctly

### Mini-project suggestions

- [ ]  Dockerize one of your APIs + write “how to run” docs
- [ ]  Practice a PR-based workflow in your repo

---

## Cluster 12 — Extras (Professional polish)

### Theory (from your checklist)

- [ ]  Logging with SLF4J
- [ ]  Simple uploads
- [ ]  Sending emails
- [ ]  Integration with external APIs
- [ ]  Simple deploy (Render/Railway)

### Practice (from your checklist)

- [ ]  Create a small external integration module
- [ ]  Create a scheduled job with `@Scheduled`
- [ ]  Create standardized logs

### Mini-project suggestions

- [ ]  Add logs + scheduled job to one API
- [ ]  Add 1 external integration + 1 simple deploy

---
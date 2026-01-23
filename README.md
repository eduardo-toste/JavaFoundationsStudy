# ✅ Java + Spring Study Plan — Correlation-Based (Exercise-First)

---

## Daily schedule (1–2 hours)

### 60 min (minimum)

- 20m theory (1 checklist item)
- 35m exercise (one kata)
- 5m notes (3–5 bullets)

### 90–120 min (ideal)

- 30–40m theory (1–2 items)
- 40–60m exercise(s)
- 10–20m micro-build or test-writing
- 5m recap

---

## Completion rule (per checklist item)

- Understand the theory
- Solve 1 exercise that uses it
- Write 1–3 tests for that exercise (when possible)
- Explain it in 30–60 seconds

---

# CLUSTERS + EXERCISE SETS

## Cluster 1 — Java Foundations

### Theory checklist

- [x]  Primitive types and Wrappers
- [x]  Autoboxing and Unboxing
- [ ]  JVM vs JRE vs JDK
- [ ]  Access Modifiers
- [x]  `==` vs `.equals()`
- [ ]  Strings (immutability, StringBuilder)
- [ ]  BigDecimal
- [ ]  Control flow
- [ ]  Arrays and varargs
- [ ]  `final`, `static`, `this`, `super`
- [ ]  Access modifiers
- [ ]  Package organization
- [ ]  Static vs dynamic binding
- [ ]  Shadowing and scope
- [ ]  Garbage Collector (concept)

### Exercise set (do 8–12 total)

- [x]  Build a “truth table” demo: wrappers/Strings with `==` and `.equals()`
- [ ]  Implement `Money` (BigDecimal) with scale/rounding rules + tests
- [ ]  CLI menu loop: add/list/remove items (focus on control flow)
- [ ]  Array utilities: manual filter/map/sort (no streams yet)
- [ ]  Varargs: build `sum(BigDecimal... values)` + edge cases
- [ ]  Access modifiers: create 2 packages and prove what is/ isn’t accessible
- [ ]  `static` vs instance: counter vs per-object state demo
- [ ]  `this/super`: inheritance constructor chain demo
- [ ]  Dynamic dispatch demo: base ref → derived method call
- [ ]  Shadowing demo: local vs field vs inherited field
- [ ]  GC concept note: explain reachability in your own words (5 bullets)

### Optional micro-build (30–60 min)

- [ ]  “Budget calculator” as a single class + tests (no persistence)

---

## Cluster 2 — OOP + SOLID + Value Objects

### Theory checklist

- [ ]  Encapsulation, inheritance, polymorphism, abstraction
- [ ]  Overriding vs overloading
- [ ]  Interface vs abstract class
- [ ]  Association vs composition
- [ ]  SOLID
- [ ]  Cohesion and coupling
- [ ]  Value Objects

### Exercise set

- [ ]  Create hierarchy Person → Student/Teacher + polymorphism demo
- [ ]  Implement 2 immutable VOs (Email, ISBN) with validation + tests
- [ ]  Replace inheritance with composition in a small example (explain why)
- [ ]  Write one “god class” then refactor into SRP classes
- [ ]  Design `NotificationService` using interface + implementations
- [ ]  Cohesion check: split a class that does 3 responsibilities
- [ ]  SOLID drill: for each principle, write 1 sentence + 1 refactor example

### Optional micro-build

- [ ]  “Library core rules” (borrow/return) using only in-memory lists + tests

---

## Cluster 3 — Collections + Comparator + Big-O + Iteration

### Theory checklist

- [ ]  List/Set/Map
- [ ]  ArrayList/HashSet/HashMap
- [ ]  Iteration styles
- [ ]  Comparator/Comparable
- [ ]  Big-O (concept)

### Exercise set

- [ ]  Remove duplicates 3 ways (Set, loop, stream later) and compare
- [ ]  Sort objects by 2 fields using Comparator
- [ ]  Group and count words using Map
- [ ]  Build frequency table (Map) + return top N sorted
- [ ]  Implement “two-sum” (Big-O discussion)
- [ ]  Iterator removal exercise (safe remove while iterating)
- [ ]  Comparable vs Comparator: implement both for same object

### Optional micro-build

- [ ]  “Log summary” from a list of strings (no file I/O)

---

## Cluster 4 — Streams + Optional + Collectors

### Theory checklist

- [ ]  Lambdas, method references
- [ ]  Streams filter/map/collect
- [ ]  Optional
- [ ]  Collectors groupingBy/joining
- [ ]  First non-duplicate with streams

### Exercise set

- [ ]  Convert 2 loops into streams (keep it readable)
- [ ]  groupBy + count (Collectors)
- [ ]  joining strings with delimiters
- [ ]  first non-repeated character (streams)
- [ ]  Optional: rewrite a “null-check chain” into Optional safely
- [ ]  Pipeline drill: map → filter → collect into DTO-like objects

### Optional micro-build

- [ ]  “Recipe search” from a list of recipe objects (in-memory)

---

## Cluster 5 — Generics

### Theory checklist

- [ ]  `<T>`, `<K,V>`
- [ ]  Wildcards `extends/super`

### Exercise set

- [ ]  Generic `Mapper<A,B>` + 2 concrete mappers
- [ ]  Generic method `List<T> tail(List<T>, int n)`
- [ ]  Wildcards: method that reads `<? extends Number>`
- [ ]  Wildcards: method that writes to `<? super Integer>`
- [ ]  Generic DTO converter exercise (S->T)
- [ ]  Explain PECS in 3 bullets

### Optional micro-build

- [ ]  Small “utility library” module + tests

---

## Cluster 6 — Exceptions

### Theory checklist

- [ ]  Checked vs unchecked
- [ ]  try/catch/finally
- [ ]  throw vs throws
- [ ]  Custom exceptions

### Exercise set

- [ ]  Create 3 domain exceptions + use them in a small flow
- [ ]  Wrap lower exception with cause and preserve message
- [ ]  Convert “return null” API into exception-based API
- [ ]  Error messages: write clear messages (input + expected)
- [ ]  finally: resource closing demo (and note about try-with-resources)

### Optional micro-build

- [ ]  “Payment flow” with success/failure + tests

---

## Cluster 7 — Multithreading (basic)

### Theory checklist

- [ ]  What is a thread
- [ ]  Create threads using Thread
- [ ]  Create threads using Runnable

### Exercise set

- [ ]  Run 3 tasks in parallel and wait (join)
- [ ]  Shared counter race condition demo (then fix with synchronized — optional note)
- [ ]  Runnable vs Thread: same task implemented both ways
- [ ]  Explain what “non-deterministic” means in 5 bullets

---

## Cluster 8 — Spring Boot Core (Web)

### Theory checklist

- [ ]  Project structure
- [ ]  Controllers/endpoints
- [ ]  Services/business rules
- [ ]  Repositories
- [ ]  @RestController vs @Controller
- [ ]  @Component vs @Service vs @Repository
- [ ]  How @SpringBootApplication works

### Exercise set (tiny APIs)

- [ ]  Create 1 controller with 2 endpoints (GET/POST)
- [ ]  Move logic from controller → service
- [ ]  Repository stub (in-memory) + swap later
- [ ]  Explain each stereotype annotation in 1 sentence

---

## Cluster 9 — DTO + Validation + ResponseEntity + Global Errors

### Theory checklist

- [ ]  @RequestBody
- [ ]  @PathVariable
- [ ]  Bean Validation annotations
- [ ]  @Valid
- [ ]  ResponseEntity
- [ ]  @ControllerAdvice
- [ ]  @ExceptionHandler
- [ ]  Error response structure

### Exercise set

- [ ]  Build request/response DTOs (no entities in controller)
- [ ]  Add validation rules + test error responses manually
- [ ]  Create global handler + standard error JSON
- [ ]  Return correct status codes for 3 cases (400/404/409)

---

## Cluster 10 — Spring Data JPA (Entities/Relationships/Queries/Pagination)

### Theory checklist

- [ ]  @Entity/@Id/@GeneratedValue
- [ ]  OneToMany/ManyToOne/ManyToMany
- [ ]  Lazy vs eager
- [ ]  Query methods
- [ ]  JPQL basics
- [ ]  Pageable + Sort

### Exercise set

- [ ]  Create 3 entities with 2 relationships
- [ ]  Add 2 query methods + 1 JPQL query
- [ ]  Add pageable listing + sorting
- [ ]  Explain lazy vs eager with 1 example each

---

## Cluster 11 — Security (JWT + Roles)

### Theory checklist

- [ ]  Authentication vs Authorization
- [ ]  Roles
- [ ]  JWT basics
- [ ]  Filters concept

### Exercise set

- [ ]  Login endpoint returns token
- [ ]  One public route + one protected route
- [ ]  Role restriction on 1 endpoint
- [ ]  Explain token flow in 5 bullets

---

## Cluster 12 — SQL + Docker + Git

### SQL theory checklist

- [ ]  SELECT/INSERT/UPDATE/DELETE
- [ ]  WHERE
- [ ]  JOINs
- [ ]  GROUP BY
- [ ]  PK vs FK
- [ ]  Indexes

### SQL practice checklist

- [ ]  Write 10 queries from scratch
- [ ]  Create tables + relationships

### Docker theory checklist

- [ ]  Dockerfile
- [ ]  Docker Compose (Postgres)
- [ ]  `.env`

### Docker practice checklist

- [ ]  Bring up full local environment

### Git theory checklist

- [ ]  add/commit/push/pull
- [ ]  branches
- [ ]  PR
- [ ]  conflicts
- [ ]  Conventional Commits

### Git practice checklist

- [ ]  Create a PR explaining changes
- [ ]  Use Conventional Commits correctly

---

## Cluster 13 — Extras (Polish)

### Theory checklist

- [ ]  SLF4J logging
- [ ]  Simple uploads
- [ ]  Sending emails
- [ ]  External API integration
- [ ]  Simple deploy (Render/Railway)

### Practice checklist

- [ ]  Small external integration module
- [ ]  Scheduled job with @Scheduled
- [ ]  Standardized logs

---

# Add-on Cluster — Testing (recommended to be “above junior”)

- [ ]  JUnit 5: assertions, lifecycle, parameterized tests
- [ ]  Mockito: mock/stub/verify
- [ ]  Spring tests: @WebMvcTest, @DataJpaTest, @SpringBootTest
- [ ]  Practice: write tests for at least 2 exercises in each cluster

---
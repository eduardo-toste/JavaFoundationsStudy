## 🧠 Fundamentos da Linguagem Java

- [x]  Tipos primitivos vs Wrappers (`int` vs `Integer`)
- [x]  Operadores lógicos, relacionais e aritméticos
- [x]  Controle de fluxo (`if`, `switch`, `for`, `while`, `do-while`)
- [x]  Diferença entre `==` e `.equals()`
- [x]  Diferença entre `String`, `StringBuilder`, `StringBuffer`
- [x]  Diferença entre `double`, `float` e `BigDecimal`
- [x]  Arrays (criação, iteração, ordenação)
- [x]  Varargs e sobrecarga de métodos
- [x]  Palavras-chave: `final`, `static`, `this`, `super`
- [x]  Modificadores de acesso: `public`, `private`, `protected`, `default`
- [x]  Package e organização de classes

---

## 🧱 Orientação a Objetos (OOP)

- [x]  Conceitos: Encapsulamento, Herança, Polimorfismo, Abstração
- [x]  Criação de classes, atributos e construtores
- [x]  Sobrecarga e sobrescrita de métodos (`@Override`)
- [x]  Uso e diferenças entre `interface` e `abstract class`
- [x]  Composição, associação e herança entre classes
- [x]  Princípios SOLID com exemplos práticos
- [x]  Design Patterns: Singleton, Factory, Strategy, Observer, Builder

---

## 🧩 Tratamento de Exceções

- [ ]  Blocos `try-catch-finally`
- [ ]  Diferença entre `throw` e `throws`
- [ ]  Exceções verificadas vs não verificadas
- [ ]  Criação de exceções personalizadas
- [ ]  Uso do `finally` mesmo após `return`
- [ ]  Tratamento global com `@ControllerAdvice`, `@ExceptionHandler`
- [ ]  Padronização de erros com estrutura (timestamp, status, path, message)
- [ ]  RFC 7807 (problema+json) — opcional

---

## 🧰 Collections e Generics

- [ ]  Interfaces: `List`, `Set`, `Map`, `Queue`
- [ ]  Implementações: `ArrayList`, `LinkedList`, `HashSet`, `TreeSet`, `HashMap`, `TreeMap`, `PriorityQueue`
- [ ]  Iteração com `for`, `forEach`, `iterator`
- [ ]  Generics: `<T>`, `<K, V>`, métodos genéricos
- [ ]  Ordenação com `Comparator`, `Comparable`
- [ ]  Estruturas imutáveis com `Collections.unmodifiableList()`

---

## 🧪 Java Moderno (Java 8+)

- [ ]  Lambda expressions
- [ ]  Method references
- [ ]  Streams API: `filter`, `map`, `collect`, `sorted`, `distinct`, `limit`
- [ ]  `Collectors.toList()`, `joining()`, `groupingBy()`, `counting()`
- [ ]  `Optional` com encadeamentos seguros
- [ ]  API de datas: `LocalDate`, `LocalDateTime`, `Period`, `Duration`
- [ ]  `var` (Java 10+)
- [ ]  `Record` (Java 14+)
- [ ]  Parallel Streams (e cuidados com concorrência)

---

## 🌱 Spring / Spring Boot

### ⚙️ Fundamentos

- [ ]  Estrutura de um projeto Spring Boot
- [ ]  `@RestController`, `@GetMapping`, `@PostMapping`, etc.
- [ ]  `@Service`, `@Repository`, `@Autowired`
- [ ]  `@RequestBody`, `@PathVariable`, `@Valid`
- [ ]  Separação clara entre camadas

### 📦 Spring Data JPA

- [ ]  `@Entity`, `@Id`, `@GeneratedValue`
- [ ]  Relacionamentos: `@OneToMany`, `@ManyToOne`, `@JoinColumn`
- [ ]  Lazy vs Eager loading
- [ ]  Query Methods, `@Query`, Projections
- [ ]  Paginação e ordenação (`Pageable`, `Sort`)
- [ ]  Specification API ou Criteria API

### 📜 Validações e Boas práticas

- [ ]  Bean Validation (`@NotBlank`, `@Email`, etc.)
- [ ]  `@ControllerAdvice` para erros globais
- [ ]  DTO + Mapper (`ModelMapper`, `MapStruct`, manual)
- [ ]  Padronização de resposta (`ResponseEntity<>`, DTO de erro)
- [ ]  Separação por módulos ou `package-by-feature`

### 🗂️ Configurações

- [ ]  `application.yml` e `application.properties`
- [ ]  Perfis com `@Profile`
- [ ]  `@ConfigurationProperties`
- [ ]  Externalização com variáveis de ambiente

### 🧪 Testes Spring

- [ ]  `@SpringBootTest`, `@DataJpaTest`
- [ ]  MockMvc para endpoints
- [ ]  TestContainers com PostgreSQL ou MongoDB
- [ ]  Coverage com JaCoCo + badge no GitHub

---

## 🔐 Spring Security

- [ ]  Conceitos básicos de autenticação e autorização
- [ ]  JWT: geração, validação e autenticação
- [ ]  Refresh Token
- [ ]  Filtros personalizados (`OncePerRequestFilter`)
- [ ]  Proteção baseada em roles
- [ ]  OAuth2 básico (Google, GitHub)

---

## 🗄️ Banco de Dados

- [ ]  SQL: `SELECT`, `INSERT`, `UPDATE`, `DELETE`
- [ ]  Cláusulas: `WHERE`, `JOIN`, `GROUP BY`, `ORDER BY`, `HAVING`
- [ ]  `INNER`, `LEFT`, `RIGHT JOIN`
- [ ]  Transações com `@Transactional`
- [ ]  Banco em memória (H2)
- [ ]  Versionamento com Flyway
- [ ]  Indexação, performance e normalização (nível básico)
- [ ]  MongoDB (NoSQL)

---

## 🌐 APIs REST

- [ ]  Verbos HTTP (GET, POST, PUT, PATCH, DELETE)
- [ ]  Status codes: 200, 201, 204, 400, 401, 403, 404, 409, 500
- [ ]  Versionamento de rotas
- [ ]  Documentação com Swagger/OpenAPI
- [ ]  DTOs e ResponseEntity corretamente usados
- [ ]  OpenAPI com `@Schema`, `@Operation`, `@Tag`

---

## 🧪 Testes (JUnit + Mockito)

- [ ]  JUnit 5: `@Test`, `@BeforeEach`, `assertEquals`, `assertThrows`
- [ ]  Mockito: `@Mock`, `@InjectMocks`, `when`, `verify`
- [ ]  Testes de integração com `@SpringBootTest`
- [ ]  MockMvc com validações
- [ ]  Teste de exceções personalizadas
- [ ]  Testes de repositório com banco real (ou TestContainers)

---

## 🐳 Docker e DevOps

- [ ]  Dockerfile para apps Spring Boot
- [ ]  Docker Compose com PostgreSQL
- [ ]  Volumes e variáveis de ambiente
- [ ]  `.env` + docker-compose override
- [ ]  Deploy com JAR + container
- [ ]  Conceitos básicos de CI/CD

---

## 🐙 Git e GitHub

- [ ]  Comandos: `clone`, `add`, `commit`, `push`, `pull`, `checkout`, `merge`
- [ ]  Fluxo de branches (`main`, `feature/*`, `hotfix/*`)
- [ ]  Resolução de conflitos simples
- [ ]  Pull Requests e revisão de código
- [ ]  Rebase interativo
- [ ]  Conventional Commits
- [ ]  README completo com instruções de execução

---

## 🧭 Arquitetura e Práticas Avançadas

- [ ]  Clean Architecture / Hexagonal (nível introdutório)
- [ ]  DDD básico: Entidade, Value Object, Aggregate, Repositório
- [ ]  Camadas: Domain, Application, Infrastructure
- [ ]  Eventos com `ApplicationEventPublisher`
- [ ]  `@Async` e execução paralela
- [ ]  `@Cacheable` e caching local
- [ ]  Retry com Spring Retry ou Resilience4j

---

## ✨ Extras para se destacar

- [ ]  Agendamento com `@Scheduled`
- [ ]  Envio de e-mail com `JavaMailSender` + Thymeleaf
- [ ]  Integração com APIs reais (Clima, CEP, Google Calendar)
- [ ]  Geração de PDF ou CSV
- [ ]  Upload de arquivos
- [ ]  Log estruturado com SLF4J e Logback
- [ ]  API monitorada com Spring Actuator
- [ ]  Projeto deployado publicamente (Render, Railway)

---

> 📌 Recomendação final: mantenha 1 ou 2 projetos públicos no GitHub que demonstrem sua evolução, organização, testes, arquitetura e documentação. Isso é o que mais impressiona recrutadores técnicos.
>
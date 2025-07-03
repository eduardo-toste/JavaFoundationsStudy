# Java Foundations Study

## 🏗️ Nível 1 — Fundamentos

### 🔢 Lógica de Programação

- [ ]  Entender tipos de dados (inteiros, floats, strings, booleanos, etc.)
- [ ]  Declarar e utilizar variáveis
- [ ]  Operadores de atribuição, aritméticos, comparação e lógicos
- [ ]  Estruturas condicionais (`if`, `else`, `switch`)
- [ ]  Estruturas de repetição (`for`, `while`, `do-while`)
- [ ]  Criar e utilizar funções/métodos (com parâmetros e retorno)
- [ ]  Resolver problemas simples aplicando algoritmos
- [ ]  Algoritmos clássicos (máximo, mínimo, soma, média, ordenação simples)

### ☕ Java — Fundamentos da Linguagem

- [ ]  Sintaxe básica
- [ ]  Tipos primitivos e variáveis
- [ ]  Operadores
- [ ]  Controle de fluxo (`if`, `else`, `switch`)
- [ ]  Estruturas de repetição (`while`, `for`, `do-while`, `foreach`)
- [ ]  Métodos: declaração, parâmetros e retorno
- [ ]  Arrays, listas e manipulação básica de coleções
- [ ]  Obter dados de uma API (usando `HttpURLConnection` ou bibliotecas como `HttpClient`)
- [ ]  Criar e utilizar construtores

### 🧠 Orientação a Objetos (POO)

- [ ]  Entender o conceito de classes e objetos
- [ ]  Criar classes e objetos
- [ ]  Utilizar construtores
- [ ]  Criar e utilizar métodos de instância
- [ ]  Encapsulamento (getters/setters)
- [ ]  Herança
- [ ]  Polimorfismo (sobrecarga e sobrescrita)
- [ ]  Abstração
- [ ]  Interfaces
- [ ]  Classes abstratas

### 🛠️ Manipulação de Erros

- [ ]  Uso de `try`, `catch`, `finally`
- [ ]  Tratamento de exceções (`Exception`, `RuntimeException`)
- [ ]  Criar exceções personalizadas
- [ ]  Lançar exceções (`throw`)
- [ ]  Depuração (debug) no ambiente de desenvolvimento

### 📦 Coleções em Java

- [ ]  List, Set e Map — diferenças e usos
- [ ]  ArrayList, LinkedList, HashSet, TreeSet, HashMap, TreeMap
- [ ]  Iteradores (`for`, `foreach`, `Iterator`, `Stream API`)
- [ ]  Entender `equals()` e `hashCode()`
- [ ]  Classes Wrapper (`Integer`, `Double`, `Boolean`, etc.)

### ✅ Testes em Java

- [ ]  Testes unitários (JUnit)
- [ ]  Testes de integração
- [ ]  Testes de comportamento (BDD) com Mockito ou similares
- [ ]  Criação e uso de Mocks

### 📁 Organização com Pacotes

- [ ]  Criar pacotes (`package`)
- [ ]  Usar `import`
- [ ]  Conhecer pacotes fundamentais (`java.lang`, `java.io`, etc.)
- [ ]  Entender imutabilidade (ex.: classe `String`)
- [ ]  Entender a classe `java.lang.Object` e seus métodos (`toString()`, `equals()`, `hashCode()`)

### 🔗 Estruturas de Dados

- [ ]  Conhecer e implementar:
    - Listas
    - Pilhas
    - Filas
    - Árvores
    - Grafos (básico)
    - Hash Tables (Mapas)
- [ ]  Complexidade de algoritmos (Big O)

---

## 🚀 Nível 2 — Desenvolvimento Backend com Java

### 🔥 JVM (Java Virtual Machine)

- [ ]  Entender o funcionamento da JVM
- [ ]  Ciclo de vida de execução de um programa Java
- [ ]  Bytecode
- [ ]  JIT Compiler
- [ ]  ClassLoader

### ♻️ Gerenciamento de Memória

- [ ]  Stack vs Heap
- [ ]  Garbage Collector
- [ ]  Fugas de memória (Memory Leaks) e como evitá-las

### 🌱 Spring Framework

- [ ]  Inversão de Controle (IoC)
- [ ]  Injeção de Dependências (DI)
- [ ]  Spring MVC (Controllers, Services, Repositories)
- [ ]  Spring Data JPA (acesso a dados)
- [ ]  Tratamento de exceções
- [ ]  Validações (`@Valid`, `@NotNull`, etc.)

### 🚀 Spring Boot

- [ ]  Criar aplicações standalone
- [ ]  Usar servidores embutidos (Tomcat, Jetty)
- [ ]  Configuração simplificada via `application.properties` ou `application.yml`
- [ ]  Gerenciamento de dependências via `starter`

### 🔨 Build Tools

- [ ]  Maven — entender `pom.xml`
- [ ]  Gradle — entender `build.gradle`
- [ ]  Automação de builds, testes e deploys

### 💾 Persistência de Dados

- [ ]  JDBC (conexão direta)
- [ ]  JPA e Hibernate
- [ ]  Spring Data JPA
- [ ]  Relacionamentos (`@OneToOne`, `@OneToMany`, `@ManyToMany`)
- [ ]  Fetch Types (`EAGER` vs `LAZY`)
- [ ]  Query Methods e JPQL
- [ ]  Encapsular acesso com DAO ou Repository

---

## 🏛️ Nível 3 — Avançado

### 🔗 Arquitetura de Microsserviços

- [ ]  Conceitos de microsserviços
- [ ]  API Gateway
- [ ]  Comunicação síncrona (HTTP, REST)
- [ ]  Comunicação assíncrona (mensageria)
- [ ]  Balanceamento de carga
- [ ]  Escalabilidade horizontal
- [ ]  Observabilidade (logs, traces, métricas)

### 🧵 Concorrência em Java

- [ ]  Threads e processos
- [ ]  `Runnable` e `Callable`
- [ ]  `ExecutorService` e pools de threads
- [ ]  Concorrência com `synchronized`, `Locks` e `Atomic`
- [ ]  Problemas clássicos: deadlocks, race conditions

### 📦 Contêineres

- [ ]  Conceitos de contêinerização
- [ ]  Docker — construir, executar e gerenciar contêineres
- [ ]  Docker Compose
- [ ]  Kubernetes — conceitos básicos (Pods, Deployments, Services)

### 📨 Kafka (Mensageria)

- [ ]  Conceitos de mensageria
- [ ]  Criar Producers e Consumers
- [ ]  Garantias de entrega (at least once, at most once, exactly once)
- [ ]  Partições, tópicos e offset
- [ ]  Integração de microsserviços usando Kafka

---

## ☁️ Habilidades de Infraestrutura

### 🧠 Git & GitHub

- [ ]  Criar e clonar repositórios
- [ ]  Commit, Push, Pull
- [ ]  Branches e Pull Requests
- [ ]  Resolver conflitos de merge
- [ ]  Versionamento semântico

### 🌐 HTTP

- [ ]  Entender requisições e respostas HTTP
- [ ]  Verbos HTTP (GET, POST, PUT, DELETE, PATCH)
- [ ]  Status Codes
- [ ]  Testar APIs com Postman, Insomnia ou curl

### 📄 JSON

- [ ]  Criar objetos JSON
- [ ]  Serialização e desserialização (com Gson, Jackson, etc.)
- [ ]  Manipulação de dados JSON

### 💻 Linha de Comando

- [ ]  Comandos básicos (cd, ls, mkdir, rm, mv, cp, etc.)
- [ ]  Redirecionamento e pipes
- [ ]  Manipular arquivos
- [ ]  Usar `wget`, `curl`

### ☁️ Cloud

- [ ]  Conceitos de IaaS, PaaS e SaaS
- [ ]  Conhecer AWS, Azure ou GCP
- [ ]  Usar serviços básicos: EC2, S3, RDS (ou equivalentes)
- [ ]  Deploy em nuvem (Docker + Cloud)

### 🗄️ SQL

- [ ]  CRUD básico (`SELECT`, `INSERT`, `UPDATE`, `DELETE`)
- [ ]  `JOIN` (INNER, LEFT, RIGHT, FULL)
- [ ]  Ordenação (`ORDER BY`), agrupamento (`GROUP BY`)
- [ ]  Funções agregadas (`SUM()`, `AVG()`, `COUNT()`)
- [ ]  Subqueries

---

## 🏅 Boas Práticas e Arquitetura

### 🧠 SOLID

- [ ]  Entender e aplicar os 5 princípios SOLID

### 🏛️ Clean Architecture

- [ ]  Camadas de entidade, caso de uso, interface, frameworks
- [ ]  Separação de responsabilidades
- [ ]  Independência de frameworks e UI

### 🎨 Design Patterns

- [ ]  Singleton
- [ ]  Factory
- [ ]  Strategy
- [ ]  Observer
- [ ]  Builder
- [ ]  Adapter
- [ ]  Decorator
- [ ]  Command
- [ ]  Outros padrões relevantes

### 🧽 Clean Code

- [ ]  Escrever código limpo e legível
- [ ]  Refatoração constante
- [ ]  Nomeação clara de variáveis e métodos
- [ ]  Reduzir complexidade

### 🏗️ DDD — Domain-Driven Design

- [ ]  Modelagem do domínio
- [ ]  Entidades, Value Objects, Aggregates, Services
- [ ]  Repositórios e Fábricas
- [ ]  Ubiquitous Language (linguagem onipresente)
- [ ]  Estratégias para contextos delimitados (Bounded Context)

---

Se quiser, posso transformar esse checklist em PDF, README ou template para Notion. É só pedir! 🚀
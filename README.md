### *Inclui teoria, prática e critérios de conclusão para estudo eficiente*

---

# 📘 Como usar este guia

Para marcar um item como concluído, você deve:

1. Entender a teoria ✔️
2. Resolver ao menos 1 exercício isolado ✔️
3. Aplicar no seu projeto (FightHub ou outro) ✔️
4. Conseguir explicar em 30–60 segundos ✔️

Se 1 desses faltar → NÃO marque ainda.

---

# 🔷 MÓDULO 1 — Fundamentos de Java + OOP

## 1.1 Fundamentos da Linguagem Java

### O que estudar (teoria)

- [ ]  Tipos primitivos e Wrappers
- [ ]  Autoboxing e Unboxing
- [ ]  Diferença entre `==` e `.equals()`
- [ ]  Strings (imutabilidade, StringBuilder)
- [ ]  BigDecimal
- [ ]  Controle de fluxo
- [ ]  Arrays e varargs
- [ ]  final, static, this, super
- [ ]  Modificadores de acesso
- [ ]  Organização de pacotes
- [ ]  Static Binding vs Dynamic Binding
- [ ]  Shadowing e escopo
- [ ]  Garbage Collector (conceito)

### O que praticar

- [ ]  Criar pequenos programas para comparar Strings e wrappers
- [ ]  Implementar operações com BigDecimal
- [ ]  Ordenar, filtrar e manipular arrays manualmente
- [ ]  Demonstrar static binding vs dynamic binding com herança

### Aplicação no projeto

- [ ]  Melhorar Value Objects (CPF, Email, Password) usando imutabilidade
- [ ]  Aplicar boas práticas de equals/hashCode em entidades

---

## 1.2 Orientação a Objetos (OOP)

### O que estudar (teoria)

- [ ]  Encapsulamento, Herança, Polimorfismo, Abstração
- [x]  Sobrescrita e sobrecarga
- [ ]  Interface vs abstract class
- [ ]  Associação e composição
- [ ]  SOLID
- [ ]  Coesão e acoplamento
- [ ]  Value Objects

### O que praticar

- [ ]  Criar hierarquias simples (Pessoa → Aluno/Professor)
- [ ]  Criar Value Objects imutáveis
- [ ]  Refatorar classes do seu projeto aplicando SOLID

### Aplicação no projeto

- [ ]  Melhorar entidades do FightHub aplicando coesão e composição
- [ ]  Extrair regras para classes específicas (SRP)

---

# 🔷 MÓDULO 2 — Collections, Streams e Generics

## 2.1 Collections

### O que estudar

- [ ]  List, Set, Map
- [ ]  ArrayList, HashSet, HashMap
- [ ]  Iteração (`for`, `forEach`, `iterator`)
- [ ]  Comparator e Comparable
- [ ]  Big-O (conceito)

### O que praticar

- [ ]  Remover duplicados, ordenar e agrupar listas
- [ ]  Criar lista de objetos e ordenar por 2 campos

### Aplicação no projeto

- [ ]  Melhorar listagens usando Collections corretas
- [ ]  Refatorar lógica repetitiva com Collections

---

## 2.2 Streams + Java 8

### O que estudar

- [ ]  Lambda expressions
- [ ]  Method references
- [ ]  Streams: filter, map, collect
- [ ]  Optional
- [ ]  Collectors: groupingBy, joining
- [ ]  Resolver problemas com Streams (como first non-duplicate)

### O que praticar

- [ ]  Resolver o problema:
  “Primeiro caractere não repetido usando Stream API”
- [ ]  Criar pipelines com map → filter → collect
- [ ]  Agrupar e contar itens usando groupingBy

### Aplicação no projeto

- [ ]  Refatorar consultas e transformações de listas com Streams

---

## 2.3 Generics

### O que estudar

- [ ]  `<T>`, `<K, V>`
- [ ]  Wildcards: `<? extends T>`, `<? super T>`

### O que praticar

- [ ]  Criar métodos genéricos utilitários
- [ ]  Implementar DTO converters genéricos simples

### Aplicação no projeto

- [ ]  Usar generics para evitar duplicação em mapeadores

---

# 🔷 MÓDULO 3 — Exceções + Multithreading

## 3.1 Exceções

### O que estudar

- [ ]  Checked vs Unchecked
- [ ]  try-catch-finally
- [ ]  throw vs throws
- [ ]  Custom Exceptions

### O que praticar

- [ ]  Criar exceções personalizadas
- [ ]  Lançar e tratar exceções corretamente

### Aplicação no projeto

- [ ]  Criar exceções específicas para domínios (ex: MatriculaNaoEncontradaException)
- [ ]  Garantir mensagens claras em erros

---

## 3.2 Multithreading (básico)

### O que estudar

- [ ]  O que é uma thread
- [ ]  Criar threads usando Thread
- [ ]  Criar threads usando Runnable

### O que praticar

- [ ]  Criar tarefa paralela simples (ex: simular envio async)

### Aplicação no projeto

- [ ]  Avaliar se alguma lógica poderia ser async
- [ ]  Usar @Async (opcional)

---

# 🔷 MÓDULO 4 — Spring Boot (Core)

## 4.1 Fundamentos

### O que estudar

- [x]  Estrutura do projeto
- [x]  Controllers e endpoints
- [x]  Services e regras de negócio
- [x]  Repositories
- [ ]  @RestController vs @Controller
- [ ]  @Component vs @Service vs @Repository
- [ ]  Como @SpringBootApplication funciona

### O que praticar

- [x]  Criar endpoints CRUD completos com DTOs
- [x]  Testar tudo no Postman/Insomnia

### Aplicação no projeto

- [x]  Refatorar controllers para limpar regras de negócio
- [x]  Padronizar camadas

---

## 4.2 DTO + Validação

### O que estudar

- [x]  @RequestBody
- [x]  @PathVariable
- [x]  Bean Validation: @NotBlank, @Email, @Pattern, etc.
- [x]  @Valid
- [ ]  ResponseEntity

### O que praticar

- [x]  Criar DTO de request e response
- [x]  Validar entrada do usuário
- [x]  Testar respostas de erro e sucesso

### Aplicação no projeto

- [ ]  Criar DTOs para módulos antigos
- [ ]  Centralizar validações

---

## 4.3 Tratamento Global de Erros

### O que estudar

- [ ]  @ControllerAdvice
- [ ]  @ExceptionHandler
- [ ]  Estrutura de erro

### O que praticar

- [ ]  Criar error handler global
- [ ]  Criar formato padrão para respostas de erro

### Aplicação no projeto

- [ ]  Padronizar exceptions em todo o FightHub

---

# 🔷 MÓDULO 5 — Spring Data JPA

## 5.1 Entidades e Relacionamentos

### O que estudar

- [ ]  @Entity, @Id, @GeneratedValue
- [ ]  Relacionamentos: OneToMany, ManyToOne, ManyToMany
- [ ]  Lazy vs Eager

### O que praticar

- [x]  Criar novas entidades
- [x]  Implementar relacionamento real

### Aplicação no projeto

- [x]  Revisar modelos antigos do FightHub
- [ ]  Ajustar relacionamentos incorretos

---

## 5.2 Queries e Paginação

### O que estudar

- [ ]  Query Methods
- [ ]  JPQL básico
- [ ]  Pageable e Sort

### O que praticar

- [ ]  Criar filtros no repositório
- [ ]  Implementar paginação

### Aplicação no projeto

- [ ]  Criar listagens paginadas para turmas, alunos, professores

---

# 🔷 MÓDULO 6 — Segurança (nível júnior avançado)

## 6.1 Conceitos + JWT

### O que estudar

- [ ]  Autenticação vs Autorização
- [ ]  Roles
- [ ]  JWT básico
- [ ]  Filters (conceito geral)

### O que praticar

- [ ]  Implementar login + geração de token
- [ ]  Criar rota pública e rota protegida

### Aplicação no projeto

- [ ]  Consolidar seu módulo de JWT do FightHub

---

# 🔷 MÓDULO 7 — Banco de Dados + Docker + Git

## 7.1 SQL

### O que estudar

- [x]  SELECT, INSERT, UPDATE, DELETE
- [x]  WHERE
- [ ]  JOINs
- [ ]  Group By
- [ ]  PK vs FK
- [ ]  Índices

### O que praticar

- [ ]  Escrever consultas SQL do zero
- [ ]  Criar tabelas e testar relacionamentos

### Aplicação no projeto

- [ ]  Revisar queries e índices críticos

---

## 7.2 Docker

### O que estudar

- [ ]  Dockerfile
- [ ]  Docker Compose (Postgres)
- [x]  Variáveis `.env`

### O que praticar

- [ ]  Subir ambiente local completo

### Aplicação no projeto

- [ ]  Padronizar ambiente do FightHub com Docker

---

## 7.3 Git e GitHub

### O que estudar

- [x]  add, commit, push, pull
- [x]  Branches
- [x]  PR
- [x]  Resolução de conflitos
- [x]  Conventional Commits

### O que praticar

- [ ]  Criar PR explicando mudanças
- [ ]  Usar conventional commits corretamente

### Aplicação no projeto

- [ ]  Padronizar workflow no FightHub

---

# 🔷 MÓDULO 8 — Extras que destacam um júnior

### O que estudar

- [ ]  Logs com SLF4J
- [ ]  Uploads simples
- [ ]  Envio de e-mail
- [ ]  Integração com APIs externas
- [ ]  Deploy simples (Render/Railway)

### O que praticar

- [ ]  Criar pequeno módulo de integração externa
- [ ]  Criar job com @Scheduled
- [ ]  Criar logs padronizados

---

# FIM DO GUIA
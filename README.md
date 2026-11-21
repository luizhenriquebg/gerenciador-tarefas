# Gerenciador de Tarefas API
 
API REST de gerenciamento de tarefas feita com **Java e Spring Boot**. Permite criar, listar, buscar, concluir e apagar tarefas, com validação dos dados de entrada e tratamento de erros padronizado.
 
Este foi o meu primeiro projeto com Spring Boot, criado para praticar a arquitetura em camadas e os conceitos básicos de uma API REST.
 
## Tecnologias
 
- Java
- Spring Boot 3
- Spring Web
- Spring Data JPA (Hibernate)
- Bean Validation
- MySQL
- Maven
- Postman (testes manuais)
## Funcionalidades
 
- Cadastro de tarefas com validação de título
- Listagem de todas as tarefas
- Busca de tarefa por id
- Marcar tarefa como concluída
- Exclusão de tarefa
- Tratamento global de erros com retorno **404** para tarefa não encontrada
## Estrutura do projeto
 
```
src/main/java/com/henrique/gerenciador_tarefas/
├── controller/    # Endpoints da API
├── service/       # Regras de negócio
├── repository/    # Acesso ao banco (Spring Data JPA)
├── model/         # Entidades (Tarefa)
├── exception/     # Exceção personalizada e handler global
└── GerenciadorTarefasApplication.java
```
 
Fluxo de uma requisição:
 
```
Cliente → Controller → Service → Repository → MySQL
```
 
## Endpoints
 
| Método | URL | Descrição |
|--------|-----|-----------|
| `GET` | `/tarefas` | Lista todas as tarefas |
| `POST` | `/tarefas` | Cria uma nova tarefa |
| `GET` | `/tarefas/{id}` | Busca uma tarefa pelo id |
| `PATCH` | `/tarefas/{id}/concluir` | Marca a tarefa como concluída |
| `DELETE` | `/tarefas/{id}` | Apaga a tarefa |
 
### Exemplo: criar tarefa
 
**Requisição**
 
```http
POST /tarefas
Content-Type: application/json
```
 
```json
{
  "titulo": "Estudar Spring"
}
```
 
**Resposta**
 
```json
{
  "id": 1,
  "titulo": "Estudar Spring",
  "concluida": false
}
```
 
### Validação
 
O título é obrigatório e deve ter entre 3 e 100 caracteres. Se não cumprir essas regras, a API responde com **400 Bad Request**.
 
### Tarefa não encontrada
 
Buscar, concluir ou apagar um id inexistente retorna **404 Not Found**:
 
```
Tarefa não encontrada com o id 99
```
 
## O que aprendi
 
- Arquitetura em camadas (controller, service, repository)
- Injeção de dependência e beans do Spring
- Mapeamento de entidades com JPA
- Validação com `@Valid`, `@NotBlank` e `@Size`
- Tratamento global de exceções com `@RestControllerAdvice`
- Uso de variáveis de ambiente para não expor credenciais no Git
## Próximos passos
 
- Listar apenas tarefas concluídas
- Atualizar o título de uma tarefa
- Reabrir tarefa concluída
- Tratar erros de validação com mensagem personalizada
- Testes automatizados
- Autenticação
## Autor
 
**Luiz Henrique**
 
[LinkedIn](www.linkedin.com/in/luiz-henriquee1) • [GitHub](https://github.com/luizhenriquebg)
 

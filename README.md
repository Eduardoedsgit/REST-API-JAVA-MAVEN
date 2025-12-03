ESTRUTURA DO PROJETO

cadastro-funcionarios/
├── src/main/java/com/funcionarios/
│   ├── controller/
│   │   └── FuncionarioController.java
│   ├── dto/
│   │   ├── FuncionarioRequest.java
│   │   ├── FuncionarioUpdateRequest.java
│   │   └── FuncionarioResponse.java
│   ├── exception/
│   │   ├── ApiExceptionHandler.java
│   │   ├── FuncionarioNaoEncontradoException.java
│   │   ├── FuncionarioJaExisteException.java
│   │   └── ErroApi.java
│   ├── model/
│   │   └── Funcionario.java
│   ├── service/
│   │   ├── FuncionarioService.java
│   │   └── FuncionarioServiceImpl.java
│   └── CadastroFuncionariosApplication.java
└── src/main/resources/application.properties

SITE: https://start.spring.io

Configurações:

Project: Maven

Language: Java

Spring Boot: 3.x

Group: com.funcionarios

Artifact: cadastro-funcionarios

Java: 17

Dependências:

✔ Spring Web
✔ Lombok
✔ Validation

MÉTODOS
📌 POST – Cadastrar
ENDPOINT LINK: http://localhost:8080/api/funcionarios/cadastrar
CORPO:
{
  "nome": "Ana Souza",
  "cpf": "12345678901",
  "idade": 25,
  "cargo": "Atendente"
}


📌 GET – Buscar por id
ENDPOINT LINK: GET http://localhost:8080/api/funcionarios/buscar/1


📌 PUT – Alterar
ENDPOINT LINK: PUT http://localhost:8080/api/funcionarios/alterar

CORPO:
{
  "id": 1,
  "nome": "Ana Maria Souza",
  "idade": 26,
  "cargo": "Supervisora"
}


📌 DELETE – Deletar por id
ENDPOINT LINK: DELETE http://localhost:8080/api/funcionarios/deletar/1

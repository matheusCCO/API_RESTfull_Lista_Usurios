# TesteBackLovable

## Descrição

Este é um projeto backend desenvolvido em Spring Boot para gerenciar usuários. Ele fornece uma API RESTful simples para operações CRUD (Criar, Ler, Atualizar, Deletar) em usuários. O projeto foi criado para integrar com um frontend desenvolvido com Lovable.

## Tecnologias Utilizadas

- **Java**: 21
- **Spring Boot**: 4.0.3
- **Spring Data JPA**: Para persistência de dados
- **Spring Web**: Para criação da API REST
- **MySQL**: Banco de dados relacional
- **Maven**: Gerenciamento de dependências e build

## Pré-requisitos

Antes de executar o projeto, certifique-se de ter instalado:

- Java 21 ou superior
- Maven 3.6 ou superior
- MySQL Server

## Instalação

1. Clone o repositório:

   ```bash
   git clone <url-do-repositorio>
   cd testeBackLovable
   ```

2. Instale as dependências:
   ```bash
   mvn clean install
   ```

## Configuração

O projeto utiliza o arquivo `src/main/resources/application.properties` para configurações. As configurações padrão estão definidas para um banco MySQL local:

- **URL do Banco**: `jdbc:mysql://localhost:3306/banco_de_usuarios?createDatabaseIfNotExist=true&useSSL=false&serverTimezone=UTC`
- **Usuário**: `root`
- **Senha**: `root`

Certifique-se de que o MySQL esteja rodando e que as credenciais estejam corretas. Você pode alterar essas configurações no arquivo `application.properties` conforme necessário.

## Execução

Para executar a aplicação:

```bash
mvn spring-boot:run
```

Ou, se preferir usar o wrapper Maven:

```bash
./mvnw spring-boot:run  # Linux/Mac
mvnw.cmd spring-boot:run  # Windows
```

A aplicação será iniciada na porta 8080 por padrão.

## API Endpoints

A API fornece os seguintes endpoints para gerenciamento de usuários:

### GET /users

Retorna uma lista de todos os usuários.

**Resposta de Exemplo:**

```json
[
  {
    "id": 1,
    "nome": "João Silva",
    "email": "joao@example.com",
    "telefone": "123456789"
  }
]
```

### POST /users

Adiciona um novo usuário.

**Corpo da Requisição:**

```json
{
  "nome": "Maria Santos",
  "email": "maria@example.com",
  "telefone": "987654321"
}
```

**Resposta:** Retorna o usuário criado com ID gerado.

### DELETE /users/{id}

Remove um usuário pelo ID.

**Parâmetros:**

- `id`: ID do usuário a ser removido

## Estrutura do Projeto

```
src/
├── main/
│   ├── java/
│   │   └── testebacklovable/
│   │       └── com/
│   │           └── br/
│   │               └── testebacklovable/
│   │                   ├── TesteBackLovableApplication.java  # Classe principal
│   │                   ├── controller/
│   │                   │   └── UsuarioContorller.java        # Controller REST
│   │                   ├── model/
│   │                   │   └── Usuarios.java                 # Entidade Usuario
│   │                   └── repository/
│   │                       └── UsuarioRepository.java       # Repository JPA
│   └── resources/
│       └── application.properties                           # Configurações
└── test/
    └── java/
        └── testeBackLovable/
            └── com/
                └── br/
                    └── testeBackLovable/
                        └── TesteBackLovableApplicationTests.java  # Testes
```

## Testes

Para executar os testes:

```bash
mvn test
```

## Contribuição

1. Faça um fork do projeto
2. Crie uma branch para sua feature (`git checkout -b feature/nova-feature`)
3. Commit suas mudanças (`git commit -am 'Adiciona nova feature'`)
4. Push para a branch (`git push origin feature/nova-feature`)
5. Abra um Pull Request

## Licença

Este projeto não possui licença definida.

## Contato

Para dúvidas ou sugestões, entre em contato com o desenvolvedor.</content>
<parameter name="filePath">c:\Users\matheus_bandeira\Desktop\testeBackLovable\README.md

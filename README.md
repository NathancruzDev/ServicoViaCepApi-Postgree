# 🚀 Microsserviço de Gerenciamento de Clientes

Microsserviço Spring Boot para cadastro de clientes com **autocompletar de endereços via ViaCEP** e persistência em **PostgreSQL** , @falvojr desafio.

## 📋 Funcionalidades
- ✅ CRUD completo de clientes
- 🌍 Consulta automática de endereços via CEP
- 🗃️ Persistência em banco de dados PostgreSQL
- 🔍 Busca de clientes por ID ou listagem completa

## 🛠️ Tecnologias Utilizadas
- **Java 17**
- **Spring Boot 3.4.5**
- **PostgreSQL** (Banco de dados)
- **ViaCEP API** (Consulta de endereços)
- **JPA/Hibernate** (ORM)
- **Maven** (Gerenciamento de dependências)

  [![Ferramentas](https://skillicons.dev/icons?i=java,spring,postgresql,git)](https://skillicons.dev)

## 🔌 Endpoints da API

### 👤 Rotas de Clientes
| Método | Endpoint               | Descrição                              | 
|--------|------------------------|----------------------------------------|
| GET    | `/api/users/all`       | Lista todos os clientes                |
| GET    | `/api/users/{id}`      | Busca cliente por ID                   |
| POST   | `/api/users`           | Cadastra novo cliente                  |
| PUT    | `/api/users/{id}`      | Atualiza cliente existente             |
| DELETE | `/api/users/{id}`      | Remove cliente                         |

## 📦 Estrutura do Projeto
src/
├── main/
│ ├── java/
│ │ └── edu.desafio.dp/
│ │ ├── controller/ # Endpoints da minha API
│ │ ├── model/ # Entidades JPA
│ │ ├── repository/ # Interfaces do meu banco
│ │ └── service/ # Lógica de negócio com o model+viacep
│ └── resources/
│ └── application.properties # Configurações

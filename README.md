### Renata Hassum - [Linkedin](https://www.linkedin.com/in/renataviottohassumdev) | renatahassum@gmail.com

# Sobre o projeto DSProducts [![NPM](https://img.shields.io/npm/l/react)](https://github.com/RenataHassum/dsproducts_cassandradb_backend/blob/main/LICENSE)

DSProducts é uma aplicação que, utilizando o banco de dados Cassandra e sua linguagem CQL (Cassandra Query Language), oferece recursos completos de CRUD, gerenciamento e buscas personalizadas de produtos por nome do departamento e descrição.

O Cassandra é um banco de dados distribuído NoSQL altamente escalável e de alto desempenho, com arquitetura descentralizada e tolerante a falhas. Ele oferece flexibilidade no esquema dos dados, permitindo a adição dinâmica de campos aos registros, e é capaz de lidar com grandes volumes de dados e alta demanda de requisições, garantindo alta disponibilidade e confiabilidade.
Projeto proposto e desenvolvido no Workshop Spring Boot Cassandra pela instituição de ensino <a href="https://devsuperior.com.br/cursos"><img align="center" height="16" alt="DevSuperior" src="https://devsuperior.com.br/_next/static/images/logo-white-10059e26f600604a7b5bd7782ed7550c.svg"></a> 

# Teste as requisições no Postman Collection
#### Siga o passo a passo:
1) Faça o clone do projeto
```bash
# Pré-requisitos: Java 17 e banco de dados Cassandra em execução
# Certifique-se de que o banco de dados Cassandra esteja em execução antes de iniciar o projeto (Docker ou Instalação local)
# clonar repositório
git clone git@github.com:RenataHassum/dsproducts_cassandradb_backend.git

# entrar na pasta do projeto back end
cd dsproducts_cassandradb_backend
cd backend

# executar o projeto
./mvnw spring-boot:run
```
2) Clique no botão "Run in Postman"
3) Acesse a opção "View collection"
4) Teste as requisições conforme orientações abaixo
   
      [![Run in Postman](https://run.pstmn.io/button.svg)](https://app.getpostman.com/run-collection/22138191-5633071c-3e11-4b65-a3a7-9500b546afe0?action=collection%2Ffork&source=rip_markdown&collection-url=entityId%3D22138191-5633071c-3e11-4b65-a3a7-9500b546afe0%26entityType%3Dcollection%26workspaceId%3D41410ca3-f95f-4a1e-8084-2cb65e652f2b)

#### Não é necessário realizar a configuração de ambiente do projeto

## Department endpoints
`GET List departments / Department by ID`
- Retorna uma lista de departamentos
- Retorna informações de um departamento específico

`POST New department / PUT Update department / DELETE Delete department`
- Permite criar um novo departamento
- Permite atualizar um departamento específico
- Permite deletar um departamento específico

## Product endpoints
`GET Product by ID / Products by dept name / Products by description`
- Retorna informações de um produto específico

- Retorna uma lista de produtos que atendem aos critérios informados:
  - Nome do departamento do produto (opcional): Se não informado, será considerado o texto vazio
    
- Retorna uma lista de produtos que atendem aos critérios informados:
  - Trecho da descrição do produto (opcional): Se não informado, será considerado o texto vazio

# Tecnologias | Implantação em produção
- Java, Spring Boot, Spring Data Cassandra, API REST, Maven, Git
- Implantação Backend: Até o presente momento, o projeto não conta com a implementação no backend em uma plataforma de hospedagem
- Implantação banco de dados: Cassandra

# Técnicas | Competências
- Programação Orientada a Banco de Dados Colunar com Cassandra: Permite o desenvolvimento eficiente de sistemas utilizando a abordagem de modelagem de dados orientada a colunas com o banco de dados NoSQL Cassandra, por meio da linguagem de consulta CQL. Adequados para gerenciar grandes volumes de dados e de alta demanda.
- Arquitetura em Camadas: Utiliza uma estrutura organizada em camadas, proporcionando separação clara de responsabilidades e facilitando a manutenibilidade do sistema.
- Web Services RESTful: Implementa web services RESTful, seguindo o padrão DTO para transferência de dados.
- Operações CRUD completas: Realiza as operações completas de Criar, Ler, Atualizar, Excluir e Procurar.
- Tratamento de Exceções: Implementa mecanismos de tratamento de exceções, garantindo mensagens de erro claras para os usuários.
- Consultas com Cassandra Query Language (CQL): Realiza consultas no banco de dados Cassandra NoSQL, utilizando a linguagem de consulta CQL.

## Modelo Conceitual
![Modelo Conceitual](https://github.com/RenataHassum/assets/blob/main/dsproducts_cassandra_assets/modelo_conceitual.jpg?raw=true)

## Modelo de Agregados - NoSQL
![Modelo de Agregados](https://github.com/RenataHassum/assets/blob/main/dsproducts_cassandra_assets/modelo.jpg?raw=true)

## Padrão camadas
![Padrão camadas](https://github.com/RenataHassum/assets/blob/main/padrao_camadas.jpg?raw=true)

# Agradecimentos
<a href="https://devsuperior.com.br/cursos"><img align="center" height="16" alt="DevSuperior" src="https://devsuperior.com.br/_next/static/images/logo-white-10059e26f600604a7b5bd7782ed7550c.svg"></a> - Professor Nélio Alves

# Autora
### Renata Hassum - [Linkedin](https://www.linkedin.com/in/renataviottohassumdev) | renatahassum@gmail.com
Fico à disposição para qualquer esclarecimento, não hesite em me contatar

# Projeto de Gerenciamento de Estacionamento de Motos

## Descrição

Este projeto implementa um sistema de gerenciamento para estacionamentos de motos, permitindo a organização hierárquica de Galpões, Áreas, Corredores e Vagas, com foco principal no rastreamento e gerenciamento de Motos. O sistema visa fornecer uma forma clara de saber onde cada moto está estacionada atualmente e permitir operações CRUD (Criar, Ler, Atualizar, Deletar) sobre as entidades, com ênfase nas funcionalidades relacionadas às motos.

O fluxo de criação da estrutura do estacionamento é sequencial:
1.  Criar um Galpão.
2.  Criar uma Área, associando-a a um Galpão existente.
3.  Criar um Corredor, associando-o a uma Área existente.
4.  Criar uma Vaga, associando-a a um Corredor existente.
5.  Criar/Estacionar uma Moto, associando-a a uma Vaga disponível.

## Foco Principal: Gerenciamento de Motos

O sistema oferece funcionalidades robustas para o gerenciamento de motos, incluindo:

*   **Listar Todas as Motos (com Paginação):** Permite visualizar todas as motos cadastradas no sistema de forma paginada, otimizando a performance para grandes volumes de dados.
*   **Encontrar Moto por ID:** Busca e retorna os detalhes de uma moto específica através do seu identificador único.
*   **Atualizar Dados da Moto:** Permite modificar informações de uma moto existente (ex: modelo, placa, ano).
*   **Deletar Moto:** Remove uma moto do sistema (desvinculando-a da vaga que ocupava).

## Tecnologias Utilizadas

*   **Java:** Linguagem de programação principal.
*   **Spring Boot:** Framework para desenvolvimento rápido de aplicações Java robustas.
    *   Spring Web (MVC): Para construção de APIs RESTful.
    *   Spring Data JPA: Para persistência de dados e interação com o banco.
    *   Spring Validation: Para validação dos dados de entrada.
*   **H2 Database:** Banco de dados em memória, utilizado para desenvolvimento e testes. (Pode ser facilmente substituído por outros bancos como PostgreSQL, MySQL, etc.)
*   **Maven/Gradle:** Gerenciador de dependências e build do projeto.
*   **Springdoc OpenAPI (Swagger):** Para documentação interativa da API REST.


## Estrutura do Modelo de Dados

O sistema é modelado com as seguintes entidades principais:

*   **Galpao:** Representa a estrutura física maior do estacionamento (ex: endereço, nome). Contém múltiplas `Areas`.
*   **Area:** Uma subdivisão dentro de um `Galpao` (ex: Área Coberta, Área Descoberta). Contém múltiplos `Corredores`.
*   **Corredor:** Um caminho ou seção dentro de uma `Area`. Contém múltiplas `Vagas`.
*   **Vaga:** O local específico onde uma moto pode ser estacionada. Pode estar ocupada por uma `Moto` ou livre.
*   **Moto:** Representa a moto do cliente (ex: placa, modelo, marca, ano). Está associada a uma `Vaga` quando estacionada.

## Configuração e Execução

### Pré-requisitos

*   JDK 17 (ou superior)
*   Maven 3.6.x (ou superior) ou Gradle compatível
*   Uma IDE de sua preferência (IntelliJ IDEA, Eclipse, VS Code com extensões Java)

### Passos para Executar

1.  **Clone o repositório:**
    ```bash
    git clone <url-do-seu-repositorio>
    cd <nome-do-projeto>
    ```

2.  **Compile e execute o projeto usando Maven:**
    ```bash
    mvn spring-boot:run
    ```
    Ou, se preferir gerar o JAR e executá-lo:
    ```bash
    mvn clean package
    java -jar target/<nome-do-seu-artefato>.jar
    ```

3.  **Acesse a aplicação:**
    Por padrão, a aplicação estará disponível em `http://localhost:8080`.

4.  **Rode o Arquivo ChallengeMottuApplication.Java:**
    Esse arquivo faz a aplicação iniciar, se ele não for iniciado as APIs não irão receber a requisição.
    O caminho do arquivo é: Challenge-mottu\src\main\java\br\com\fiap\challenge_mottu\ChallengeMottuApplication.java
## Documentação da API (Swagger)

Após iniciar a aplicação, a documentação interativa da API (Swagger UI) pode ser acessada em:

`http://localhost:8080/swagger-ui.html`

Lá você poderá visualizar todos os endpoints disponíveis, seus parâmetros, e testá-los diretamente pelo navegador.

## Endpoints Principais (Exemplos)

*   **Galpões:**
    *   `POST /galpoes`: Cria um novo galpão.
    *   `GET /galpoes/{id}`: Busca um galpão por ID.
*   **Áreas:**
    *   `POST /areas`: Cria uma nova área (requer `galpaoId`).
    *   `GET /areas/{id}`: Busca uma área por ID.
*   **Corredores:**
    *   `POST /corredores`: Cria um novo corredor (requer `areaId`).
    *   `GET /corredores/{id}`: Busca um corredor por ID.
*   **Vagas:**
    *   `POST /vagas`: Cria uma nova vaga (requer `corredorId`).
    *   `GET /vagas/{id}`: Busca uma vaga por ID.
*   **Motos:**
    *   `POST /motos`: Estaciona/cria uma nova moto em uma vaga (requer `vagaId`).
    *   `GET /motos`: Lista todas as motos com paginação (ex: `/motos?page=0&size=10`).
    *   `GET /motos/{id}`: Busca uma moto por ID.
    *   `PUT /motos/{id}`: Atualiza os dados de uma moto existente.
    *   `DELETE /motos/{id}`: Deleta uma moto do sistema.

*(Nota: Os paths exatos dos endpoints podem variar conforme a implementação nos controllers).*

## Integrantes

Projeto realizado para a disciplina de Java do curso de Análise e Desenvolvimento de Sistemas da FIAP 
* Ruan Lima Silva - RM558775
* Marcos Vinicius - RM557252 
* Richardy Borges - RM557883



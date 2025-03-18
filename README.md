# DIO-CEP-API

Este projeto foi desenvolvido como parte dos cursos da Digital Innovation One (DIO), com o objetivo de aplicar padrões de projeto (Design Patterns), consumir APIs externas e utilizar o conceito de Strategy.

## Objetivo

O principal propósito deste projeto é demonstrar a implementação de uma arquitetura diferenciada que consome APIs externas e aplica o padrão de projeto Strategy para a busca de endereços com base no CEP (Código de Endereçamento Postal).

## Funcionalidades

- **Consulta de Endereço por CEP:** Permite buscar informações de endereço a partir de um CEP fornecido, consumindo APIs externas para obter os dados.
- **Cadastro de Clientes:** Possibilita o cadastro de clientes com seus respectivos endereços.
- **Listagem de Clientes:** Exibe todos os clientes cadastrados no sistema.
- **Atualização de Clientes:** Permite atualizar as informações de um cliente existente.
- **Remoção de Clientes:** Possibilita a exclusão de um cliente do sistema.

## Tecnologias Utilizadas

- **Java 11:** Linguagem de programação utilizada para o desenvolvimento do projeto.
- **Spring Boot:** Framework que simplifica a criação de aplicações Java, fornecendo suporte para injeção de dependências, configuração automática e mais.
- **Spring Data JPA:** Abstração para o uso de JPA (Java Persistence API), facilitando a interação com bancos de dados relacionais.
- **H2 Database:** Banco de dados em memória utilizado para testes e desenvolvimento.
- **Springdoc OpenAPI:** Para documentação interativa da API via Swagger UI.
- **OpenFeign:** Cliente HTTP declarativo para simplificar chamadas a APIs REST externas.

## Padrões de Projeto Aplicados

- **Strategy:** Implementado para definir diferentes estratégias de busca de endereços, permitindo a extensão ou alteração das fontes de dados sem modificar o código que utiliza essas estratégias.
- **Singleton:** Garantindo que determinadas classes tenham apenas uma instância durante o ciclo de vida da aplicação.
- **Facade:** Simplificando a interação com subsistemas complexos, fornecendo uma interface unificada.

## Estrutura do Projeto

- **Controller:** Responsável por receber as requisições HTTP e direcioná-las para os serviços correspondentes.
- **Service:** Implementa a lógica de negócio da aplicação, incluindo as estratégias de busca de endereços.
- **Repository:** Gerencia a persistência dos dados no banco utilizando Spring Data JPA.
- **Entity:** Representa as entidades do domínio, como Cliente e Endereço.
- **IMPL:** Implementação do conceito de Strategy para clientes, permitindo diferentes abordagens para a busca de CEP via serviços externos.
- **Configuration:** Define configurações globais do projeto, como integração com APIs externas.

## Como Executar o Projeto

1. **Pré-requisitos:** Certifique-se de ter o Java 11 e o Maven instalados em sua máquina.
2. **Clonar o Repositório:**
   ```bash
   git clone https://github.com/1LUCASPEDROSO/DIO-CEP-API.git
   ```
3. **Navegar até o Diretório do Projeto:**
   ```bash
   cd DIO-CEP-API
   ```
4. **Instalar Dependências:**
   ```bash
   mvn clean install
   ```
5. **Compilar e Executar a Aplicação:**
   ```bash
   mvn spring-boot:run
   ```
6. **Acessar a Documentação da API:**
   - Abra o navegador e acesse: [Swagger UI](http://localhost:8080/docs)

7. **Acessar o Console H2:**
   - Abra o navegador e acesse: [H2 Console](http://localhost:8080/h2-console)

## Considerações Finais

Este projeto exemplifica a aplicação de padrões de projeto e o consumo de APIs externas em uma arquitetura Spring Boot, servindo como base para desenvolvedores que desejam aprofundar seus conhecimentos nessas áreas.


# API (Interface de Programação de Aplicações) de Evento
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white) ![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white) ![Postman](https://img.shields.io/badge/Postman-FF6C37.svg?style=for-the-badge&logo=Postman&logoColor=white)

Este projeto é uma API (Interface de Programação de Aplicações) para um sistema de gerenciamento de eventos. Cada evento deve ter um nome, uma descrição, uma data e uma lista de participantes. Os usuários podem se inscrever para participar de eventos e ver a lista de participantes, que serão operações CRUD, utilizando JAVA, Spring Boot, com documenção Swagger, conforme solicitado nos exercícios do Curso TI 360 TECH - Formação de Profissional 4.0, do Weslley Borges - Executivo de TI, para obter maior conhecimento na linguagem.

## Responsabilidades da API (Interface de Programação de Aplicações)
- Retornar uma lista de todos os eventos cadastrados,
- Retornar o evento cadastrado, filtrando por código, retornando "OK - Tarefa Encontrada", "ERRO - Tarefa não localizada" ou "Erro Inesperado,
- Cadastrar novos eventos,
- Excluir eventos cadastrados.

## Ferramenta utilizada para realização de testes
Para verificar se o código estava funcionando corretamente foi utilizada as Ferramentas POSTMAN e SWAGGER, apresentando a mensagem abaixo relacionada no Body do cadastro:

{

    "id": 1,
    "Nome do Evento": "Teste",
    "Descrição": "Teste",
    "Data": 20/05/2024,
    "Participantes": "Teste"    
}

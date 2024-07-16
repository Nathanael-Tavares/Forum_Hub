# Forum HUB

A aplicação de fórum desenvolvida com Spring Boot é um sistema que permite aos usuários criar tópicos de discussão, responder a esses tópicos e visualizar detalhes dos tópicos existentes. Utilizando tecnologias como JPA/Hibernate para persistência de dados e Bean Validation para garantir integridade, o projeto facilita a interação entre usuários por meio de uma API REST, permitindo operações básicas de criação, leitura e atualização de conteúdo no fórum.

## Endpoints Disponíveis

A aplicação fornece os seguintes endpoints REST para interagir com os recursos do fórum:

1. **POST /login**
   - Faz a autenticação do usuário e, se autorizado, recebe um token para usar os demais endpoints.
   - ![image](https://github.com/user-attachments/assets/8530942d-90e0-4d5a-b717-ce0efdfe3cee)


2. **POST /topicos**
   - Cria um novo tópico no fórum.
   - ![image](https://github.com/user-attachments/assets/35e05ef7-fc64-4eef-bf4e-0430d3cfbef3)


3. **GET /topicos/{id}**
   - Recupera os detalhes de um tópico específico pelo seu ID.
   - ![image](https://github.com/user-attachments/assets/75d3d288-d44b-4755-97a3-ad5c5a641e94)


4. **DELETE /topicos/{id}**
   - Exclui um tópico correspondente ao ID fornecido.

5. **PUT /topicos**
   - Atualiza mensagem, título ou estado de um tópico.
   - ![image](https://github.com/user-attachments/assets/7e8345e0-8c5c-4ed5-83f6-623946a6c286)


6. **GET /topicos**
   - Recupera todos os tópicos cadastrados.
   - ![image](https://github.com/user-attachments/assets/4bd8c86c-6f43-4aad-b76f-3b0b52dcba96)

     

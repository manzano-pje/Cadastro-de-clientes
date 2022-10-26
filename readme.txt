Cadastro de pessoas
Teste técnico para a Simbiose Ventures
Teste realizado para mostrar meus conhecimentos em backend e frontend.

URL do teste online
https://simbiose-teste-tecnico.netlify.app/

Tecnologias utilizadas
Java 17
Spring Boot
PostgreSQL
React.js
Typescript
Serviços Cloud utilizados
Netlify
Heroku
Features
Cadastrar pessoa
Editar pessoa
Listar pessoas
Deletar pessoa
Responsividade
Instalação frontend
Para rodar o projeto em localhost é necessário ter o Node.js instalado.

Instale as dependencias e inicie o servidor.

cd frontend
npm install ou yarn install
npm run dev ou yarn dev
será necessário alterar o URL da api caso queira rodar o frontend + backend em localhost, caso não queira rodar o backend em localhost, desconsiderar a instrução abaixo.

local do arquivo: frontend/services/PessoaService.ts alterar API_URL e VERIFICAR_EMAIL_URL para http://localhost:8080/api/v1/ e http://localhost:8080/api/v1/verificar-email respectivamente.

Instalação backend
Para rodar o projeto em localhost é necessário ter o Java 17 instalado.

alterar os dados do application.properties de acordo com sua base dados

Na pasta backend rode os seguintes comandos:

maven clean install
maven spring-boot:run
Para a documentação dos endpoints acesse:

localhost:8080/swagger-ui.html
License
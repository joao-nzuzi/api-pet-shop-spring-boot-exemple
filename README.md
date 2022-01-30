# Exemplo de uma API Pet Shop - Spring Boot
Este projecto visa, usando o framework Spring Boot, construir uma API Pet Shop onde será possível cadastrar, editar e pesquisar os Pets pela:
  - Cor;
  - Nome
  - Idade;
  - Raça;
  - Tipo;
  - Gênero (Macho/Fêmea).
 
 Para fazermos isso faremos o uso correcto dos 3 verbos HTTP, a saber:
  - **GET** - Para fazer uma busca;
  - **POST** - Para fazer uma inserção;
  - **PUT** - Para fazer um update.
 
# Ferramentas Utilizadas
Para construção deste projecto foi usado as seguintes ferramentas:

  - IntelliJ;
  - Spring Framework;
  - H2 - Como base e dados
  - Postman - para execução dos testes de verificação;
  - Git/GitHub para versionamento.

# Execução do Projecto
Para executar o projecto no terminal (do IntelliJ), basta rodar o camando abaixo:
[x] mvn spring-boot:run

Após a execução do projecto no terminal, digita o seguinte comando no browser:
[x] http://localhost:8080/api/v1/petshop/

# Pré-requisitos
São necessários os seguintes pré-requisitos para o desenvolvimento e execução do projecto:
  - Java 8 ou superiores;
  - Apache Maven 3.6.3 ou superiores - para gestão de dependências

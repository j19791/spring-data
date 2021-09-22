## Spring Data JPA

## arquitetura Spring Data



### configurando ambiente
- [spring initializr](http://start.spring.io)
- incluir dependencia jpa
- baixar o arquivo zip gerado, descompactar
- importar Maven Projects : selecionar a pasta descompactada
- baixa o drive do mariadb no mvn repo
- src/main/resources: configurações para utilizar o spring e conexão c/ bd

### rodando a aplicação
- SpringDataApplication - rodar como aplicação java

### Tipos de repositórios
- camada da aplicação que se relaciona c/ o bd via queries
- Repository
- CRUD Repository : realiza métodos CRUD s/ necessidade de crir os objetos JPA

### Injeção de Dependência
- não da pra dar new em interfaces
- 

# kk-rest-services
Project showing my abilities of creating REST services

1)To connect with PostgreSQL create (or pick existing) database.
In my example i created database named usersdb

2)in application.properties setup three properties:
spring.datasource.url=jdbc:postgresql://localhost:5432/usersdb
spring.datasource.username= your_username
spring.datasource.password= your_password

3) When you run project it will create table end_user.

4) API:
http://localhost:8080/list - lists all users

http://localhost:8080/find/{PESEL} - find user by PESEL

http://localhost:8080/put

In request Body put JSON:

{"firstName":"Test","lastName":"User","pesel":"98011653182"}

where "pesel" must be valid Polish National Identification Number (PESEL)

Some generated PESEL numbers for tests:
77090679683,
67101623426,
58012073172,
58121685198,
69111435293,
98011653182,
89042571516,
82091398376,
68122425279,
62040179542


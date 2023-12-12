# Sprint4_T2_Spring Boot_H2

We have an entity called "Fruit", which has the following properties:

- int id
- String name
- Int quantityKilos

Taking advantage of the JPA specification, you will have to persist this entity to an H2 database, following the MVC pattern. For this, depending on the main Package, you will create a package structure, where you will place the classes you need:

cat.itacademy.barcelonactiva.surnames.name.s04.t02.n01.controllers
cat.itacademy.barcelonactiva.surnames.name.s04.t02.n01.model.domain
cat.itacademy.barcelonactiva.surnames.name.s04.t02.n01.model.services
cat.itacademy.barcelonactiva.surnames.nom.s04.t02.n01.model.repository

The class located in the controllers package (FruitaController, for example), must be able to respond to the following requests to update and consult information:

- http://localhost:8080/fruit/add
- http://localhost:8080/fruit/update
- http://localhost:8080/fruita/delete/{id}
- http://localhost:8080/fruita/getOne/{id}
- http://localhost:8080/fruit/getAll


>Important:
You will need to consider good API design practices, using correct error codes and responses in case of incorrect invocations. (You can check information about ResponseEntity).

>Very important
In addition to the Git link for the solved assignment, you must include at least two different links to the resources we have provided you with on campus, which have helped you, or could have helped you, to solve the entire assignment or some parts

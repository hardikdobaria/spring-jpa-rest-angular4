# Spring Boot + REST + Angular 4 + JPA + MySQL CRUD Operation Example

This is sample Spring Boot server side Application. The main features of this proect are [Asset Pipeline] and [Client Dependencies Management using Gradle] integration.

### Prerequisites
- [JDK 1.8]
- [Spring Tool Suite]
- [MySql]

### How to run 

  - Download/clone the project. 
  - Open command prompt and go to the root location of the downloaded project. Then run following command to install bower dependencies:
```sh
        gradlew clientInstall 
```
  - This will install client dependencies in side src/assets/vendor. Once installed client dependencies, import project in Spring Tool Suite (STS) from File > Import > Gradle (STS) Project. Note that you need to install Gradle plugin in STS first if not installed yet. 
  - In STS, right click on the project and click on Gradle (STS) > Refresh Dependencies.
  - Now open **application.properties** file and change database related properties as per your [MySql] database. Change spring datasource. Also create a databse with name you have specified in **application.properties**. In this demo I have named database as demo.
  - Open **App.java** and Run as **Java Application**. This will start the application and you can check on http://localhost:8080
  - Note that, when you run the app for first time, [Flyway] will create tables for you by executing **V1__create_db.sql** placed in resources/db/migration.

### Note
- This application is server side application developed using Spring Boot,jpa,restapi.
- Client side applicatin is developed using angularjs4 Please Download/clone the project using below link.
* [Angularjs4]

[Angularjs4]: https://github.com/hardikdobaria/angularjs4
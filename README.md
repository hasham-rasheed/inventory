# Inventory
Using Spring Boot and Angular to display inventory items.

### Built With

* [Maven](http://maven.apache.org/) - Dependency Management<br/>
* [JDK 8](https://docs.oracle.com/javase/8/docs/technotes/guides/install/install_overview.html) - Java™ Platform, Standard Edition Development Kit
* [Spring Boot](https://spring.io/projects/spring-boot) - Framework to ease the bootstrapping and development of new Spring Applications<br/>
* [Lombok](https://projectlombok.org/) - Never write another getter or equals method again, with one annotation your class has a fully featured builder, Automate your logging variables, and much more.<br/>
* [Git](https://git-scm.com/) - Free and Open-Source distributed version control system<br/>
* [Angular](https://angular.io/) - Angular is a platform for building mobile and desktop web applications
* [H2](https://www.h2database.com/html/main.html) - H2 is a relational database management system written in Java. It can be embedded in Java applications or run in client-server mode


### Building and running the application locally
#### Build
Before you can run the application, you will need to build it. Clone this repository and navigate to it via terminal / command prompt. Then simply execute `mvn clean install` in the project directory containing pom.xml.

#### Running the application
After successful build, you can choose one of the ways listed below to run the
 application. Please note that data will be automatically loaded into the
  database. You can find this sample data in InventoryApplication's
   loadInventoryItems method.

1. One way to run is by using an IDE ([IntelliJ IDEA](https://www.jetbrains.com/idea/) in this case):
   - Open IntelliJ IDEA and click on: 
      - Open or Import -> Navigate to the cloned repository -> Open
   - Select InventoryApplication from Run Configuration and click on run button.
   
2. Second way is to execute the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) command in terminal / command prompt:
    ```shell
    mvn spring-boot:run
    ```
3. Lastly, you can execute the jar produced by the build by entering the following command in terminal / command prompt:
    ```shell
     java -jar PATH_TO_TARGET_FOLDER/inventory-1.0.jar
    ```
    
Once you run the application using any of the above methods and see the log "Tomcat started on port(s): 8080 (http) with context path ''", open any browser and navigate to http://localhost:8080

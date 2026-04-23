# PlantMatEnhancedServer (PlantGlycosider)

This is a Spring Boot application.

## Prerequisites

- Java 8 (as defined in `pom.xml`)

## How to run the application

### 1. Build the project and install local dependencies

This project relies on a local jar file located at `lib/plantglycosider.jar`. When you run the `clean` lifecycle in Maven, it will automatically install this local jar into your local Maven repository using the `maven-install-plugin`.

To build the project and install the dependencies, run the following command in the terminal at the root of the project:

```bash
./mvnw clean install
```

*(If you are on Windows, use `mvnw.cmd clean install`)*

### 2. Run the Spring Boot application

Once the project is built and the local dependency is installed, you can start the Spring Boot server by running:

```bash
./mvnw spring-boot:run
```

*(If you are on Windows, use `mvnw.cmd spring-boot:run`)*

### 3. Run Example

```bash
curl http://localhost:8080/api/generate/OC1=CC=CC=C1O
```

### 4. Lint

```bash
./mvnw checkstyle:check
```

### 5. Auto-correct (Format Code)

This project uses the `fmt-maven-plugin` to automatically correct and format all Java code according to the Google Java Style Guide.

To auto-format your code, run:

```bash
./mvnw com.coveo:fmt-maven-plugin:format
```

### Running from an IDE

Alternatively, you can run the application directly from your IDE (like IntelliJ IDEA or Android Studio) by locating the `PlantGlycosiderApplication` class and executing its `main` method. 

## Notes

- The project uses `spring-boot-starter-tomcat`. If you intend to build a `.war` file for deployment to an external Tomcat server, you might need to change the scope of this dependency back to `<scope>provided</scope>` in the `pom.xml`. However, to run the application directly from your IDE or via `spring-boot:run`, it should remain without the `provided` scope.
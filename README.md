### Description
This is a small demo that demonstrates how to use Gradle and Spring Boot to create and run a multi-module web application.

### Goals
- Each module can be *developed* **and** *tested* independently
- All modules can be executed together as one big uber-jar (webapp)

### Modules
- **legacy** - standalone Spring Boot app with some legacy logic
- **logic** - shared services, no web layer
- **web** - module with its own web stuff that can import and run controllers from legacy module too

All modules are listed in `settings.gradle` file.

### Tests

RestAssured tests demonstrate that modules can be tested both independently (`LegacyWebTest`) and together (`WebApp1Test`)

### Building

- **All modules**: `./gradlew build`
- **Individual module**: `./gradlew :legacy:build`

### Running

```
./gradlew build
java -jar web/build/libs/multi-module-web-0.0.1-SNAPSHOT.jar
```
FROM eclipse-temurin:21-jre
ADD target/calculator-1.0-SNAPSHOT.jar calculator-1.0-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "calculator-1.0-SNAPSHOT.jar"] 
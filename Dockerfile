FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY target/java-calculator-1.0-SNAPSHOT.jar app.jar

CMD ["java", "-jar", "app.jar"]
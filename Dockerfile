FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY target/java-calculator-1.0-SNAPSHOT.jar app.jar

EXPOSE 9090

ENTRYPOINT ["java","-jar","app.jar"]
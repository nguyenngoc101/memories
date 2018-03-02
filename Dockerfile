FROM openjdk:8-jdk-alpine
ARG JAR_FILE
COPY ${JAR_FILE} /app.jar
# ./mvnw package && java -jar target/gs-spring-boot-docker-0.1.0.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]

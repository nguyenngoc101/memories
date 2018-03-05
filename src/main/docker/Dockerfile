FROM openjdk:8-jdk-alpine
COPY demo-0.0.1-SNAPSHOT.jar /app.jar
EXPOSE 8080
# ./mvnw package && java -jar target/gs-spring-boot-docker-0.1.0.jar
# sudo docker build --build-arg JAR_FILE=target/demo-0.0.1-SNAPSHOT.jar -t apiserver:8.0 .
# ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Dspring.profiles.active=container","-jar","/app.jar"]

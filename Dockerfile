FROM openjdk:21-jdk--slim
ARG JAR_FILE=target/Springboot-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app_Myapi.jar
EXPOSE 8080
LABEL authors="Tomas1201"

ENTRYPOINT ["java", "-jar", "app_myapi.jar"]
# Image de l'API
FROM amazoncorretto:18-alpine-jdk as server

COPY target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","app.jar"]

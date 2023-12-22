
# Image du client React
FROM node:12.18.1 AS client

COPY front/src /app
WORKDIR /app
 
#COPY front/src/package.json .
#COPY front/src/package-lock.json .
 
RUN npm install
 

EXPOSE 3000
 
CMD [ "npm", "start" ]


# Image de l'API
FROM amazoncorretto:18-alpine-jdk as server

COPY back/target/back-0.0.1.jar /app
WORKDIR /app


ENTRYPOINT ["java","-jar","/back-0.0.1.jar"]

# Image de la BDD MySQL

FROM mysql:8.1 as bdd

ENV MYSQL_ROOT_PASSWORD=password

ENV MYSQL_DATABASE=todoDB

EXPOSE 3306


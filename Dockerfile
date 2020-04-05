# From Repository openjdk: and the tag 8u--
FROM openjdk:8u131-jdk-alpine

EXPOSE 8080

WORKDIR /usr/local/bin

# This will copy it to the WORKDIR /usr/local/bin/
COPY ./target/car-0.0.1-SNAPSHOT.jar webapp.jar

CMD ["java", "-jar", "webapp.jar"]
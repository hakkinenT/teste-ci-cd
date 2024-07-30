FROM amazoncorretto:21-al2023

WORKDIR /app

COPY target/testecicd-0.0.1-SNAPSHOT.jar /app/my-api.jar

ENTRYPOINT ["java", "-jar", "my-api.jar"]
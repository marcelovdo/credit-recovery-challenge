FROM amazoncorretto:22-alpine

WORKDIR /app

COPY target/client-0.0.1-SNAPSHOT.jar /app/app.jar

EXPOSE 8080

CMD ["java", "-jar", "/app/app.jar"]
FROM openjdk:21
EXPOSE 8080
COPY target/Jenkinstrial-0.0.1-SNAPSHOT.jar /app/docker-jenkins-integration-sample.jar
ENTRYPOINT ["java", "-jar", "/app/docker-jenkins-integration-sample.jar"]

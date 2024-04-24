FROM openjdk:21
EXPOSE 8080
COPY target/docker-jenkins-integration-sample.jar /app/docker-jenkins-integration-sample.jar
ENTRYPOINT [ "java","-jar","/docker-jenkins-integration-sample.jar" ]

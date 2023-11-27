FROM openjdk:8
EXPOSE 8080
ADD target/springAppJenkins.jar springAppJenkins.jar
ENTRYPOINT ["java","-jar","/springAppJenkins.jar"]
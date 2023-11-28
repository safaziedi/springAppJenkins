FROM openjdk:8
EXPOSE 8080
ADD target/springappjenkins.jar springappjenkins.jar
ENTRYPOINT ["java","-jar","/springappjenkins.jar"]
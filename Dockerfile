#FROM openjdk:21-jdk-alpine
FROM amazoncorretto:21-alpine3.21-full
#RUN yum install shadow-utils.x86_64 -y
RUN ls
RUN addgroup -S spring 
RUN adduser spring -G spring
#USER spring:spring
#ARG JAR_FILE=target/*.jar
#COPY ${JAR_FILE} app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]

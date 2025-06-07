#FROM openjdk:21-jdk-alpine
FROM amazoncorretto:21-alpine3.21-full
#RUN yum install shadow-utils.x86_64 -y
RUN ls
RUN addgroup -S spring 
RUN adduser -S spring -G spring
USER spring:spring
ARG JAR_FILE=target/demo-0.0.1-SNAPSHOT.jar
#COPY ${JAR_FILE} app.jar

WORKDIR /app
ADD target/demo-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080

ENTRYPOINT ["java","-jar","/app.jar"]

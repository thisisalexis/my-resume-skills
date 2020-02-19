FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar
#ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
ENTRYPOINT ["java","-Dspring.data.mongodb.uri=mongodb://resume-skills-mongo-db:27017/resume-skills-db", "-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]

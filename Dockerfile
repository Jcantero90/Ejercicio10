FROM openjdk:17
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} 10-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/10-0.0.1-SNAPSHOT.jar"]
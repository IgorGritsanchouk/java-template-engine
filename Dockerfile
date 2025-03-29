FROM openjdk:21-jdk-slim
ADD ./target/ui-jte-0.0.1-SNAPSHOT.jar uijte.jar
EXPOSE 80
ENTRYPOINT ["java", "-jar", "uijte.jar"]
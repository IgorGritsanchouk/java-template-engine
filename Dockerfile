FROM openjdk:21-jdk-slim
ADD ./target/java-template-engine-0.0.1-SNAPSHOT.jar jtengine.jar
EXPOSE 80
ENTRYPOINT ["java", "-jar", "jtengine.jar"]
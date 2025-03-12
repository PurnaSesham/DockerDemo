FROM openjdk:17

COPY build/libs/DockerDemo-0.0.1-SNAPSHOT.jar /DockerDemo.jar

ENTRYPOINT [ "java","-jar", "/DockerDemo.jar"]

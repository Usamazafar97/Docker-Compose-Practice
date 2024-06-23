FROM openjdk:22-jdk
ADD target/student-app.jar /tmp/student-app.jar
ENTRYPOINT ["java", "-jar", "/tmp/student-app.jar"]
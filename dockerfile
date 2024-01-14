FROM openjdk:17-jdk
ADD ./build/libs/jenkins.jar ./jenkins.jar
ENTRYPOINT ["java", "-jar", "./jenkins.jar"]

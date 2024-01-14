FROM openjdk:17-jdk
ARG VERSION=2.1
ADD ./build/libs/jenkins-${VERSION}.jar ./jenkins.jar
ENTRYPOINT ["java", "-jar", "./jenkins.jar"]
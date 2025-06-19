# Start with a base image containing Java runtime
FROM openjdk:21
# Add Maintainer Info
LABEL maintainer="ujeremiah200@gmail.com"
LABEL authors="Jeremiah Udoh"
# Make port 8080 available to the world outside this container
EXPOSE 8080
# The application's jar file
ARG JAR_FILE=target/customer-0.0.1-SNAPSHOT.jar

# Add the application's jar to the container
ADD ${JAR_FILE} app.jar

# Run the jar file
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]


#FROM tomcat:11.0-jdk21-temurin-noble
#MAINTAINER Joseph Gibah <ujeremiah200@gmail.com>
#COPY target/customer-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war
#EXPOSE 8080
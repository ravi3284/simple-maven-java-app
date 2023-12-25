# Use the latest OpenJDK base image
FROM openjdk:latest

# Set the working directory inside the container
WORKDIR /usr/src/app

# Copy the JAR file to the container
COPY target/my-java-app-1.0-SNAPSHOT.jar /usr/src/app/

# Copy the image file to the resources directory in the container
COPY src/main/java/resources/aws.jpg /usr/src/app/src/main/resources/

# Expose port 8080
EXPOSE 8080

# Command to run the Java application
CMD ["java", "-jar", "my-java-app-1.0-SNAPSHOT.jar"]

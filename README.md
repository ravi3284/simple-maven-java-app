**Application Description:**

The `simple-java-app` is a simple Java application encapsulated within a Maven project structure. It utilizes Java's HTTP server functionality to serve an image file over a local web server.

**Features:**

**Image Display:** The application serves an image file to the web browser using a built-in HTTP server.
**Maven Structure:** Utilizes Maven, a build automation tool, to manage dependencies, build the project, and create an executable JAR file.
**Docker Integration:** The application is Dockerized, allowing easy deployment and execution within a Docker container.
**Port Configuration:** Exposes the application on port 8080.
How It Works:

Upon execution, the application starts a simple HTTP server on port 8080.
It loads an image file and serves it to any client accessing the server's root URL (http://localhost:8080).
Usage:

After building and running the Docker container (**docker run -p 8080:8080 java**), accessing http://localhost:8080 on a web browser will display the served image.
Purpose:

This application serves as a basic example of setting up a Java-based web server to display an image file. It can serve as a starting point for learning about Java networking and basic Dockerization of Java applications.
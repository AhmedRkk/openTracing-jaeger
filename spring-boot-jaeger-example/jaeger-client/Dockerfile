# Base image
FROM  maven:3.8.4-openjdk-11


# Set the working directory
WORKDIR /app

# Copy the project files to the container
COPY . .


# Build the application
RUN mvn package -DskipTests

EXPOSE 8081
# Set the command to run the application
CMD ["java", "-jar", "target/jaeger-client-0.0.1-SNAPSHOT.jar"]

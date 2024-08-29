# Spring Boot Student CRUD Application with MySQL and Docker

## Description
This repository contains a Spring Boot application that provides a CRUD API for managing students. The application uses MySQL for database storage and Docker for containerization.

## Steps to Run the Project

1. **Download and Import the Project**
   - Clone or download the application from the GitHub repository.
   - Import the project into Eclipse.

2. **Build the Project**
   - Right-click on the project in Eclipse.
   - Select **Run As** → **Maven install** to create the JAR file.

3. **Build the Docker Image**
   - Open a terminal and navigate to the root directory of the project where the `Dockerfile` and `docker-compose.yml` files are located.
   - Run the command:  
     ```bash
     docker-compose build
     ```

4. **Start the Application**
   - If the build is successful, start the application with:  
     ```bash
     docker-compose up
     ```

5. **Verify the Application**
   - Check the terminal logs to ensure the Spring Boot application has started.

## Testing the Application with Postman

1. **Create a New Student**
   - Open Postman.
   - Send a **POST** request to the URL:
     ```
     http://localhost:8080/api/students
     ```
   - Pass the following JSON data in the request body:
     ```json
     {
       "age": 30,
       "email": "Anand.gmail.com",
       "name": "Anand"
     }
     ```

2. **Retrieve All Students**
   - Send a **GET** request to the URL:
     ```
     http://localhost:8080/api/students
     ```
   - This will return all students present in the student database.



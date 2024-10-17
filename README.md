## JPA Practice: Task Manager API

This is an exercise to practice using JPA with Spring Boot to create simple RESTful APIs. The API supports basic CRUD operations to create, read, update, and delete tasks.

### Technologies Used

- Java
- Spring Boot 3.2.5
- Spring Data JPA
- H2 Database (In-memory)
- Maven

### Endpoints

| Method | Endpoint        | Description                   |
|--------|-----------------|-------------------------------|
| POST   | `/tasks`        | Create a new task            |
| GET    | `/tasks`        | Retrieve all tasks           |
| GET    | `/tasks/{id}`   | Retrieve a task by ID        |
| PUT    | `/tasks/{id}`   | Update an existing task      |
| DELETE | `/tasks/{id}`   | Delete a task                |

### Getting Started

#### Prerequisites

- Java 17+
- Maven

#### Running the Application

1. Clone the repository:
   ```bash
   git clone <repository-url>
   ```
2. Navigate to the project directory:
    ```bash
    cd task-manager
    ```
3. Run the application:
    ```bash
    ./mvnw spring-boot:run
    ```
   




# Student Management System

A full-stack backend application built with **Java, Spring Boot, MySQL, and REST APIs**, implementing complete CRUD (Create, Read, Update, Delete) operations for managing student records.

## Tech Stack

- **Language:** Java 17
- **Framework:** Spring Boot 3
- **Database:** MySQL
- **ORM:** Spring Data JPA (Hibernate)
- **Build Tool:** Maven
- **Testing:** Postman

## Features

- Add a new student
- View all students / view a student by ID
- Update student details
- Delete a student
- Input validation (e.g. valid email, required fields)
- Clean error handling with meaningful JSON error responses

## Project Structure

```
student-management-system/
├── src/main/java/com/jahnvi/studentmanagement/
│   ├── controller/       # REST API endpoints
│   ├── service/          # Business logic
│   ├── repository/       # Database access layer (JPA)
│   ├── model/            # Entity classes
│   ├── exception/        # Custom exceptions & error handling
│   └── StudentManagementSystemApplication.java
├── src/main/resources/
│   └── application.properties
└── pom.xml
```

## Getting Started

### Prerequisites
- Java 17+
- Maven
- MySQL installed and running

### 1. Clone the repository
```bash
git clone https://github.com/Jahnvishukla00/student-management-system.git
cd student-management-system
```

### 2. Set up the database
In MySQL, no need to manually create the database — it's auto-created on first run. Just update your MySQL username/password in `src/main/resources/application.properties`:
```properties
spring.datasource.username=root
spring.datasource.password=YOUR_MYSQL_PASSWORD
```

### 3. Run the application
```bash
mvn spring-boot:run
```
The app will start on `http://localhost:8080`

## API Endpoints

| Method | Endpoint              | Description              |
|--------|------------------------|---------------------------|
| POST   | `/api/students`         | Create a new student      |
| GET    | `/api/students`         | Get all students          |
| GET    | `/api/students/{id}`    | Get a student by ID       |
| PUT    | `/api/students/{id}`    | Update a student by ID    |
| DELETE | `/api/students/{id}`    | Delete a student by ID    |

### Sample Request Body (POST/PUT)
```json
{
  "name": "Jahnvi Shukla",
  "email": "jahnvi@example.com",
  "age": 21,
  "course": "Computer Science",
  "phoneNumber": "8755610989"
}
```

## Author

**Jahnvi Shukla**
[LinkedIn](https://linkedin.com/in/jahnvi-shukla-958924281) | [GitHub](https://github.com/Jahnvishukla00)

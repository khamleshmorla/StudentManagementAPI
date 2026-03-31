
# Student Management System API

## 🚀 Overview
This is a backend RESTful API built using Spring Boot to manage student data.  
The project follows a clean layered architecture and demonstrates core backend development concepts such as DTO pattern, exception handling, and database integration.

---

## 🛠 Tech Stack

- Java
- Spring Boot
- Spring Data JPA (Hibernate)
- MySQL
- REST APIs
- Maven

---

## 🏗 Architecture

The project follows a layered architecture:

Controller → Service → Repository → Database

Additionally:
- DTO layer for API contracts
- Mapper for DTO ↔ Entity conversion
- Global exception handling

---

## 📌 Features

- Create Student
- Get Student by ID
- Get All Students
- Update Student
- Delete Student
- Clean API response structure using DTOs
- Global Exception Handling using `@ControllerAdvice`

---

## 🔗 API Endpoints

| Method | Endpoint | Description |
|-------|--------|------------|
| POST | `/students` | Create a new student |
| GET | `/students/{id}` | Get student by ID |
| GET | `/students` | Get all students |
| PUT | `/students/{id}` | Update student |
| DELETE | `/students/{id}` | Delete student |

---

## ⚙️ How to Run

1. Clone the repository
```bash
git clone https://github.com/khamleshmorla/StudentManagementAPI.git

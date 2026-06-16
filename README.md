# Employee Management (employee.management)

A Spring Boot project to manage employees with CRUD operations and secure access.

## 📌 Project Overview
Employee Management System using Spring Boot, JWT Authentication, REST APIs for Employees & Departments.

## 🚀 Tech Stack

<p align="center">
  <img src="https://img.shields.io/badge/Java-17-blue" />
  <img src="https://img.shields.io/badge/SpringBoot-3.0-green" />
  <img src="https://img.shields.io/badge/MySQL-Database-orange" />
  <img src="https://img.shields.io/badge/SpringSecurity-JWT-red" />
</p>

## 🔑 Features
Add new employee
Update employee details
Delete employee
View all employees
Secure login with JWT
Role-based access control:
ROLE_USER ➜ can view employees
ROLE_ADMIN ➜ can add, update, delete employees

## 📂 Project Structure
src/main/java → Application source code
src/main/resources → Configuration files
pom.xml → Maven dependencies
README.md → Documentation

## 🔒 Security
JWT-based authentication
Role-based access control (Admin/User)
Passwords encrypted using Spring Security

## ⚙️ Setup Instructions
1.Clone repo
git clone https://github.com/Harshi2001-21/employee_management.git
cd employee_management
2.Configure application.properties
spring.datasource.url=jdbc:mysql://localhost:3306/employeedb
spring.datasource.username=root
spring.datasource.password=yourpassword
3.Run project
mvn spring-boot:run
4.Test APIs in Postman → Register → Login → Copy JWT → Access Employee/Department APIs

## 📑 API Endpoints
| **Endpoint** | **Method** | **Description** | **Auth Required** |
| --- | --- | --- | --- |
| ``/api/auth/register`` | POST | Register new user | ❌ |
| ``/api/auth/login`` | POST | Login & get JWT | ❌ |
| ``/api/employees`` | GET | Get all employees | ✅ |
| ``/api/employees/{id}`` | GET | Get employee by ID | ✅ |
| ``/api/employees`` | POST | Add new employee | ✅ (Admin) |
| ``/api/employees/{id}`` | PUT | Update employee | ✅ (Admin) |
| ``/api/employees/{id}`` | DELETE | Delete employee | ✅ (Admin) |
| ``/api/departments`` | GET | Get all departments | ✅ |
| ``/api/departments`` | POST | Add department | ✅ (Admin) |

##🛠️ Usage Examples
GET /employees → View all employees
POST /employees → Add new employee
PUT /employees/{id} → Update employee
DELETE /employees/{id} → Delete employee

##🖼️ Screenshots
Register API
https://github.com/user-attachments/assets/fd1578bc-a705-4075-9401-d627557a8f39

Login API
https://github.com/user-attachments/assets/defe18bb-3d5e-4ed0-94f6-1bc52dfaaa78

Get Employees API
https://github.com/user-attachments/assets/2c4a279f-68e2-44e5-8b8c-a3e8ee583bb7

##🔮 Future Enhancements
Role-based authorization (Admin/User)
Department management UI (React/Angular frontend)
Swagger API docs (springdoc-openapi)

##📜 License
MIT License

##🤝 Contributing
Contributions are welcome! Please fork the repository and create a pull request.


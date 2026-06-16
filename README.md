# Employee Management (employee.management)

A Spring Boot project to manage employees with CRUD operations and secure access.

## Technologies Used
- Java
- Spring Boot
- Maven
- MySQL
- Spring Security (JWT Authentication)

## Features
- Add new employee
- Update employee details
- Delete employee
- View all employees
- Secure login with JWT
- Role-based access control:
  - ROLE_USER ➜ can view employees
  - ROLE_ADMIN ➜ can add, update, delete employees

## Setup Instructions
1. Clone the repository:
   ```bash
   git clone https://github.com/Harshi2001-21/employee_management.git

## Project Structure
- src/main/java → Application source code
- src/main/resources → Configuration files
- pom.xml → Maven dependencies
- README.md → Documentation

## Security
- JWT-based authentication
- Role-based access control (Admin/User)
- Passwords encrypted using Spring Security

## License
MIT License

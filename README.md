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
## Usage Examples
- GET /employees → View all employees
- POST /employees → Add new employee
- PUT /employees/{id} → Update employee
- DELETE /employees/{id} → Delete employee

## Screenshots

### Register API
![Register API](https://github.com/user-attachments/assets/fd1578bc-a705-4075-9401-d627557a8f39)

### Login API
![Login API](https://github.com/user-attachments/assets/defe18bb-3d5e-4ed0-94f6-1bc52dfaaa78)

### Get Employees API
![Get Employees](https://github.com/user-attachments/assets/2c4a279f-68e2-44e5-8b8c-a3e8ee583bb7)



## Contributing
Contributions are welcome! Please fork the repository and create a pull request.


# Employee Management (employee.management)
## 🔗 GitHub Repository

[![View on GitHub](https://img.shields.io/badge/View_on-GitHub-black?logo=github)](https://github.com/Harshi2001-21/employee_management)

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

### 1. Clone Repository

bash
git clone https://github.com/Harshi2001-21/employee_management.git
cd employee_management

### 2. Configure application.properties

properties
spring.datasource.url=jdbc:mysql://localhost:3306/employeedb
spring.datasource.username=root
spring.datasource.password=yourpassword

### 3. Run the Project

bash
mvn spring-boot:run

### 4. Test APIs in Postman

Register User
↓
Login User
↓
Copy JWT Token
↓
Access Employee APIs
↓
Access Department APIs

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

## 🛠️ Usage Examples
GET /employees       → View all employees
POST /employees      → Add new employee
PUT /employees/{id}  → Update employee
DELETE /employees/{id} → Delete employee add chesi pampu

## 🖼️ Screenshots

### Register API
![Register API](images/register_api.png)

### Login API
![Login API](images/login_api.png)

### Get Employees API
![Get Employees](images/get_employees_api.png)

## 🔮 Future Enhancements
Role-based authorization (Admin/User)
Department management UI (React/Angular frontend)
Swagger API docs (springdoc-openapi)

## 📜 License
MIT License

## 🤝 Contributing
1. Fork the repository  
2. Create a new branch (`git checkout -b feature-branch`)  
3. Commit your changes (`git commit -m 'Add new feature'`)  
4. Push to the branch (`git push origin feature-branch`)  
5. Open a Pull Request

## API Documentation
Swagger UI → [View APIs](http://localhost:9090/swagger-ui/index.html)

## 🖼️ Swagger Screenshots  

### 👥 Employee APIs  

#### GET Employees API – Request  
![Get Employees Request](images/get_employee_request.png)

#### GET Employees API – Response  
![Get Employees Response](images/get_employee_response.png)

#### POST Employee API – Request  
![Post Employee Request](images/post_employee_request.png)

#### POST Employee API – Response  
![Post Employee Response](images/post_employee_response.png)

#### PUT Employee API – Request  
![Put Employee Request](images/put_employee_request.png)

#### PUT Employee API – Response  
![Put Employee Response](images/put_employee_response.png)

#### DELETE Employee API – Request  
![Delete Employee Request](images/delete_employee_request.png)

#### DELETE Employee API – Response  
![Delete Employee Response](images/delete_employee_response.png)

---

### 🏢 Department APIs  

#### GET Departments API – Request  
![Get Departments Request](images/get_department_request.png)

#### GET Departments API – Response  
![Get Departments Response](images/get_department_response.png)

#### POST Department API – Request  
![Post Department Request](images/post_department_request.png)

#### POST Department API – Response  
![Post Department Response](images/post_department_response.png)

#### PUT Department API – Request  
![Put Department Request](images/put_department_request.png)

#### PUT Department API – Response  
![Put Department Response](images/put_department_response.png)

#### DELETE Department API – Request  
![Delete Department Request](images/delete_department_request.png)

#### DELETE Department API – Response 
![Delete Department Response](images/delete_department_response.png)

---

### 🔐 Swagger Authorize  

#### Swagger Authorize – Request  
![Swagger Authorize Request](images/swagger_authorize_request.png)

#### Swagger Authorize – Response  
![Swagger Authorize Response](images/swagger_authorize_response.png)

🐳 Docker Section Example
## 🐳 Docker Setup

### Build Image
![Docker Build](images/docker_build.png)

### Push to Docker Hub
![Docker Push](images/docker_push.png)

### Run Container
![Docker Run](images/docker_run.png)

### Verify Container
![Docker PS](images/docker_ps.png)

### Swagger UI
![Swagger UI].(images/swagger_ui.png)


## 📬 Contact
- Email: kannegantiharshitha21@gmail.com
- LinkedIn: [Harshitha Kanneganti](https://linkedin.com/in/kharshitha21)



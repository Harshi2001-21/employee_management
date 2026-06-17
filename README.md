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
![Register API](https://github.com/user-attachments/assets/fd1578bc-a705-4075-9401-d627557a8f39)

### Login API
![Login API](https://github.com/user-attachments/assets/defe18bb-3d5e-4ed0-94f6-1bc52dfaaa78)

### Get Employees API
![Get Employees](https://github.com/user-attachments/assets/2c4a279f-68e2-44e5-8b8c-a3e8ee583bb7)


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

🖼️ Swagger Screenshots
👥 Employee APIs
### GET Employees API – Request
![Get Employees Request]<img width="1917" height="310" alt="image" src="https://github.com/user-attachments/assets/b3a1a41f-766f-4e28-825e-b040d5ced2da" />

### GET Employees API – Response
![Get Employees Response]<img width="1918" height="732" alt="image" src="https://github.com/user-attachments/assets/73b396cb-8689-4da4-8552-b982ce50f4b5" />

### POST Employee API – Request
![Post Employee Request]<img width="1915" height="792" alt="image" src="https://github.com/user-attachments/assets/8511736e-3c0c-489e-961b-971b96bccae7" />

### POST Employee API – Response
![Post Employee Response]<img width="1918" height="847" alt="image" src="https://github.com/user-attachments/assets/30ea92ea-05e8-4300-9ae3-9cddae9e7d6a" />

### PUT Employee API – Request
![Put Employee Request]<img width="1912" height="863" alt="image" src="https://github.com/user-attachments/assets/c253e135-37d7-4ddb-b8ef-b8ab1592a5f4" />

### PUT Employee API – Response
![Put Employee Response]<img width="1915" height="916" alt="image" src="https://github.com/user-attachments/assets/c338a866-4449-485f-8c9c-0559368ecea2" />

### DELETE Employee API – Request
![Delete Employee Request]<img width="1918" height="443" alt="image" src="https://github.com/user-attachments/assets/c4f80041-3211-42ee-b61e-ed7824dcdb47" />

### DELETE Employee API – Response
![Delete Employee Response]<img width="1918" height="797" alt="image" src="https://github.com/user-attachments/assets/39f08181-6030-41c7-896d-231941199241" />

🏢 Department APIs
### GET Departments API – Request
![Get Departments Request]<img width="1907" height="422" alt="image" src="https://github.com/user-attachments/assets/ea09e9a1-a011-4732-8a28-e628cef8c259" />

### GET Departments API – Response
![Get Departments Response]<img width="1918" height="883" alt="image" src="https://github.com/user-attachments/assets/cd60fe26-fc6d-4e5c-9951-723db4507344" />

### POST Department API – Request
![Post Department Request]<img width="1907" height="783" alt="image" src="https://github.com/user-attachments/assets/9a1531a1-ff13-4e96-a084-fd67de355334" />

### POST Department API – Response
![Post Department Response]<img width="1918" height="912" alt="image" src="https://github.com/user-attachments/assets/b11db2d4-9c9a-4924-abb0-1058e1015abe" />

### PUT Department API – Request
![Put Department Request]<img width="1918" height="877" alt="image" src="https://github.com/user-attachments/assets/1db8e30d-2078-4cf9-8f3e-f0402d833872" />

### PUT Department API – Response
![Put Department Response]<img width="1918" height="847" alt="image" src="https://github.com/user-attachments/assets/fe117d18-88ae-419c-b267-14f9e28f8e71" />

### DELETE Department API – Request
![Delete Department Request]<img width="1911" height="432" alt="image" src="https://github.com/user-attachments/assets/0a655e79-bb58-469e-95ee-ef08c8239fa9" />

### DELETE Department API – Response
![Delete Department Response]<img width="1915" height="797" alt="image" src="https://github.com/user-attachments/assets/9d87111b-0f7f-44f0-9c9e-a133e725aae6" />

### Swagger Authorize – Request
![Swagger Authorize Request]<img width="867" height="382" alt="image" src="https://github.com/user-attachments/assets/69df963f-3a61-4017-a165-d6a4423e5216" />

### Swagger Authorize – Response
![Swagger Authorize Response]<img width="878" height="390" alt="image" src="https://github.com/user-attachments/assets/fe6aef81-929d-403a-8470-48e6fe178e72" />



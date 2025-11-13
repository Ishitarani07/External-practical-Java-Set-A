# External-practical-Java-Set-A
Complete Java JDBC CRUD program connected to the MySQL database employeedb with table employee (id, name, salary)
## 🚀 Features
- Connect Java program to MySQL database using JDBC.
- Perform CRUD operations on the `employee` table:
  - **Create** → Insert new employee records  
  - **Read** → Retrieve and display employee data  
  - **Update** → Modify existing records  
  - **Delete** → Remove records from the table
- Clean and modular Java code with comments for easy understanding.

---

## 🧩 Technologies Used
- **Java (JDK 17 or above)**
- **Eclipse IDE**
- **MySQL Server & Workbench**
- **JDBC (Java Database Connectivity)**

---

## 🗄️ Database Details
**Database Name:** `employee`  
**Table Name:** `Employee`  

| Column Name | Data Type | Description |
|--------------|------------|--------------|
| EmpID | INT (Primary Key) | Employee ID |
| Name | VARCHAR(50) | Employee Name |
| Salary | DOUBLE | Employee Salary |

---

## ⚙️ How to Run the Project
1. **Create Database**
   ```sql
   CREATE DATABASE employee;
   USE employee;

   CREATE TABLE Employee (
       EmpID INT PRIMARY KEY AUTO_INCREMENT,
       Name VARCHAR(50),
       Salary DOUBLE
   );

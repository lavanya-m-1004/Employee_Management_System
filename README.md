# 🧑‍💼 Employee Management System

## JDBC + MySQL | Console-Based CRUD Application

<div align="center">

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white)
![JDBC](https://img.shields.io/badge/JDBC-Database%20Connectivity-blue?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)

</div>

A lightweight Java application that connects to a MySQL database via **JDBC** and performs full **CRUD** (Create, Read, Update, Delete) operations on employee records — all from the console.

---

## 🔍 Overview

This project demonstrates how a Java application can talk directly to a **MySQL** database using **JDBC** (Java Database Connectivity) — no frameworks, no ORM, just raw, well-structured SQL and Java. It's designed as a clean, beginner-to-intermediate portfolio project that shows real understanding of database connectivity fundamentals.

---

## ✨ Features

| # | Feature | Description |
|---|----------|-------------|
| 🟢 | **Create** | Insert new employee records into the database |
| 🔵 | **Read** | Fetch and display all employee records |
| 🟡 | **Update** | Modify an existing employee's salary |
| 🔴 | **Delete** | Remove an employee record by ID |
| 🔐 | **Secure Queries** | Uses `PreparedStatement` to prevent SQL Injection |
| 🆔 | **Auto-Generated IDs** | Employee IDs are auto-incremented by MySQL |

---

## 🛠️ Tech Stack

| Layer | Technology |
|-------|------------|
| 💻 Language | Java |
| 🗄️ Database | MySQL |
| 🔌 Connectivity | JDBC (MySQL Connector/J) |
| 🖥️ Interface | Console (Command Line) |

---

## 📁 Project Structure

```
employee-management-system/
├── 📄 README.md
├── 📄 LICENSE
├── 📄 .gitignore
├── 📂 assets/
├── 📂 sql/
│   └── 📜 init.sql                     # Database + table creation script
└── 📂 src/
    └── ☕ Main.java  # Main application (CRUD logic)
```

---

## 🚀 Getting Started

### ✅ Prerequisites
- ☕ JDK 8 or above
- 🗄️ MySQL Server installed and running
- 📦 MySQL Connector/J (`.jar` file)

### 1️⃣ Set up the database
```bash
mysql -u root -p < sql/init.sql
```
This creates the `employee_db` database and the `employee` table.

### 2️⃣ Download the JDBC driver
Get `mysql-connector-j-8.3.0.jar` from the
[official MySQL site](https://dev.mysql.com/downloads/connector/j/).

### 3️⃣ Compile the program
```bash
javac -cp .:mysql-connector-j-8.3.0.jar src/EmployeeManagementSystem.java -d out
```

### 4️⃣ Run the program
> 🔐 Your MySQL password is **never** hardcoded — pass it as an argument.

```bash
java -cp out:mysql-connector-j-8.3.0.jar EmployeeManagementSystem your_mysql_password
```

---

## 🖥️ Sample Output

```
Connected to MySQL Successfully!
Employee inserted successfully! Generated ID: 1

Employee Records:
1 Lavanya IT 25000.0

Employee updated successfully!
Employee deleted successfully!
```

---

## 📚 Key Concepts Demonstrated

| Concept | Where It's Used |
|---------|------------------|
| 🔗 `DriverManager.getConnection()` | Establishing a JDBC connection |
| 🛡️ `PreparedStatement` | All INSERT / UPDATE / DELETE / SELECT queries |
| 🆔 `Statement.RETURN_GENERATED_KEYS` | Retrieving the auto-incremented employee ID |
| ♻️ try-with-resources | Auto-closing `Connection`, `Statement`, `ResultSet` |
| 🔐 Command-line password argument | Keeping credentials out of source code |

---

## 🔒 Security Notes

- ❌ No hardcoded database credentials
- ✅ Password supplied at runtime via command-line argument
- ✅ All SQL queries use parameter binding (`?` placeholders) — immune to SQL Injection

---

## 🌱 Future Enhancements

- [ ] Add a console menu for repeated CRUD operations (loop-based)
- [ ] Externalize DB config into a `.properties` file
- [ ] Add input validation and error handling for edge cases
- [ ] Convert to a DAO-pattern, multi-class architecture
- [ ] Build a REST API layer using Spring Boot

---

## 👩‍💻 Author

**Lavanya**

B.Sc. Computer Science

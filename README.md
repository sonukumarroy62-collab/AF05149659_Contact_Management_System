# AF05149659_Contact_Management_System
# 📇 Contact Management System (Java + JDBC + MySQL)

The **Contact Management System** is a console-based Java application that allows users to efficiently manage their personal or professional contacts. This project demonstrates the use of **JDBC (Java Database Connectivity)** to perform CRUD operations with a MySQL database.

It is designed as a beginner-to-intermediate level project to understand **database integration, object-oriented programming, and real-world application development**.

---

## 🎯 Features

* ➕ Add new contacts
* 📋 View all contacts
* ✏️ Update contact details
* ❌ Delete contacts
* 🔍 Search contacts (optional enhancement)

---

## 🛠️ Tech Stack

* **Language:** Java
* **Database:** MySQL
* **Connectivity:** JDBC
* **IDE:** Eclipse / IntelliJ

---

## 📁 Project Structure

```
ContactManagementSystem/
│
├── src/com/app/
│   ├── DBConnection.java
│   ├── Contact.java
│   ├── ContactDAO.java
│   └── MainApp.java
│
└── database.sql
```

---

## 🗄️ Database Schema

```sql
CREATE DATABASE address_book;

USE address_book;

CREATE TABLE contacts (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    phone VARCHAR(15),
    email VARCHAR(100)
);
```

---

## ▶️ How to Run the Project

1. Clone the repository
2. Import project into your IDE
3. Create database in MySQL using `database.sql`
4. Update database credentials in `DBConnection.java`
5. Add MySQL JDBC driver
6. Run `MainApp.java`

---

## 🧪 Sample Output

```
1. Add Contact
2. View Contacts
3. Update Contact
4. Delete Contact
5. Exit
```

---

## 📌 Learning Outcomes

* Understanding of JDBC connectivity
* CRUD operations with MySQL
* Layered architecture (DAO pattern)
* Console-based application design

---

# TechPark-Visitor-Entry-Management System

## Overview

This project is a **backend application** developed using **Spring Boot** and the **Spring Framework** to create **CRUD (Create, Read, Update, Delete) REST APIs** for a **Visitor Entry Management System**. Data is handled in **JSON** format, stored in a **MySQL** database, and all endpoints are thoroughly tested using **Postman**.

This application demonstrates strong backend development skills, including **layered architecture (MVC/N-Tier)**, **REST API design**, **database integration (Spring Data JPA)**, and **efficient data handling**.

## ✨ Features

* **Add** new visitor details.
* **Get** all visitor records.
* **Fetch** visitor details by ID.
* **Update** visitor information.
* **Delete** visitor records.
* **MySQL** database integration using **Spring Data JPA**.
* Clean, scalable layered architecture (**Controller → Service → Repository → Entity/Model**).
* **JSON** request and response-based APIs tested using **Postman**.

---

## 🛠 Technologies Used

| Category | Technology | Version / Tool |
| :--- | :--- | :--- |
| **Language** | Java | 17+ |
| **Framework** | Spring Boot | 3.x |
| **Modules** | Spring Web, Spring Data JPA | |
| **Database** | MySQL | |
| **Build Tool** | Maven | |
| **API Testing** | Postman | |

---

## 🔗 API Endpoints

The base URL for all endpoints is assumed to be `http://localhost:8080/` (or your configured port).

| Method | Endpoint | Description |
| :--- | :--- | :--- |
| **POST** | `/visitor/add` | Add a new visitor record. |
| **GET** | `/visitor/all` | Fetch all visitor records. |
| **GET** | `/visitor/{id}` | Get a specific visitor by their ID. |
| **PUT** | `/visitor/update/{id}` | Update the details of an existing visitor. |
| **DELETE** | `/visitor/delete/{id}` | Remove a visitor record by ID. |

---

## 📂 Project Structure
---

## 📸 Project Screenshots

Based on the file names you provided, here are the likely screenshots demonstrating the project's structure and functionality:

| Screenshot Description | Corresponding File Name |
| :--- | :--- |
| **Controller Layer Example** | `controllerlayer.png` |
| **Service Layer Example** | `servicelayer.png` |
| **Repository Layer Example** | `Repositorylaye.png` |
| **Entity/Model Class** | `Entityclass.png` |
| **Database Connection/Config** | `databaseconne ction.png` |
| **POST - Add New Visitor (Postman Test)** | `insertpostman.png` |
| **SQL Insert Query (Example)** | `insertsql1.png` |
| **GET - Fetch All Visitors** | `fetchallcompa ny.png` or `fetchallname.png` |
| **PUT - Update Visitor (SQL)** | `updatesql1.png` |
| **DELETE - Visitor (SQL)** | `deletesql1.png` |

**Note:** You should rename the screenshot files in your repository to be more consistent (e.g., `post_add_visitor.png`, `get_all_visitors.png`, etc.) for clearer referencing.

---

## ⚙️ How to Run

1.  **Clone** the repository to your local machine.
    ```bash
    git clone [Your Repository URL]
    ```
2.  **Open** the project in your IDE (Eclipse/IntelliJ/VS Code).
3.  **Create** a new MySQL database (e.g., `techpark_db`).
4.  **Configure** your database connection details (username, password, and database name) in `src/main/resources/application.properties`.
5.  **Run** the Spring Boot application (e.g., by running the `mainclass.java` file).
6.  **Test** the API endpoints listed above using **Postman** or any other REST client.

---

## 📌 Conclusion

This project is a solid demonstration of core backend development principles, including robust **CRUD** operations, clean **REST API** implementation, **JSON** data handling, and professional **database management** using Spring Boot and MySQL.



# 📌 Billing System (Learning Project)

## 🚀 Overview
This is a **Spring Boot-based Billing and Student Management System** designed as a learning project to understand real-world backend development.

The application simulates a **multi-branch institute system**, where:
- Admin manages branches and users
- Branch users manage students and payments

This project focuses on **clean architecture, database design, and scalability**.

---

## 🎯 Learning Goals

- Understand **Spring Boot project structure**
- Learn **REST API development**
- Implement **JPA/Hibernate relationships**
- Design **normalized database schema**
- Practice **Git & GitHub workflow**
- Build **production-level coding habits**

---

## 🏗️ Tech Stack

- **Backend**: Spring Boot  
- **Database**: PostgreSQL  
- **ORM**: Spring Data JPA (Hibernate)  
- **Build Tool**: Maven  
- **Version Control**: Git + GitHub  

---

## 📁 Project Structure
com.billing.project
│
├── controller → REST APIs
├── service → Business logic
├── repository → Database access
├── entity → JPA entities
├── dto → Data transfer objects (future)
├── config → Configurations (future)
└── exception → Global exception handling (future)



---

## 🧱 Features Implemented

### ✅ Phase 1: Basic Setup
- Spring Boot project initialized
- Maven dependencies configured
- PostgreSQL connection setup
- First API created (`/students`)

---
#### 📌 Student Entity
Stores student details


## 🗄️ Database Design

### Student Table
| Column     | Type   |
|------------|--------|
| id         | PK     |
| name       | String |
| email      | String |
| phone      | String |
| branch_id  | FK     |

---

## 🔁 API Endpoints

### 📌 Branch APIs
- `POST /branches` → Create branch  
- `GET /branches` → Get all branches  

---

### 📌 Student APIs
- `POST /students` → Create student  
- `GET /students` → Get all students  

---

## 🧪 Sample Requests



{
  "name": "Rahul",
  "email": "rahul@test.com",
  "phone": "9999999999",
  "branch": {
    "id": 1
  }
}
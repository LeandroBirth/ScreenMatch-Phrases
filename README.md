# ScreenMatch-Phrases

This webpage uses a MySQL database containing famous quotes from movies. It is powered by a **Java backend** and features a simple front-end for easy navigation and execution. The front-end is hosted on **GitHub Pages**, while the backend and database are hosted on **Fly.io** and **PlanetScale** respectively.

Click on the image below to access the page and explore your favorite movie quotes:

[![ScreenMatch-Phrases](https://github.com/user-attachments/assets/2d339403-bff2-4d99-8fc5-838e0c978ff1)](https://<your-github-pages-link>)

---

## 💻 Technologies Used

### Backend Dependencies
The backend leverages the following technologies:

- **Spring Boot Actuator**: Monitoring and management.
- **Spring Boot Web**: RESTful APIs and web functionalities.
- **Spring Data JPA**: Simplified data access with ORM.
- **Micrometer Tracing (Brave)**: Distributed tracing support.
- **Spring Boot DevTools**: Development-time tools for faster iterations.
- **MySQL Connector**: MySQL database integration.
- **Spring Boot Test**: Testing utilities for Spring Boot applications.
- **Jakarta Persistence API**: JPA compliance and persistence handling.
- **Lombok**: Reduces boilerplate code with annotations.

### Hosting and Database
- **GitHub Pages**: Hosts the front-end.
- **Fly.io**: Hosts the Java backend.
- **PlanetScale**: MySQL-compatible database.

---

## 🚀 How to Run the Project Locally

### Prerequisites
Make sure you have the following installed:
- Java 17 or later
- Maven
- Docker (optional for running the app in a container)
- MySQL (optional for a local database setup)

### Steps
1. Clone the repository:
   ```bash
   git clone https://github.com/LeandroBirth/ScreenMatch-Phrases.git
   cd ScreenMatch-Phrases


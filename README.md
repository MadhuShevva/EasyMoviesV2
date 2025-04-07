# 🎬 EasyMovies - DevOps Enabled Java Project

**EasyMovies** is a Java-based application that demonstrates the integration of essential DevOps tools like **JUnit**, **GitHub**, **Jenkins**, and **Maven**. This project showcases automation of software delivery through Continuous Integration and Continuous Deployment (CI/CD) practices.

---

## ✅ 1. JUnit Test Cases

We implemented multiple unit tests using **JUnit** to verify the application's correctness and stability.

### 🧪 Test Classes
- `MovieTest.java`
- `BookingTest.java`
- `UserTest.java`

### 🔍 Key Test Methods
- `testAddMovie()` – Tests the logic for adding a movie.
- `testDeleteMovie()` – Verifies correct deletion of a movie.
- `testUpdateMovieDetails()` – Ensures the update functionality works as expected.
- `testSearchMovieByGenre()` – Tests search functionality by genre.
- `testValidateMovieData()` – Validates the integrity of input data.

> We used annotations like `@Test`, `@BeforeEach`, and `@AfterEach` to structure and manage the tests effectively.

---

## 📁 2. GitHub Integration

We used **Git** for version control and integrated our repository with **Jenkins** for automated builds and deployments.

### 🔧 Git Commands Used

```bash
git init
git add .
git commit -m "Initial commit with JUnit tests"
git remote add origin https://github.com/your-username/EasyMoviesV2.git
git push -u origin main

---

## 🛠️ 3. Maven Setup

**Apache Maven** was used for building the project and managing dependencies like JUnit.

### ⚙️ Common Maven Commands

```bash
mvn compile        # Compile source code
mvn test           # Run unit tests
mvn clean install  # Clean, compile, test, and package the application


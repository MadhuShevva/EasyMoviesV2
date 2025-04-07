# 🎬 EasyMovies - DevOps Enabled Java Project

This is a Java-based application named **EasyMovies**, enhanced with essential DevOps tools like **JUnit**, **GitHub**, **Jenkins**, and **Maven**. It demonstrates automation of software delivery via Continuous Integration and Continuous Deployment (CI/CD) practices.

---

## ✅ 1. JUnit Test Cases

We implemented multiple test cases using **JUnit** to ensure our application's correctness and robustness.

### Test Classes:
- `MovieTest.java`
- `BookingTest.java`
- `UserTest.java`

### Key Test Methods:
- `testAddMovie()`: Tests the logic for adding a movie.
- `testDeleteMovie()`: Verifies if movies are deleted correctly.
- `testUpdateMovieDetails()`: Ensures the update feature works properly.
- `testSearchMovieByGenre()`: Tests genre-based search logic.
- `testValidateMovieData()`: Validates the integrity of input data.

> We used annotations like `@Test`, `@BeforeEach`, and `@AfterEach` to manage test execution efficiently.

---

## 📁 2. GitHub Integration

We used Git for version control and connected our repository to Jenkins for CI/CD.

### 🔧 Git Commands Used:

```bash
git init
git add .
git commit -m "Initial commit with JUnit tests"
git remote add origin https://github.com/your-username/EasyMovies.git
git push -u origin main

----
## 🛠️ 3. Maven Setup

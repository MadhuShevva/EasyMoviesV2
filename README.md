# EasyMovies - DevOps Enabled Java Project

This project is a Java-based application named **EasyMovies**, enhanced with DevOps tools such as **JUnit**, **GitHub**, **Jenkins**, and **Maven**. The project demonstrates automation through Continuous Integration and Delivery pipelines.

---

## ✅ 1. JUnit Test Cases

We have written different JUnit test cases to verify the core functionalities of the EasyMovies application. These include:

- `testAddMovie()`: Tests addition of a new movie.
- `testDeleteMovie()`: Tests deletion logic for a movie.
- `testUpdateMovieDetails()`: Validates updating a movie’s info.
- `testSearchMovieByGenre()`: Tests searching logic by genre.
- `testValidateMovieData()`: Ensures input data is valid.

JUnit provides annotations like `@Test`, `@BeforeEach`, and `@AfterEach` to manage test flows efficiently.

---

## 📁 2. GitHub Integration

### GitHub Commands Used:

```bash
git init
git add .
git commit -m "Initial commit with JUnit tests"
git remote add origin https://github.com/your-username/EasyMovies.git
git push -u origin main

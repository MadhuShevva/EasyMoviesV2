
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
- `testAddMovie()` – Tests the logic for adding a movie.
- `testDeleteMovie()` – Verifies correct deletion of a movie.
- `testUpdateMovieDetails()` – Ensures the update functionality works as expected.
- `testSearchMovieByGenre()` – Tests search functionality by genre.
- `testValidateMovieData()` – Validates the integrity of input data.

> We used annotations like `@Test`, `@BeforeEach`, and `@AfterEach` to structure and manage the tests effectively.

---

## 📁 2. GitHub Integration

We used Git for version control and integrated our repository with **Jenkins** for automated builds and deployments.

### 🛠️ Git Commands Used:

```
git init
git add .
git commit -m "Initial commit with JUnit tests"
git remote add origin https://github.com/your-username/EasyMoviesV2.git
git push -u origin main
```

---

## ⚡ 3. Maven Setup

**Apache Maven** was used for building the project and managing dependencies like JUnit.

### 🔧 Common Maven Commands

```
mvn compile        # Compile source code  
mvn test           # Run unit tests  
mvn clean install  # Clean, compile, test, and package the application  
```

### 📦 Sample `pom.xml` Dependencies

```xml
<dependencies>
    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>4.13.2</version>
        <scope>test</scope>
    </dependency>
</dependencies>
```

---

## 🔁 4. Jenkins Integration (CI/CD Pipeline)

We automated the testing and build process using Jenkins by configuring a CI/CD pipeline.

### 🧩 Steps Followed:
- Installed Jenkins and configured Maven & JDK.
- Created a Freestyle Jenkins project.
- Connected GitHub repo under Source Code Management.
- Enabled SCM Polling to auto-trigger builds when changes are pushed to GitHub.

### ✅ Build Triggers:
- Checked **Poll SCM** with `* * * * *` for every-minute polling.

---

## 🛠️ 5. Jenkinsfile (Declarative Pipeline)

*(Optional)* You can use the following `Jenkinsfile` if you choose a Pipeline job instead of Freestyle:

```groovy
pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }
}
```

---

## 📂 Project Structure

```
EasyMovies/
│
├── src/
│   ├── main/
│   │   └── java/com/easymovies/
│   │       ├── Movie.java
│   │       ├── Booking.java
│   │       └── User.java
│   └── test/
│       └── java/com/easymovies/
│           ├── MovieTest.java
│           ├── BookingTest.java
│           └── UserTest.java
├── pom.xml
└── README.md
```

---


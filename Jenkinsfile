pipeline {
    agent any

    tools {
        maven 'Maven 3.8.1'  // Make sure this name matches the one in Jenkins tools config
        jdk 'JDK 17'         // Same here
    }

    stages {
        stage('Clone Repository') {
            steps {
                git 'https://github.com/MadhuShevva/EasyMoviesV2.git'
            }
        }
        stage('Build Project') {
            steps {
                bat 'mvn clean install'
            }
        }
        stage('Run Tests') {
            steps {
                bat 'mvn test'
            }
        }
        stage('Package') {
            steps {
                bat 'mvn package'
            }
        }
    }

    post {
        failure {
            echo 'Build or tests failed. Check the logs for more info.'
        }
    }
}

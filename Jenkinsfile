pipeline {
    agent any

    tools {
        maven 'Maven 3.9.6' // Use your Jenkins Maven version name
    }

    stages {
        stage('Checkout Code') {
            steps {
                git 'https://github.com/MadhuShewva/EasyMoviesV2.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Archive Test Results') {
            steps {
                junit '**/target/surefire-reports/*.xml'
            }
        }
    }
}

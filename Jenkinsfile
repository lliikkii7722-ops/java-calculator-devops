pipeline {
    agent any

    tools {
        maven 'Maven'
    }

    stages {
        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv('SonarQube') {
                    bat 'mvn org.sonarsource.scanner.maven:sonar-maven-plugin:4.0.0.4121:sonar -Dsonar.projectKey=java-calculator -Dsonar.token=%SONAR_AUTH_TOKEN%'
                }
            }
        }

        stage('Package') {
            steps {
                bat 'mvn package'
            }
        }
        stage('Docker Build') {
            steps {
                bat 'docker build -t java-calculator .'
            }
        }

        stage('Docker Run') {
            steps {
                bat 'docker run -d -p 8081:8080 java-calculator'
            }
        }
    }
}
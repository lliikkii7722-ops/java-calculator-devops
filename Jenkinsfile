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
                    bat 'mvn sonar:sonar -Dsonar.login=sqp_d4dea7dd5645d8d21292c3db86b582e4f744a6a7'
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
                bat 'docker run --rm java-calculator'
            }
        }
    }
}
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
                    bat """
                    mvn clean verify sonar:sonar ^
                    -Dsonar.projectKey=java-calculator ^
                    -Dsonar.projectName=java-calculator ^
                    -Dsonar.token=sqp_917e6dd3d6af5649795cc7d2e03a836cacaa3b57
                    -Dsonar.coverage.jacoco.xmlReportPaths=target/site/jacoco/jacoco.xml
                    """
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
                bat 'docker rm -f java-calculator-container || exit 0'
                bat 'docker run -d --name java-calculator-container -p 9090:9090 java-calculator'
            }
        }
    }
}
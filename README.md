# Java Calculator DevOps CI/CD Pipeline

[![Live Demo](https://img.shields.io/badge/Live%20Demo-Render-blue)](https://java-calculator-devops.onrender.com/)
[![Java](https://img.shields.io/badge/Java-Maven-orange)]()
[![CI/CD](https://img.shields.io/badge/CI%2FCD-Jenkins-red)]()
[![Docker](https://img.shields.io/badge/Container-Docker-blue)]()
[![Kubernetes](https://img.shields.io/badge/Orchestration-Kubernetes-blue)]()
[![SonarQube](https://img.shields.io/badge/Code%20Quality-SonarQube-brightgreen)]()

## Project Overview

This project demonstrates an end-to-end DevOps CI/CD pipeline for a Java Calculator application.

The application is built using Java, Maven, and JUnit. The complete DevOps workflow is automated using Jenkins. The pipeline includes source code management with GitHub, automated build and testing, SonarQube code quality analysis, Docker containerization, Render cloud deployment, and Kubernetes deployment using Docker Desktop.

## Live Deployment

The application is deployed on Render and can be accessed here:

[Live Application](https://java-calculator-devops.onrender.com/)

## Tech Stack

* Java
* Maven
* JUnit
* GitHub
* Jenkins
* SonarQube
* Docker
* Render
* Kubernetes
* Docker Desktop
* kubectl

## CI/CD Pipeline Flow

```text
Developer pushes code to GitHub
        ↓
Jenkins pulls the latest code from GitHub
        ↓
Maven compiles the Java project
        ↓
JUnit test cases are executed
        ↓
SonarQube performs static code analysis
        ↓
Quality Gate is verified
        ↓
Docker image is built
        ↓
Application is deployed to Render
        ↓
Application is deployed to Kubernetes
        ↓
Deployment is verified using kubectl commands
```

## Features

* Java Calculator application
* Maven-based project structure
* Unit testing using JUnit
* Jenkins Pipeline from SCM
* Automated build, test, and package stages
* SonarQube static code analysis
* Quality Gate verification
* Docker image creation
* Render cloud deployment
* Kubernetes deployment using YAML files
* Kubernetes service exposure and verification using port-forwarding

## Project Architecture

```text
GitHub
  ↓
Jenkins
  ↓
Maven Build
  ↓
JUnit Testing
  ↓
SonarQube Analysis
  ↓
Docker Image
  ↓
Render Deployment
  ↓
Kubernetes Deployment
```

## Jenkins Pipeline Stages

The Jenkins pipeline automates the following stages:

1. Checkout source code from GitHub
2. Compile the Java project using Maven
3. Run JUnit test cases
4. Package the application
5. Perform SonarQube analysis
6. Verify SonarQube Quality Gate
7. Build Docker image
8. Deploy the application
9. Verify deployment

## Docker

The application is containerized using Docker. A Docker image is created from the Java application and used for deployment.

Common Docker commands used:

```bash
docker build -t java-calculator .
docker images
docker run -p 9090:9090 java-calculator
docker ps
```

## Kubernetes Deployment

The application is deployed to Kubernetes using Docker Desktop Kubernetes.

Kubernetes resources used:

* Deployment
* Service
* Pod
* NodePort
* Port-forwarding

Kubernetes verification commands:

```bash
kubectl get nodes
kubectl get deployments
kubectl get pods
kubectl get svc
kubectl describe svc java-calculator-service
kubectl port-forward svc/java-calculator-service 9090:80
```

The application was successfully verified using:

```text
http://localhost:9090
```

## Render Deployment

The application is deployed on Render for cloud access. Render automatically builds and runs the application from the connected GitHub repository, making it available online without needing the local system to be running.

Live URL:

```text
https://java-calculator-devops.onrender.com/
```

## Problems Faced and Solved

### Jenkins Branch Issue

The Jenkins pipeline initially had a branch mismatch issue. It was fixed by using the correct branch configuration:

```text
*/main
```

### Duplicate Git Clone Stage

A duplicate Git clone stage was removed because Pipeline from SCM already checks out the repository automatically.

### SonarQube Token Authentication Issue

The SonarQube authentication issue was fixed by generating and using a proper SonarQube token in Jenkins.

### kubectl Context Issue

kubectl was initially pointing to the wrong or inactive Kubernetes server. The context was verified using:

```bash
kubectl config current-context
```

### NodePort Access Issue

Direct NodePort access was not working on localhost, so the application was verified using Kubernetes port-forwarding:

```bash
kubectl port-forward svc/java-calculator-service 9090:80
```

## Screenshots

Add project screenshots inside a folder named `screenshots`.

Recommended screenshots:

* Jenkins pipeline success
* SonarQube Quality Gate passed
* Docker container running
* Render deployment
* Kubernetes pods running
* Kubernetes service details
* Port-forward verification
* Application running locally

Example:
<img width="1254" height="1254" alt="ChatGPT Image Jun 2, 2026, 09_00_15 PM" src="https://github.com/user-attachments/assets/d47ba9c0-3be8-4ce7-8538-0fd6ae40503b" />

## Project Outcome

This project helped me understand the complete DevOps lifecycle, including:

* Source code management
* Build automation
* Unit testing
* Static code analysis
* Code quality gate verification
* Docker containerization
* Cloud deployment
* Kubernetes orchestration
* Service exposure
* Deployment verification
* Debugging real DevOps issues

## Interview Summary

This is an end-to-end DevOps CI/CD pipeline project for a Java Maven application. The source code is managed in GitHub, Jenkins automates the build and test process, SonarQube performs code quality analysis, Docker is used for containerization, Render is used for cloud deployment, and Kubernetes is used for container orchestration.

The Kubernetes deployment was verified using kubectl commands. The pods were running successfully, the service had valid endpoints, and the application was accessed locally using port-forwarding.

## Resume Point

Built an end-to-end CI/CD pipeline for a Java Maven application using Jenkins, GitHub, JUnit, SonarQube, Docker, Render, and Kubernetes with automated build, test, code analysis, containerization, and deployment.
## Author

Likitha H K

B.Tech Computer Science Engineering

## License

This project is developed for educational, research, and portfolio purposes.


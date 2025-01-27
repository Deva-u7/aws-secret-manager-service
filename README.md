# AWS Secret Manager Service

## Overview
This repository demonstrates how to read environment values from AWS Secret Manager using a Java-based Spring Boot application.

## Prerequisites
- Java Development Kit (JDK) 16 or higher
- AWS Account
- AWS CLI configured with necessary permissions

## Setup

### 1. Clone the repository
```sh
git clone https://github.com/Deva-u7/aws-secret-manager-service.git
cd aws-secret-manager-service
```

### 2. Configure AWS Secret Manager
1. Go to AWS Management Console.
2. Navigate to AWS Secret Manager.
3. Create a new secret or use an existing one.
4. Store your environment variables as key-value pairs.

### 3. Update your AWS credentials
Ensure your AWS credentials are configured. You can set up your credentials using the AWS CLI:
```sh
aws configure
```

### 4. Build the project
This project uses Maven. To build the project, run:
```sh
mvn clean install
```

## Running the Application
1. To run the application, execute:
```sh
mvn spring-boot:run
```
2. The application will start and read the environment values from AWS Secret Manager.

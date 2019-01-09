# CloudCMR Project

## Overview
This project is to help the CMR to develop and enhance their IT by having a new application. This is the backoffice, in API Rest mode, that communicates with a front.

## TODO List
* [x] Adding Spring-boot, data and rest to manage the entities
* [x] Adding the connectivity to a Database
* [ ] Adding Flyway to manage the Database migration
* [ ] Adding security to avoid unwanted connection
* [x] Dealing with the tests accounts and environments

## Local development (using spring boot & docker)
You can develop locally by using spring boot & a mysql database in a docker container.

### Setup
If you are developing local, you have to use the spring profile "dev". To do so, you can set the spring profile in your 
environment variable.
```
export SPRING_PROFILES_ACTIVE=dev
```
You also need to have docker installed on your computer.

### How to start
You first need to start the database:
```
docker-compose up -d db
```
Then, you can run the application with the command:
```
./mvnw spring-boot:run
```
Alternatively, you can run by passing the spring profile in args (this will override the environment variable):
```
./mvnw -Dspring.profiles.active=dev spring-boot:run
```

## Local development (using gcp)
You can develop locally by using spring boot & and the gcp SQL

### Setup
Please, avoid using your google end user to build and run the project.
Make sure you are using one account from the service account. 
Then, set the environment variable : 
```
export GOOGLE_APPLICATION_CREDENTIALS="/path/json/credential/file.json"
```
You also have to reset the spring profile to use the default one
```
unset SPRING_PROFILES_ACTIVE
```
### How to start
If you are developing using the gcp stack (keep in mind that you need internet !!), execute the command:
```
./mvnw -Pgcp appengine:run
```

## Deploy on GCP
Once you are ready, you can deploy the application by executing:
```
./mvnw -Pgcp appengine:deploy
```
# CloudCMR Project

## Overview
This project is to help the CMR to develop and enhance their IT by having a new application. This is the backoffice, in API Rest mode, that communicates with a front.

## TODO List
* [x] Adding Spring-boot, data and rest to manage the entities
* [x] Adding the connectivity to a Database
* [ ] Adding Flyway to manage the Database migration
* [ ] Adding security to avoid unwanted connection
* [ ] Dealing with the tests accounts and environments

## Setup
Please, avoid using your google end user to build and run the project.
Make sure you are using one account from the service account. 
Then, set the env var : 
```
export GOOGLE_APPLICATION_CREDENTIALS="/path/json/credential/file.json
```

## Start me
### If you are developing local
```
./mvnw -Dspring.profiles.active=dev spring-boot:run
```
### If you are developing and using the gcp sql database (you need internet !!)
```
./mvnw -Pgcp spring-boot:run
```

## Deploy me
```
./mvnw -Pgcp appengine:deploy
```
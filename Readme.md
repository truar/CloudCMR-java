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
Then, set the env var : `export GOOGLE_APPLICATION_CREDENTIALS="/path/json/credential/file.json"`

## Start me
```
./mvnw spring-boot:run
```

## Deploy me
```
./mvnw appengine:deploy
```
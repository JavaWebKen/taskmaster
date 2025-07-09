#  Building an SPA Using Spring Framework 6 and Angular


## Tools:
- JDK (21)
- Docker
- Node
- IntelliJ
- VS Code
- Gradle
- Bruno (to test API's)

---

## #java

```bash
sdk list java
sdk install java 21.0.6-tem
sdk use java 21.0.6-tem
# If you want to set it globally:
sdk default java 21.0.2-tem
```

---

## #docker

```bash
docker --version
# Output:
Docker version 27.5.1, build 9f9e405
```

---

## #node

```bash
node -v
# Not installed

# Install NVM:
curl -o- https://raw.githubusercontent.com/nvm-sh/nvm/v0.39.7/install.sh | bash

# Source to run now instead of restarting terminal:
source ~/.nvm/nvm.sh

nvm --version
# Output:
0.39.7

# Install latest LTS:
nvm install --lts

node -v
# Output:
v22.15.0

npm -v
# Output:
10.9.2

# For particular version:
nvm install 20
nvm use 20
nvm alias default 20
```

---

## #intellij

- IntelliJ IDEA 2024.3.2.2 (Community Edition)

---

## #vs code

- Version: 1.99.3 (Universal)

---

## Project: Build with Spring Initializr

- **Project:** Gradle  
- **Language:** Java 21  
- **Spring Boot:** 3.4.5  
- **Packaging:** JAR  
- **Java:** 21

### Dependencies:
- Spring Web  
- H2 Database  
- MariaDB Driver  
- Spring Data JPA  
- Lombok

---

## Startup in IntelliJ

> * Don’t forget to change your project settings to Java 21
> * Select Run button in IntelliJ
> * or

## Gradle
 
> ./gradlew bootRun

## Maven (not on this project)
> spring-boot:run

## #Docker Run

```bash
docker run --name docker-mariadb \                                                      
-p 3306:3306 \
-e MARIADB_USER=mariadb \
-e MARIADB_PASSWORD=mariadb \
-e MARIADB_ROOT_PASSWORD=rootpass \
-e MARIADB_DATABASE=mydb \
-d \
mariadb:latest
```
## Note:  Make sure Docker is running since mariadb is running as a Docker Container

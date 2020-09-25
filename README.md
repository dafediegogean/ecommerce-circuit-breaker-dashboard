# E-commerce Circuit Breaker Dashboard

An microservice with Java 11, Spring Cloud Hoxton SR4, Netflix Hystrix, Netflix Turbine, Eureka Client and Spring Cloud Config Client

## Reference Documentation

### Provider Server

-   ecommerce-circuit-breaker-dashboard

### Description

> **ecommerce-circuit-breaker-dashboard**

Microservice responsible for latency and fault tolerance library designed to isolate points
of access to remote systems, services and 3rd party libraries, stop cascading failure and enable 
resilience in complex distributed systems where failure is inevitable.

## Installation

-   Docker: [https://docs.docker.com/get-docker/](https://docs.docker.com/get-docker/)
-   Maven: [https://maven.apache.org/install.html](https://maven.apache.org/install.html)

## Starting services

### 1. Build Project

```
$ mvn clean install -U
```

### 2. Build docker image

```
$ docker build -t ${APPLICATION_NAME}:latest
```

### 3. Run the container

```
$ docker run -d --rm --network=host ${APPLICATION_NAME}:latest
```

-   Use the host's network stack inside the container.

### 4.Removing and cleaning the containers

```
$ docker stop ${CONTAINER_ID}
```

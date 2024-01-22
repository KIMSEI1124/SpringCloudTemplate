# Config Server

**Spring Cloud Config Server**

## QuickStart

**with Shell**

```shell
./gradlew bootRun
```

**with Docker**

```shell
sh deploy.sh
```

## Version

- Java 17
- Spring Boot 3.2.2

## Dependencies

1. [Spring Boot Starter Actuator](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-actuator)
2. [Spring Cloud Config Server](https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-config-server)
3. [Spring Cloud Starter Netflix Eureka Client](https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-starter-netflix-eureka-client)
4. [Spring Boot Starter AMQP](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-amqp)

## Properties Docs

1. [application.yml](https://github.com/KIMSEI1124/SpringCloudTemplate/tree/main/config-server/src/main/resources)
2. [rabbitmq](https://github.com/KIMSEI1124/SpringCloudTemplate/blob/main/config-server/rabbitmq.md)
# API Gateway

**Spring Cloud API Gateway**

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

1. [Spring Cloud Config Server](https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-config-server)
2. [Spring Boot Starter Actuator](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-actuator)
3. [Spring Cloud Starter Netflix Eureka Client](https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-starter-netflix-eureka-client)
4. [Spring Boot Starter AMQP](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-amqp)
5. [Spring Boot Starter Data Redis](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-data-redis)
6. [Project Lombok](https://mvnrepository.com/artifact/org.projectlombok/lombok)

## Properties

1. [application.yml](https://github.com/KIMSEI1124/SpringCloudTemplate/tree/main/api-gateway/src/main/resources)
2. [redis](https://github.com/KIMSEI1124/SpringCloudTemplate/blob/main/api-gateway/redis.md)
3. [rabbitmq](https://github.com/KIMSEI1124/SpringCloudTemplate/blob/main/config-server/rabbitmq.md)
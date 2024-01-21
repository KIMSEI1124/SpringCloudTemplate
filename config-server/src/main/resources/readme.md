# yml

```yaml
server:
  port: 8888 #1

eureka:
  instance:
    instance-id: ${spring.application.name}:${server.port}
  client:
    register-with-eureka: true #2.1
    fetch-registry: true       #2.2
    service-url:
      defaultZone: http://127.0.0.1:8761/eureka #3 변경 필요

spring:
  application:
    name: config-server
  cloud:
    config:
      server:
        # 테스트 환경을 위한 `git-uri` 입니다.
        git: #4
          uri: https://github.com/KIMSEI1124/SpringCloudTemplate #4.1
          default-label: main #4.2
          username: #4.3
          password:
  rabbitmq: #5 변경필요
    host: 127.0.0.1
    port: 5672
    username: guest
    password: guest

management:
  endpoints:
    web:
      exposure:
        include: health, busrefresh
```

1. 공식 문서에서 제공하는 기본 포트입니다.
2. 유레카 서버에 등록하기 위해 `true`로 설정하였습니다.
3. 유레카 서버에 등록하기 위한 `url` 입니다. 추후 배포를 한다면 변경이 필요합니다.
4. 테스트 환경을 위한 `git-uri` 입니다.
    1. 환경 설정을 가지고 있는 Git Repo의 uri입니다.
    2. `branch`를 설정할 수 있습니다.
    3. 비공개 저장소인 경우 사용자의 `username`과 `password`가 필요합니다.
5. `Spring Bus`를 활용하여 설정을 `refresh`하기 위한 `rabbitmq` 설정이므로 사용을 원하시면 주석 해제 필요합니다.

# Ref

[Spring Cloud Config Server](https://cloud.spring.io/spring-cloud-config/multi/multi__spring_cloud_config_server.html)
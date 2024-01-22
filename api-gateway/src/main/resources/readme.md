# yml

```yaml
server:
   port: 8000 #1

eureka:
   instance:
      instance-id: ${spring.application.name}:${server.port}
   client: #2
      register-with-eureka: true
      fetch-registry: true
      service-url: #3
         defaultZone: http://127.0.0.1:8761/eureka

spring:
   application:
      name: api-gateway
   rabbitmq: #4
      host: 127.0.0.1
      port: 5672
      username: guest
      password: guest
   cloud:
      gateway:
         routes: #5
            - id: user-service #5.1
              uri: lb://USER-SERVICE #5.2
              predicates:
                 - Path=/user-service/**
                 - Method=GET, POST
              filters:
                 - AuthorizationHeaderFilter
   data: #6
      redis:
         host: 127.0.0.1
         port: 6379

management: #7
   endpoints:
      web:
         exposure:
            include: health, busrefresh, gateway
```

1. 공식 문서에서 제공하는 기본 포트는 22 혹은 443입니다.
2. 유레카 서버에 등록하기 위해 `true`로 설정하였습니다.
3. 유레카 서버에 등록하기 위한 `url` 입니다. 추후 배포를 한다면 변경이 필요합니다.
4. `Spring Bus`를 사용하기 위한 `RabbitMq` 설정입니다. `Spring Bus`를 사용하려면 주석 해제를 해야합니다.
5. 다른 서비스에 접근할 수 있도록 라우터를 설정합니다.
    1. 등록된 서비스의 이름
    2. `lb` 키워드를 사용하여 로드밸런스 기능을 사용
6. 추후 `JWT`를 사용한 인증을 위한 `redis` 설정입니다. 사용하지 않는 분은 주석처리를 하시면 됩니다.
7. `Spring Actuator API`를 활용하여 라우터 정보와 `Spring Bus`를 활용한 `busrefresh`를 할 수 있습니다.

# Ref

1. [GatewayFilter Factories](https://cloud.spring.io/spring-cloud-gateway/reference/html/#gatewayfilter-factories)
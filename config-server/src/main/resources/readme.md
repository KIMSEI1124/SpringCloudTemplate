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
```

1. 공식 문서에서 제공하는 기본 포트입니다.
2. 유레카 서버에 등록하기 위해 `true`로 설정하였습니다.
3. 유레카 서버에 등록하기 위한 `url` 입니다. 추후 배포를 한다면 변경이 필요합니다.

# Ref

[Spring Cloud Config Server](https://cloud.spring.io/spring-cloud-config/multi/multi__spring_cloud_config_server.html)
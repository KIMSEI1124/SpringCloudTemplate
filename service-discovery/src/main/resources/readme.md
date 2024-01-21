# yml

```yaml
server:
  port: 8761 #1

eureka:
  instance:
    instance-id: 127.0.0.1 #2 변경 필요
  client:
    fetch-registry: false #3.1
    register-with-eureka: false #3.2
    service-url:
      defaultZone: http://${eureka.instance.instance-id}:${server.port}/eureka/ #4 변경 필요
```

1. 공식 문서에서 제공하는 기본 포트입니다.
2. 자신의 인스턴스 식별자입니다. 추후 도메인 주소 혹은 원하시는 IP 주소로 변경하면 됩니다.
3. 자기 자신을 유레카 서버에 등록하는 것을 방지하기 위해 `false`로 설정하였습니다.
4. 추후 SSL 인증을 하였다면 `https`로 수정이 필요합니다. 해당 부분은 없어도 정상적으로 동작합니다.

# Ref

[Service Discovery: Eureka Server](https://cloud.spring.io/spring-cloud-netflix/multi/multi_spring-cloud-eureka-server.html)
# Rabbitmq

**Spring Bus** 를 활용하여 `API Gateway`를 사용하여 전체 마이크로 서비스에 대한 서비스 업데이트 기능을 위한 메시지 도구

## Rabbitmq 시작하기

**with Docker**

공식 문서에 있는 방법 그대로 입니다.

```shell
docker run -it --rm --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3.12-management
```

**with docker-compose**
```yaml
version: "3"
services:
  rabbitmq:
    image: rabbitmq:3.12-management
    container_name: rabbitmq
    ports:
      - "5672:5672"
      - "15672:15672"
```

## `busrefresh`

내용 추가 필요

- [ ] ymal 파일
  - [ ] 설정 방법
  - [ ] 사용 방법

# Ref

[Downloading and Installing RabbitMQ](https://www.rabbitmq.com/download.html)
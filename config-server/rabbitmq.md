# Rabbitmq

**Spring Bus** 를 활용하여 `API Gateway`를 사용하여 전체 마이크로 서비스에 대한 서비스 업데이트 기능을 위한 메시지 도구

## Rabbitmq 시작하기

**with Docker**

공식 문서에 있는 방법 에서 `volume`만 추가하였습니다.

```shell
docker run -it --rm -d\
--name rabbitmq \
-p 5672:5672 -p 15672:15672 \
-v rabbitmq-data:/var/lib/rabbitmq/ \
-v rabbitmq-logs:/var/log/rabbitmq/ \
rabbitmq:3.12-management
```

**with docker-compose**

`docker-compose`파일에 추가한다면 아래의 내용을 붙이면 됩니다.

```yaml
version: "3"
services:
  rabbitmq:
    image: rabbitmq:3.12-management
    container_name: rabbitmq
    ports:
      - "5672:5672"
      - "15672:15672"
    volumes:
      - rabbitmq-data:/var/lib/rabbitmq/
      - rabbitmq-logs:/var/log/rabbitmq/
```

## `busrefresh`

내용 추가 필요

- [ ] ymal 파일
    - [ ] 설정 방법
    - [ ] 사용 방법

# Ref

[Downloading and Installing RabbitMQ](https://www.rabbitmq.com/download.html)
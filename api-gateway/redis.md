# Redis

In-Memory 환경에서 동작하는 `Key-Value` 구조의 `NoSQL`입니다.

## Redis 시작하기

**with Docker**

```shell
docker run -d \
--name redis \
-p 6379:6379 \
-v redis-data:/data \
redis
```

**with docker-compose**

`docker-compose`파일에 추가한다면 아래의 내용을 붙이면 됩니다.

```yaml
version: "3"
services:
  redis:
    image: redis
    container_name: redis
    ports:
      - "6379:6379"
    volumes:
      - redis-data:/data
```
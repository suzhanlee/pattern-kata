# 환경 설정 가이드

## 필수 소프트웨어

### 1. Java 17+
```bash
# 설치 확인
java -version

# macOS (Homebrew)
brew install openjdk@17

# Windows
# https://adoptium.net/ 에서 다운로드
```

### 2. Docker Desktop
```bash
# 설치 확인
docker --version
docker-compose --version

# macOS
brew install --cask docker

# Windows
# https://www.docker.com/products/docker-desktop/
```

### 3. IntelliJ IDEA
- Community 버전 무료
- https://www.jetbrains.com/idea/download/

## 인프라 시작

```bash
# 프로젝트 루트에서
docker-compose up -d

# 상태 확인
docker-compose ps

# 로그 보기
docker-compose logs -f mysql
docker-compose logs -f redis
```

## 접속 정보

| 서비스 | 포트 | URL |
|--------|------|-----|
| MySQL | 3306 | jdbc:mysql://localhost:3306/artisan_kata |
| Redis | 6379 | redis://localhost:6379 |
| RabbitMQ Management | 15672 | http://localhost:15672 (guest/guest) |
| Prometheus | 9090 | http://localhost:9090 |
| Grafana | 3000 | http://localhost:3000 (admin/admin) |
| Zipkin | 9411 | http://localhost:9411 |

## 주차별 모듈 실행

```bash
cd week01-transaction-basics

# 빌드
../gradlew build

# 실행 (Spring Boot 애플리케이션인 경우)
../gradlew bootRun

# 테스트
../gradlew test
```

## 문제 해결

### MySQL 연결 실패
```bash
# MySQL 컨테이너 로그 확인
docker-compose logs mysql

# 컨테이너 재시작
docker-compose restart mysql
```

### 포트 충돌
```bash
# 사용 중인 포트 확인 (macOS/Linux)
lsof -i :3306
lsof -i :6379

# 포트 변경 (docker-compose.yml 수정)
ports:
  - "3307:3306"  # 3307로 변경
```

### Gradle 빌드 실패
```bash
# 캐시 삭제
./gradlew clean --no-daemon

# Gradle 데몬 중지
./gradlew --stop
```

<p align="center">
    <img width="200px;" src="https://raw.githubusercontent.com/woowacourse/atdd-subway-admin-frontend/master/images/main_logo.png"/>
</p>
<p align="center">
  <img alt="npm" src="https://img.shields.io/badge/npm-%3E%3D%205.5.0-blue">
  <img alt="node" src="https://img.shields.io/badge/node-%3E%3D%209.3.0-blue">
  <a href="https://edu.nextstep.camp/c/R89PYi5H" alt="nextstep atdd">
    <img alt="Website" src="https://img.shields.io/website?url=https%3A%2F%2Fedu.nextstep.camp%2Fc%2FR89PYi5H">
  </a>
  <img alt="GitHub" src="https://img.shields.io/github/license/next-step/atdd-subway-admin">
</p>

<br>

# 지하철 노선도 미션
[ATDD 강의](https://edu.nextstep.camp/c/R89PYi5H) 실습을 위한 지하철 노선도 애플리케이션

# 요구 사항

- [X] 지하철 노선 관련 기능의 인수 테스트 작성
- [X] 지하철 노선 관련 기능 구현
- [X] 인수 테스트 리팩터링
- [X] 노선 생성 시 종점역(상행, 하행), 거리 정보를 요청 파라미터에 추가
  - [X] 두 종점역은 구간의 형태로 관리되어야 한다.
  - [X] 상행역, 하행역이 달라야 한다.
  - [X] 거리는 0보다 커야 한다.
- [X] 노선 조회 시 응답 결과에 역 목록 추가
  - [X] 상행역부터 하행역 순으로 정렬되어야 한다.
- [X] 지하철 구간 등록 인수 테스트 작성하고 기능을 구현한다.
  - [X] 역 사이에 새로운 역을 등록할 경우
  - [X] 새로운 역을 상행 종점으로 등록할 경우
  - [X] 새로운 역을 하행 종점으로 등록할 경우
- [X] 구간 등록 시 예외 케이스를 고려한다.
  - [X] 역 사이에 새로운 구간을 등록할 경우 기존 역 사이 거리보다 크거나 같으면 등록을 할 수 없음
  - [X] 상행역과 하행역이 이미 노선에 모두 등록되어 있다면 추가할 수 없음
  - [X] 상행역과 하행역 둘 중 하나도 포함되어 있지 않으면 추가할 수 없음
- [X] 지하철 구간 제거 기능을 구현한다.
  - [X] 중간역이 제거될 경우 재배치
    - A-B-C 역에서 B 제거 시 A-C로 재배치
    - 거리는 두 구간의 합으로 결정
  - [X] 노선에 등록되어 있지 않은 역은 제거할 수 없음
  - [X] 구간이 하나인 노선에서 상행 종점역을 제거할 수 없음
  - [X] 구간이 하나인 노선에서 하행 종점역을 제거할 수 없음

<br>

## 🚀 Getting Started

### Install
#### npm 설치
```
cd frontend
npm install
```
> `frontend` 디렉토리에서 수행해야 합니다.

### Usage
#### webpack server 구동
```
npm run dev
```
#### application 구동
```
./gradlew bootRun
```
<br>

## ✏️ Code Review Process
[텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

<br>

## 🐞 Bug Report

버그를 발견한다면, [Issues](https://github.com/next-step/atdd-subway-admin/issues) 에 등록해주세요 :)

<br>

## 📝 License

This project is [MIT](https://github.com/next-step/atdd-subway-admin/blob/master/LICENSE.md) licensed.

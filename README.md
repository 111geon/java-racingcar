# java-racingcar

자동차 경주 미션 저장소

## 우아한테크코스 코드리뷰

- [온라인 코드 리뷰 과정](https://github.com/woowacourse/woowacourse-docs/blob/master/maincourse/README.md)

## 기능 목록

- 사용자로부터 두번의 입력을 받는다.
    - 경주할 n대의 자동차 이름(이름은 5자 이하, 쉼표 ','를 기준으로 구분)
    - 이동 시도 횟수
- 경주 진행
    - 입력된 시도 횟수 동안 0과 9 사이에 random 값을 구한 후 이 값이 4 이상일 경우 전진, 3이하일 경우 멈춤
    - 경주 진행 과정 출력: 자동차들의 이름과 위치
- 경주 결과 출력
    - 한 명 이상의 우승자를 출력

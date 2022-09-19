# 🚀 1단계 - 자동차 경주 구현

### 깃헙 레포지토리

[https://github.com/wsyg-java-study/-java-racingcar](https://github.com/wsyg-java-study/-java-racingcar)

## **기능 요구사항**

- 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
- 각 자동차에 이름을 부여할 수 있다. 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
- 자동차 이름은 쉼표(,)를 기준으로 구분하며 이름은 5자 이하만 가능하다.
- 사용자는 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
- 전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4 이상일 경우 전진하고, 3 이하의 값이면 멈춘다.
- 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한 명 이상일 수 있다.

**실행 결과**

- 위 요구사항에 따라 3대의 자동차가 5번 움직였을 경우 프로그램을 실행한 결과는 다음과 같다.

```
경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).
pobi,crong,honux
시도할 회수는 몇회인가요?
5

실행 결과
pobi : -
crong : -
honux : -

pobi : --
crong : -
honux : --

pobi : ---
crong : --
honux : ---

pobi : ----
crong : ---
honux : ----

pobi : -----
crong : ----
honux : -----

pobi : -----
crong : ----
honux : -----

pobi, honux가 최종 우승했습니다.
```

## **프로그래밍 요구사항**

- **모든 로직에 단위 테스트를 구현한다. 단, UI(System.out, System.in) 로직은 제외**
- **자바 코드 컨벤션을 지키면서 프로그래밍한다.**
    - 참고문서: [https://google.github.io/styleguide/javaguide.html](https://google.github.io/styleguide/javaguide.html) 또는 [https://myeonguni.tistory.com/1596](https://myeonguni.tistory.com/1596)
- **`규칙 1: 한 메서드에 오직 한 단계의 들여쓰기(indent)만 한다.`**를 지키며 구현한다.
    - 예를 들어 while문 안에 if문이 있으면 들여쓰기는 2이다.
    - 힌트: indent(인덴트, 들여쓰기) depth를 줄이는 좋은 방법은 함수(또는 메소드)를 분리하면 된다.
- **`규칙 2: else 예약어를 쓰지 않는다.`**를 지키며 구현한다.
    - 힌트: if 조건절에서 값을 return하는 방식으로 구현하면 else를 사용하지 않아도 된다.
    - else를 쓰지 말라고 하니 switch/case로 구현하는 경우가 있는데 switch/case도 허용하지 않는다.
- **함수(또는 메소드)의 길이가 15라인을 넘어가지 않도록 구현한다.**
    - 함수(또는 메소드)가 한 가지 일만 잘 하도록 구현한다.

## **기능 목록 및 commit 로그 요구사항**

- 기능을 구현하기 전에 README.md 파일에 구현할 기능 목록을 정리해 추가한다.
- git의 commit 단위는 앞 단계에서 README.md 파일에 정리한 기능 목록 단위로 추가한다.

---

## 피드백 

## 절차지향에서 왜 객체지향을 중요시할까?

- 수정하기 좋은 구조를 가진 코드
- 요구사항의 변동에 유연한 코드

## 객체의 핵심은 기능을 제공해야 한다.

- 객체를 정의할 때 사용되는 것은 객체가 제공해야 할 기능 (메서드)
- 어떤 데이터를 가지고 있는지는 정의되지 않는다.
- 객체가 갖는 책임의 크기는 작을수록 좋다.

## 의존성

- 한 객체가 다른 객체를 생성하거나 다른 객체의 메서드를 호출할 때, 이를 그 객체에 의존한다고 표현한다.
- 내가 변경되면 나에게 의존하고 있는 코드에 영향을 준다.
- 나의 요구가 변경되면 내가 의존하고 있는 타입에 영향을 준다.

## 캡슐화

- 내부의 기능 구현이 변경되더라도 그 기능을 사용하는 코드는 영향을 받지 않도록 만든다.

```java
public class Calculator {

	public int plus(int a, int b) {
		return a + b;
	}
}
```

```java
public class Calculator {

	public int plus(int a, int b) {
		System.out.println("a + b");
		return a + b;	
	}
}
```

### 두 개의 규칙

- Tell, Don`t Ask: 데이터를 물어보지 않고, 기능을 실행해 달라고 말하라.
- 데미테르의 법칙
    - 메서드에서 생성한 객체의 메서드만 호출
    - 파리미터로 받은 객체의 메서드만 호출
    - 필드로 참조하는 객체의 메서드만 호출

## 객체 지향 설계 과정

1. 제공해야 할 기능을 찾고 세분화
2. 객체 간에 어떻게 메시지를 주고받을 지 결정
3. 1, 2번 과정을 개발하는 동안 지속적으로 반복한다.

[https://triangle-diary.tistory.com/7](https://triangle-diary.tistory.com/7)

---

## 이름을 통해 의도를 드러내라

패키지 이름은 **`step2`**, **`step3`**보다 **`calculator`**, **`racingcar`**가 더 이해하기 쉽다.

```java
package step2

```

**`Car`** 입장에서는 넘어 오는 인자가 무작위 값인지 알 필요 없다.

```java
public void move(int randomNumber) {
    if (randomNumber >= FORWARD_NUMBER) {
        position++;
    }
}
```

## 구현 순서도 코딩 컨벤션이다

상수, 클래스 변수, 인스턴스 변수, 생성자, 메서드 순으로 작성한다.

```java
public class Car {

    private int moveIndex;
    private int carNumber;
    private String carName;

    private static final int INIT_POSITION = 0;
    private static int autoIncrease = 0;

    ...

}
```

## 객체를 객체스럽게 사용해라

**`Car`** 클래스를 추가한 후 **`name`**과 **`position`**을 상태 값으로 가지는 객체를 추가했다. 그런데 이 객체는 로직에 대한 구현은 하나도 없고, **`name`**과 **`position`**에 대한 getter 메서드와 setter 메서드만을 가진다.

```java
public class Car {
    private String name;
    private int position = 1;

    public Car(String name) {
        this.name = name;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }
}

```

**`Car`**에 메시지를 던지도록 구조를 바꿔 데이터를 가지는 객체가 일하도록 한다.

```java
public class Racing {

    ...

    public int run(Car car) {
        int num = random.nextInt(11);
        int position = car.getPosition();

        if (num >= 4) {
            position++;
        }

        car.setPosition(position);
        return position;
    }
}
```

## 객체의 상태 접근을 제한한다

인스턴스 변수의 접근 제한자는 private으로 구현한다.

```java
public class Car {
    public String carName;
    public int move;

    public Car(String carName, int move) {
        this.carName = carName;
        this.move = move;
    }
}

```

## 인스턴스 변수의 수를 최소화한다

인스턴스 변수의 수를 최소화할 수 있는 방법을 찾는다. 다른 인스턴스 변수를 통해 생성할 수 있는 값을 굳이 인스턴스 변수로 구현하지 마라.

```java
public class RacingGame {
    private List<Car> cars;
    private List<String> winners;

    public List<Car> move(int time) {
        int curCountOfWin = 0;
        for (Car car : cars) {
            countOfMove(time, car);
            curCountOfWin = max(car.getCarPosition(), curCountOfWin);
        }

        for (Car car : cars) {
            setWinners(curCountOfWin, car);
        }

        return cars;
    }

    ...

}

```

```java
public class GameResult {
    private List<Car> carList;
    private int topDistance;

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

    public void moveCar(int carIndex) {
        Car currentCar = carList.get(carIndex);
        currentCar.setMoveDistance(currentCar.getMoveDistance() + 1);
        topDistance = Math.max(topDistance, currentCar.getMoveDistance());
    }
}
```

## 비즈니스 로직과 UI 로직의 분리

비즈니스 로직과 UI 로직을 한 클래스가 담당하지 않도록 한다. 단일 책임의 원칙에도 위배된다.

```java
public class Car {
    private int position;

    ...

    private void print(int position) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < position; i++) {
              sb.append("-");
        }
        System.out.println(sb.toString());
    }
}

```

## Collection 활용 로직 처리

아래 코드는 Car 목록에서 최종 우승자를 구하는 로직이다. 이 코드를 Collection 기능을 사용해 어떻게 리팩터링할 것인가?

```java
public class ResultView {
    private Cars cars = null;

    private String getTopRankedCar(List<Car> carList) {
        String topCarString = "";
        cars = new Cars(carList);
        int maxPosition = getMaxPosition(carList);

        for (int i = 0; i < carList.size(); i++) {
            if (cars.getPosition(i) == maxPosition) {
                topCarString += cars.getCarName(i) + ", ";
            }
        }
        return topCarString.substring(0, topCarString.length() - 2);
    }

    private int getMaxPosition(List<Car> carList) {
        int maxPosition = 0;
        cars = new Cars(carList);

        for (int i = 0; i < carList.size(); i++) {
            if (maxPosition < cars.getPosition(i)) {
                maxPosition = cars.getPosition(i);
            }
        }
        return maxPosition;
    }
}
```

## getter 메서드 없이 구현 가능한가?

setter/getter 메서드를 사용하지 말라는 것은 핵심 비지니스 로직을 구현하는 도메인 객체를 의미한다. 도메인 Layer -> View Layer, View Layer -> 도메인 Layer로 데이터를 전달할 때 사용하는 DTO(data transfer object)의 경우 setter/getter를 허용한다.

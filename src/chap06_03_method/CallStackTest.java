package chap06_03_method;

public class CallStackTest {
    public static void main(String[] args) {
        firstMethod();
    }

    static void firstMethod() {
        secondMethod();
    }

    static void secondMethod() {
        System.out.println("second method");
    }

    /*
    1. JVM에 의해서 main메소드가 호출됨으로써 프로그램이 시작. 호출스택에는 main메소드를 위한 공간이 할당되고 main메소드의 코드가 수행
    2. main메소드에서 firstMethod() 를 호출한 상태. 아직 main메소드가 끝난 것은 아니므로 main 메소드는 호출스택에 대기상태로 남아있고 firstMethod()의 수행이 시작됨.
    3. firstMethod()에서 다시 secondMethod()를 호출. firstMethod()는 secondMethod()가 수행을 마칠때까지 대기상태.
        secondMethod()가 수행을 마쳐야 firstMethod()의 나머지 문장들을 수행할 수 있음.
    4. secondMethod()에서 println()을 호출. println메소드에 의해 secondMethod()가 화면에 출력
    5. println 메소드의 수행이 완료되어 호출스택에서 사라지고 자신을 호출한 secondMethod()로 되돌아감.
        secondMethod()는 println()을 호출한 이후부터 수행을 재개함.
    6. seoncdMethod()에 더 이상 수행할 코드가 없으므로 종료되고, 자신을 호출한 firstMethod로 돌아감.
    7. firstMethod()에 더 이상 수행할 코드가 없으므로 종료되고, 자신을 호출한 main메소드로 돌아감.
    8. main메소드에도 더 이상 수행할 코드가 없으므로 종료되어, 호축스택은 완전히 비워지게되고 프로그램은 종료됨.
    * */

}


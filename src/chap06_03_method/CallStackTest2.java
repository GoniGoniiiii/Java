package chap06_03_method;

public class CallStackTest2 {
    public static void main(String[] args) {
        System.out.println("main 메소드 시작");
        firstMethod();
        System.out.println("main 메소드 종료");
    }

    static void firstMethod() {
        System.out.println("firstMethod() 시작");
        secondMethod();
        System.out.println("firstMethod() 종료");
    }

    static void secondMethod() {
        System.out.println("second method() 시작");
        System.out.println("second method() 종료");
        
    }

}

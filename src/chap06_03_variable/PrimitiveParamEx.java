package chap06_03_variable;

class Data{int x;}

public class PrimitiveParamEx {
    public static void main(String[] args){
        Data d=new Data();
        d.x=10;
        System.out.println("main() : x ="+d.x);

        change(d.x);
        System.out.println("After change(d.x)");
        System.out.println("main() : x ="+d.x);
    }

    static void change(int x){
        x=1000;
        System.out.println("change()  : x = "+x);
    }
    //왜 값을 변경해줬는데도 d.x값이 그대로 10이냐?
    //1. change 메소드가 호출되면서 d.x가 change의 메소드 매개변수 x에 복사됨.
    //2. change 메소드에서 x의 값을 1000으로 변경
    //3. change 메소드가 종료되면서 매개변수 x는 스택에서 제거됨.

    //d.x의 값이 변경된 것이 아니라, change메소드의 매개변수 x의값이 변경된것임.
    //원본이 아니라 복사본이 변경된 것이라 원본에는 아무런 영향을 미칠수없음.
    //기본형 매개변수는 변수에 저장된 값만 읽을 수만 있을뿐 변경X
}

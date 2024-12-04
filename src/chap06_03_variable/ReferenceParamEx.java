package chap06_03_variable;

class Data2{int x;}

public class ReferenceParamEx {
    public static void main(String[] args){
        Data2 d=new Data2();
        d.x=10;
        System.out.println("main() : x = "+d.x);

        change(d);
        System.out.println("After change(d)");
        System.out.println("main() : x = "+d.x);

    }
    static void change(Data2 d){
        d.x=1000;
        System.out.println("change() :  x = " +d.x);
    }
    //change메소드의 매개변수가 참조형이라서 값이 아니라 값이 저장된 주소를 change메소드에게 넘겨주었기때문에
    //값을 읽어오는 것뿐만 아니라 변경하는 것도 가능함.
    // 1. change메소드가 호출되면서 참조변수 d의 값(주소)이 매개변수 d에 복사됨.
    //    이제 매개변수 d에 저장된 주소값으로 x에 접근이 가능.
    // 2. change 메소드에서 매개변수 d로 x의 값을 1000으로 변경.
    // 3. change 메소드가 종료되면서 매개변수 d는 스택에서 제거됨.


}

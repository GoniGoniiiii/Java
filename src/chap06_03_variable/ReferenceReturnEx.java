package chap06_03_variable;

import static java.util.Collections.copy;

public class ReferenceReturnEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;

        Data d2 = copy(d);
        System.out.println("d.x =" + d.x);
        System.out.println("d2.x =" + d2.x);
    }

    static Data copy(Data d) {
        //새로운 객체를 생성한 후, 매개변수로 넘겨받은 객체에 저장된 값을 복사해서 반환
        Data tmp = new Data();
        tmp.x = d.x;

        return tmp; //복사한 객체의 주소를 반환
    }

    //copy 메소드를 호출하면서 참조변수 d의 값이 매개변수 d에 복사됨.
    //새로운 객체를 생성한 다음, d.x에 저장한 값을 tmp.x에 복사한다.
    //copy 메소드가 종료되면서 반환한 tmp의 값은 참조변수 d2에 저장됨.
    //copy 메소드가 종료되어 tmp가 사라졌지만, d2로 새로운 객체를 다를 수 있음.
}

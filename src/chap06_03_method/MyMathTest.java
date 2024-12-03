package chap06_03_method;

public class MyMathTest {
    public static void main(String[] args) {
        MyMath mm = new MyMath();   //인스턴스를 생성
        long result1 = mm.add(5L, 3L); //메소드를 호출
        //main메소드에서 메소드 add를 호출. 호출시 지정한 5L와 3L이 메소드 add의 매개변수 a,b,에 각각 복사(대입)됨.
        //메소드 add{}안에 있는 문장들이 순서대로 수행됨.
        //메소드 add의 모든 문장이 실행되거나 return 문을 만나면, 호출한 메소드로 되돌아와서 이후의 문장들을 실행함.
        long result2 = mm.subtract(5L, 3L);
        long result3 = mm.multiply(5L, 3L);
        double result4 = mm.divide(5L, 3L);

        System.out.println("add( 5L , 3L ) ="+result1);
        System.out.println("subtract( 5L , 3L ) ="+result2);
        System.out.println("multiply( 5L , 3L ) ="+result3);
        System.out.println("divide(5L , 3L ) ="+result4);

    }
}

//MyMath의 클래스의 add를 호출하기 위해서는 먼저 인스턴스를 생성한 다음 참조변수를 통해야함.
class MyMath {
    long add(long a, long b) {
        long result = a + b;
        return result;
    }

    long subtract(long a, long b) {
        return a - b;
    }

    long multiply(long a, long b) {
        return a * b;
    }

    double divide(double a, double b) {
        //long형의 값을 double변수에 저장하는 것과 같아서 double로 자동형변환되어 저장.
        return a / b;
    }
}
package chap04_03_for;

public class FlowEx11 {
    public static void main(String[] args) {
        //삼각형 모양 별찍기
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

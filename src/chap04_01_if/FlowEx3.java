package chap04_01_if;

import java.util.Scanner;

public class FlowEx3 {
    public static void main(String[] args) {
        int score=0;
        char grade =' ';

        System.out.print("점수를 입력 : ");
        Scanner sc = new Scanner(System.in);
        score = sc.nextInt();

        if(score>=90){
            grade = 'A';
        }else if(score>=80){
            grade = 'B';
        }else if(score>=70){
            grade = 'C';
        }else{
            grade = 'D';
        }

        System.out.print("당신의 학점은 "+grade);
    }
}

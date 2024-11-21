package chap04_04_while;

import java.util.Scanner;

public class FlowEx16 {
    public static void main(String[] args) {
        int num = 0;
        int sum = 0;
        boolean flag = true;

        System.out.println("합계를 구할 변수를 입력하세요. 끝내려면 0을 입력");

        while (flag) {
            System.out.print(">>");
            Scanner sc = new Scanner(System.in);
            String tmp = sc.nextLine();
            num = Integer.parseInt(tmp);

            if (num != 0) {
                sum += num;
            } else {
                flag = false;
            }
        }
        System.out.println("총 합 : " + sum);
    }
}

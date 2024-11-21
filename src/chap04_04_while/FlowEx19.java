package chap04_04_while;

import java.util.Scanner;

public class FlowEx19 {
    public static void main(String[] args) {
        int menu,num = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("(1) square");
            System.out.println("(2) square root");
            System.out.println("(3) log");
            System.out.print("원하시는 메뉴를 선택해주세요. 종료는 0번");

            String tmp = sc.nextLine();
            menu = Integer.parseInt(tmp);

            if (menu == 0) {
                System.out.println("프로그램을 종료합니다");
                break;
            } else if (!(1 <= menu && menu <= 3)) {
                System.out.println("메뉴를 잘못 선택하셨습니다. ");
                continue;
            }
            System.out.println("선택하신 메뉴는 " + menu +"입니다.");

        }
    }
}

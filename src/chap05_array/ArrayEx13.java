package chap05_array;

import java.util.Arrays;

public class ArrayEx13 {
    public static void main(String[] args) {

        String src="ABCDE";

        for(int i=0; i<src.length(); i++){
            char ch=src.charAt(i); //src의 i번째 문자를 ch에 저장
            System.out.println("src.charAt = ( "+ i+" ) : " + ch);
        }

        //String char[] 로 변환
        char[] chArr=src.toCharArray();

        //문자열 출력하듯이 문자배열의 모든 요소를 한 줄로 출력함.
        System.out.println(chArr);
    }
}

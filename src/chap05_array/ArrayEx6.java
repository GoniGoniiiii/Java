package chap05_array;

public class ArrayEx6 {
    public static void main(String[] args) {

        int[] score={79,99,100,77,55,66,95};

        int max=score[0];
        int min=score[0];

        for(int i=1;i<score.length;i++){
            if(score[i]>max){
                max=score[i];
            }else if(score[i]<min){
                min=score[i];
            }
        }
        System.out.println("최대값 : " +max);
        System.out.println("최소값 : " +min);
    }
}

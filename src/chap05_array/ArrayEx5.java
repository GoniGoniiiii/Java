package chap05_array;

public class ArrayEx5 {
    public static void main(String[] args) {
        int sum=0;
        float average=0f;

        int[] score={100,80,90,100,88};

        for(int i=0; i<score.length; i++){
            sum+=score[i];
        }

        average=sum/(float)score.length; //정확한 계산결과를 얻기위해 float로 형변환

        System.out.println("총점 "+sum);
        System.out.println("평균 "+average);

    }
}

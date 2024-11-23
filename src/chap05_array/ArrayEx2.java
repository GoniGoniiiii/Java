package chap05_array;

import java.util.Arrays;

public class ArrayEx2 {
    public static void main(String[] args){
        int[] Arr1=new int[10];
        int[] Arr2=new int[10];
//        int[] Arr3=new int[]{100,90,80,70,60};
        int[] Arr3={100,90,80,70,60};
        char[] chArr={'a','b','c','d','e'};

        for(int i=0; i<Arr1.length; i++){
            Arr1[i]=i+1;
        }

        for(int i=0; i<Arr2.length; i++){
            Arr2[i]=(int)(Math.random()*10)+1;
        }

        for(int i=0; i<Arr1.length; i++){
            System.out.print(Arr1[i] + ",");
        }
        System.out.println();
        System.out.println(Arrays.toString(Arr2));
        System.out.println(Arrays.toString(Arr3));
        System.out.println(Arrays.toString(chArr));
        System.out.println(Arr3);
        System.out.println(chArr);
    }

}

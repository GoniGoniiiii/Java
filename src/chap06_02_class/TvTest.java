package chap06_02_class;

class Tv{
    String color;
    boolean power;
    int channel;

    void power() { power=!power; }
    void channelUP(){ ++channel; }
    void channelDown(){ --channel; }
}



public class TvTest {
    public static void main(String[] args){
        Tv t1=new Tv();
        Tv t2=new Tv();

        System.out.println("t1의 현재 채널은 " +t1.channel + "입니다.");
        System.out.println("t2의 현재 채널은 " +t2.channel + "입니다.");

        t2=t1;
        t1.channel=7;
        System.out.println("t1의 channel값을 7로 변경하엿씁니다.");

        System.out.println("t1의 현재 채널은 " +t1.channel + "입니다.");
        System.out.println("t2의 현재 채널은 " +t2.channel + "입니다.");

        Tv[] tvArr=new Tv[3];

        for(int i=0; i<tvArr.length; i++){
            tvArr[i]=new Tv();
            tvArr[i].channel=i+10;
        }

        for(int i=0; i<tvArr.length; i++){
            tvArr[i].channelUP();
            System.out.printf("tvArr[%d].channel =%d\n", i, tvArr[i].channel);
        }
    }
}

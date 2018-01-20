package practice1;

public class Ex10 {
    int sum=100000;
    float percent=0.5f;
    int month=24;

    public static int pay(int sum, int month,float percemt){
        int percentForMonth=0;
        for (int i=1;i<=month;i++){
            System.out.println("Month= "+i);
            System.out.println(sum+=(sum/100)*percemt);
            System.out.println("%= "+(percentForMonth+=(sum/100)*percemt));
        }
        return percentForMonth;
    }

    public static void main(String[] args) {
        Ex10.pay(100000,24,0.5f);
    }
}

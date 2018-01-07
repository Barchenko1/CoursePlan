package homework1;

public class eighteen {
    public static void main(String[] args) {
        System.out.println(a(725));
        System.out.println(b(725));
        System.out.println(c(725));

    }
    public static int a(int N){
        return N/100;
    }
    public static int b(int N){
        return (N/10)%10;
    }
    public static int c(int N){
        return N%10;
    }

}

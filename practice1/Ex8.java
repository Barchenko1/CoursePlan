package practice1;

public class Ex8 {
    public static void ex8(int a,int b,int c){
        if ((a + b == c)||(a+c==b)||(b+c==a)){
            System.out.println("true");
        }else System.out.println("false");
    }

    public static void main(String[] args) {
        Ex8.ex8(1,3,2);
    }
}

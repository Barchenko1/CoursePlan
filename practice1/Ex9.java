package practice1;

public class Ex9 {
    public static void ex9a(int b, int a){
        if (a>b){
            for (;b<a;b++){
                if (b==(a*0.5)){
                System.out.println(b);
            }
            }
        }
    }


    public static void main(String[] args) {
        Ex9.ex9a(1,5);

    }
}

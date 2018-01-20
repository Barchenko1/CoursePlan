package practice1;

public class Ex4 {
    public int ex4a(int a){
        return a*a;
    }
    public int ex4b(int b){
        return b*b;
    }
    public int ex4c(int c){
        return c*c;
    }
    public static void main(String[] args) {
        Ex4 ex4=new Ex4();
        int result1=ex4.ex4c(5);
        int result2=ex4.ex4a(4)+ex4.ex4b(3);
        System.out.println(result1==result2 ? "Прямоугольный" : "Не прямоугольный");
    }
}

package practice1;

public class Ex1 {
    int a; double b; float c; char d; String s; Object o; boolean e;
    @Override
    public String toString() {
        return "ex1{"+ "a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + ", s='" + s + '\\' + ", o=" + o +", e=" + e +'}';
    }
    public void ex1(){
        int a=0; double b=1; float c=2; char d=3; String s="Pasha"; Object o=new Object(); boolean e=true;
        System.out.println("ex1{"+ "a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + ", s='" + s + '\\' + ", o=" + o +", e=" + e +'}');
    }

    public static void main(String[] args) {
        Ex1 ex1=new Ex1();
        System.out.println(ex1);
        ex1.ex1();
    }
}
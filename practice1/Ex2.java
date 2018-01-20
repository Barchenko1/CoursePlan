package practice1;

public class Ex2 {

    float a=1.f;
    float b=1f;
    float c=0x1;
    float d=0b1;
    float e=1.0e1f;
    float g=01f;

    @Override
    public String toString() {
        return "Ex2{"+a+" "+b+" "+c+" "+d+" "+" "+e+" "+" "+g+"}";
    }
    public static void main(String[] args) {
        float a=1.f;
        float b=1;
        float c=0x1;
        float d=0b1;
        float e=1.0e1f;
        float g=01;
        Ex2 ex2=new Ex2();
        System.out.println(ex2);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(g);
    }
}

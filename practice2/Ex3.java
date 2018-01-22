package practice2;

public class Ex3 {
    public static String str(String s1){
        String s2=s1.substring(s1.length()-2,s1.length());
        String s3=s2.concat(s1);
        return s3;
    }

    public static void main(String[] args) {
        System.out.println(Ex3.str("Candy"));
    }
}

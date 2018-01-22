package practice2;

public class Ex4 {
    public static String str(String s1){
        StringBuilder sb2=new StringBuilder(s1);
        String s3="";
        sb2.insert(0,sb2.charAt(0));
        sb2.insert(2,sb2.charAt(2));
        sb2.insert(4,sb2.charAt(4));
        sb2.insert(6,sb2.charAt(6));
        sb2.insert(8,sb2.charAt(8));
        return String.valueOf(sb2);
    }

    public static void main(String[] args) {
        System.out.println(Ex4.str("Candy"));
    }
}

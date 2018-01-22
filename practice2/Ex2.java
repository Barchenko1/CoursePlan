package practice2;

public class Ex2 {
    public static String str(String s1){
        String s2="";
        if (s1.length()>3){
            s2=s1.substring((s1.length()/2)-1,(s1.length()/2)+2);
        }
        return s2;
    }
    public static void main(String[] args) {
        System.out.println("```Test 2-th task```");
        String result=Ex2.str("HelLlo");
        System.out.println(result);
    }
}

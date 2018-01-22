package practice2;

public class Ex5 {
    public static String str(String s1){
        boolean result = s1.regionMatches(true,4,"b",0,s1.length());

        return String.valueOf(result);
    }

    public static void main(String[] args) {
        System.out.println(Ex5.str("bob is bab"));

    }
}

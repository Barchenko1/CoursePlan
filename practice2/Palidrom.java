package practice2;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class Palidrom {
    public static String reverseString(String s){
        String r="";
        for (int i =0; i < s.length(); ++i){
            r+=s.charAt(i);
        }
        return r;
    }
    public static Boolean isPalidrom(String s){
        return s.equals(reverseString(s));
    }

    public static void main(String[] args) {
        System.out.println(Palidrom.isPalidrom("ada"));
    }
}

package practice2;

public class Ex1 {
    public static String combineLines(String s1,String s2){
        String result="";
        if (s1!=null&&s2!=null&s1.length()>1&&s2.length()>1){
            result=s1.substring(1).concat(s2.substring(1));
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("```Test first task```");
        String s1="HHello ";
        String s2="WWorld";
        String result=Ex1.combineLines(s1,s2);
        System.out.println("Combile of "+result );
    }
}

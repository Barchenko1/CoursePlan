package practice1;

public class SimpleDataTypeLoopsUtils {
    public static int intNumbersSum(int start,int end){
        int sum=0;
        if (start<end){
            for (int i = start; i <= end; i++) {
                sum+=i;
            }
        }
        return sum;
    }
}

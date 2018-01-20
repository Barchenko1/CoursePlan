package practice1;

public class Ex6 {
    public static int ex6(int start,int end){
        int sum=0;
        if (start<end){
            for (int i=start;i<=end;i++){
                if (i%2==0)
                sum+=i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("`````Test 6-th task``````");
        int start=0;
        int end=20;
        int result=Ex6.ex6(start,end);
        System.out.println(result);
    }
}

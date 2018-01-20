package practice1;

public class Ex7 {
    public static int ex7(int start,int end){
        int sum=0;
        if (start<end){
            for (int i=start;i<=end;i++){
                if (2/i==0||3/i==0||5/i==0||10/i==0||7/i==0||13/i==0||15/i==0||19/i==0&&i!=0&&i!=1)
                    sum+=i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("`````Test 7-th task``````");
        int start=2;
        int end=20;
        int result=Ex7.ex7(start,end);
        System.out.println(result);
    }
}

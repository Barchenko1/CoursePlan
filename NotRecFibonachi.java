public class NotRecFibonachi {
    public static void main(String[] args) {
        System.out.println(FibonachiNotRec(6));
    }
    public static int FibonachiNotRec (int n){
        if (n==0){
            return 1;
        }
        int prev=1;
        int current=1;
        for (int i=2;i<=n;++i){
            int temp=current;
            current+=prev;
            prev=temp;
        }
        return current;
    }
}

public class RecFibonachi {
    public static void main(String[] args) {
        System.out.println(Fibonacci(6));
    }
    public static int Fibonacci(int n){
        if (n==0||n==1){
            return 1;
        }
        return Fibonacci(n-1)+Fibonacci(n-2);
    }
}

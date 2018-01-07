package homework1;

public class sixteen {
    public static void main(String[] args) {
        int A = 13;
        int B = 2;
        int c = 0;
        while (c<A) {
            c = c + B;
            if ((c > A)||(c==A)) {
                c = A-1;
            }
        }
        System.out.println(c);
    }
}
package homework1;
public class three {
    public static void main(String[] args) {
        System.out.println(x1(2,3)+" "+x2(3,2));
    }
    public static double D(int A, int B, int C){
        return B*B-4*A*C;
    }
    public static double x1(int A, int B){
        return (-B+Math.sqrt(D(2,3,1)))/(2*A);
    }
    public static double x2(int A, int B){
        return (-B+Math.sqrt(D(2,3,1)))/(2*A);
    }
}


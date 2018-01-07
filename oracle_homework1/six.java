package homework1;

public class six {
    public static void main(String[] args) {
        int x=0;
        if (x>0) {
            if (x % 2 == 0) {
                System.out.println("Положительное четно число");
            } else System.out.println("Положительное нечетно число");
        }
        if (x<0){
            if (x%2==0){
                System.out.println("Отрицательное четно число");
            }else System.out.println("Отрицательное нечетно число");
        }
        else System.out.println("Нулевое число");
    }
}

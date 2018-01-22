package homework1;

public class eight {
    public static void main(String[] args) {
        int number1=200;
        int number2=300;
        int number3=100;
        int C = 0;
        int B=0;
        int A=0;
        if (number2<number1&&number3<number1){
            C=number1;
        }if (number1<number2&&number3<number2){
            C=number2;
        }if (number1<number3&&number2<number3){
            C=number3;
        }
        if ((number2<number1&&number3>number1)||(number2>number1&&number3<number1)){
            B=number1;
        }if ((number1<number2&&number3>number2)||(number1>number2&&number3<number2)){
            B=number2;
        }if ((number1<number3&&number2>number3)||(number1>number3&&number2<number3)){
            B=number3;
        }
        if (number2>number1&&number3>number1){
            A=number1;
        }if (number1>number2&&number3>number2){
            A=number2;
        }if (number1>number3&&number2>number3){
            A=number3;
        }

        System.out.println("A="+A+" < "+"B="+B+" < "+"C="+C);



    }
}

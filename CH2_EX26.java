import java.util.Scanner;

public class CH2_EX26 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number1 = 0;
        int number2 = 0;

        System.out.println("Enter first number:");
        number1 = input.nextInt();

        System.out.println("Enter second number:");
        number2 = input.nextInt();

        if(number(number1, number2)){
            System.out.println(number1 + " is a multiple of " + number2);
        }
        else{
            System.out.println(number1 + " is  not a multiple of " + number2);
        }

    }
    public static boolean number(int num1, int num2){
        if((num1%num2)==0)
            return true;
        else
            return false;

    }

}
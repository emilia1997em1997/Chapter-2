import java.util.Scanner;

public class CH2_EX32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int number3;
        int number4;
        int number5;

        int positive = 0;
        int negative = 0;
        int zeros = 0;

        System.out.print("Enter first integer: ");
        number1 = input.nextInt();

        System.out.print("Enter second integer: ");
        number2 = input.nextInt();

        System.out.print("Enter third integer: ");
        number3 = input.nextInt();

        System.out.print("Enter fourth integer: ");
        number4 = input.nextInt();

        System.out.print("Enter fifth integer: ");
        number5 = input.nextInt();

        if (number1 < 0)
            negative = negative + 1;

        if (number2 < 0)
            negative = negative + 1;

        if (number3 < 0)
            negative = negative + 1;

        if (number4 < 0)
            negative = negative + 1;

        if (number5 < 0)
            negative = negative + 1;

        if (number1 > 0)
            positive = positive + 1;

        if (number2 > 0)
            positive = positive + 1;

        if (number3 > 0)
            positive = positive + 1;

        if (number4 > 0)
            positive = positive + 1;

        if (number5 > 0)
            positive = positive + 1;

        if (number1 == 0)
            zeros = zeros + 1;

        if (number2 == 0)
            zeros = zeros + 1;

        if (number3 == 0)
            zeros = zeros + 1;

        if (number4 == 0)
            zeros = zeros + 1;

        if (number5 == 0)
            zeros = zeros + 1;

        System.out.println();
        System.out.printf("Negative numbers: %d\n", negative);
        System.out.printf("Postive numbers: %d\n", positive);
        System.out.printf("Zero numbers: %d\n", zeros);

    }
}

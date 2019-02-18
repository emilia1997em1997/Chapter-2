import java.util.Scanner;

 class CH2_EX15 {
     public static void main(String args[]) {
         Scanner input = new Scanner(System.in);

         int number1; //first number to add
         int number2; //second number to add
         int sum; //sum of number1 and number2
         int product; //product of number1 and number2
         int difference; //difference of number1 and number2
         int division; //division of number1 and number2

         System.out.print("Enter first integer: ");
         number1 = input.nextInt();

         System.out.print("Enter second integer: ");
         number2 = input.nextInt();

         sum = number1 + number2;
         System.out.println("Sum is: " + sum);

         product = number1 * number2;
         System.out.println("Product is: " + product);

         difference = number1 - number2;
         System.out.println("Difference is: " + difference);

         division = number1 / number2;
         System.out.println("Division is: " + division);


     }
 }

import java.util.Scanner;

public class CH2_EX25 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int numbers = input.nextInt();
        if(numbers % 2 == 0) System.out.println("Even");
        else System.out.println("Odd");

    }
}

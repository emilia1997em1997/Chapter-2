import java.util.Scanner;
public class CH2_EX30 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a five-digit number:");
        int d1, d2, d3, d4, d5, N;
        N = sc.nextInt();
        d1 = N / 10000;
        N = N % 10000;
        d2 = N / 1000;
        N = N % 1000;
        d3 = N / 100;
        N = N % 100;
        d4 = N / 10;
        N = N % 10;
        d5 = N;
        System.out.printf("%d   %d   %d   %d   %d", d1, d2, d3, d4, d5);
    }
}


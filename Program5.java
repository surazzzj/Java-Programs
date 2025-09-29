// Factorial of a Number

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter input:");
        int n = input.nextInt();

        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;

        }
        System.out.println("Factorial:" + factorial);
    }
}

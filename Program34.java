// Factorial using Recursion

import java.util.Scanner;

public class Program34 {

    static int Factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
         return n*Factorial(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int num = sc.nextInt();
        System.out.print("factorial is: " + Factorial(num));
    }
}

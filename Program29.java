// GCD (HCF) of Two Numbers - GCD (Greatest Common Divisor) = largest number that divides both.

import java.util.Scanner;

public class Program29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = sc.nextInt();

        System.out.println("Enter second number:");
        int num2 = sc.nextInt();

        int gcd = 1;
        for (int i = 1; i <= Math.min(num1, num2); i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
        System.out.println("GCD = " + gcd);
    }
}

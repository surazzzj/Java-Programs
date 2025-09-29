// Swap Two Numbers Without Third Variable

import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number:");
        int num1 = input.nextInt();

        System.out.println("Enter second number:");
        int num2 = input.nextInt();

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("After swap num1 = " + num1 + " num2 = " + num2 );

    }
}

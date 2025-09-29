// Find Largest of Two Numbers

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your num1:");
        int a = input.nextInt();
        System.out.println("Enter your num2:");
        int b = input.nextInt();

        if (a > b) {
            System.out.println("Largest num is a: " + a);
        } else if (a == b) {
            System.out.println("both num are equal");
        } else {
            System.out.println("Largest is b: " + b);
        }
    }
}

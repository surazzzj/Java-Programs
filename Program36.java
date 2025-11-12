// Sum of Natural Numbers using Recursion

import java.util.Scanner;

public class Program36 {

    static int sum(int n) {
        if (n == 1) return 1;
        return n + sum(n - 1);
    }   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int num = sc.nextInt();
        System.out.print("Sum of first " + num + " natural numbers: " + sum(num));
    }
}

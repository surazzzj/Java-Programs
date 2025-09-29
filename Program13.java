// Palindrome Number

import java.util.Scanner;

public class Program13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num:");
        int num = sc.nextInt();

        int originalnum = num;
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + (num % 10);
            num = num / 10;
        }

        if (originalnum == rev) {
            System.out.println("Pallindrome Number");
        } else {
            System.out.println("Not a Pallindrome");
        }
    }
}

// Reverse a Number

import java.util.Scanner;

public class Program12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num:");
        int num = sc.nextInt();

        int rev = 0;
        while(num > 0){
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
        System.out.print("Reverse no: " + rev);
    }
}

// Power of a Number

import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base no: ");
        int base = sc.nextInt();
        System.out.print("Enter Exp no: ");
        int exp = sc.nextInt();

        int result = 1;

        for (int i = 1; i <= exp; i++) {
            result *= base;
        }
        System.out.println(result);
    }
}

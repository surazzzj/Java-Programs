// Fibonacci Series

import java.util.Scanner;

public class Program16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num:");
        int num = sc.nextInt();

        int a = 0, b = 1;
        System.out.println(a + " " + b);

        for(int i = 2; i < num; i++){
            int c = a + b;
            System.out.println(" " + c);
            a = b;
            b = c;
        }
    }
}

// Count Digits in a Number

import java.util.Scanner;

public class Program35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int num = sc.nextInt();
        int count = 0;

        while(num != 0){
            num = num / 10;
            count++;
        }
        System.out.print("Number of digits: " + count);
    
    }
}

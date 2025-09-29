// Check Even or Odd

import java.util.Scanner;

public class Program3 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your input:");

        int num = input.nextInt();

        if(num % 2 == 0){
            System.out.println("Even number");
        }
        else{
            System.out.println("odd number");
        }
    }
}
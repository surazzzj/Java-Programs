import java.util.Scanner;

public class Program31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int num = sc.nextInt();
        int rev = 0;

        while(num != 0){
            int digit = num % 10;         // get last digit
            rev = rev * 10 + digit;       // put digit in reverse
            num = num / 10;               // remove last digit
        }

        System.out.print("Reversed number: " + rev);
    }
}

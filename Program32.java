import java.util.Scanner;

public class Program32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = sc.nextInt();
        int rev = 0;
        int originalNum = num;

        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }

        if (originalNum == rev) {
            System.out.println("Pallindrome Number");
        } else {
            System.out.println("Not Pallindrome");
        }
    }
}

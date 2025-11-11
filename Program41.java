
import java.util.Scanner;

// print N-numbers of Fibonacci series

public class Program41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int first = 0, second = 1;
        int count = 0;
        System.out.println("The first " + n + " Fibonacci numbers are: ");
        while(count < n) {
            System.out.println(first);
            int next = first + second;
            first = second;
            second = next;
            count++;
        }

    }
}

// Print Numbers from 1 to N

import java.util.*;

public class Program1 {
    public static void main(String[] args) {
        System.out.println("Enter input n:");
        Scanner n = new Scanner(System.in);

        int num = n.nextInt();

        for(int i=1; i<=num; i++){
            System.out.println(i + "");
        }

    }
}

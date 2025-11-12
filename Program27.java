// Perfect Number - A Perfect Number is a number that is equal to the sum of its proper divisors (excluding the number itself).

import java.util.*;

public class Program27{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num:");
        int num = sc.nextInt();
        int sum = 0;

        for(int i=1; i<num; i++){
            if(num % i == 0){
                sum += i;
            }
        }

        if(sum == num){
            System.out.println(num + " is Perfect Number");
        }else{
            System.out.println(num + " is not Perfect");
        }
    }
}
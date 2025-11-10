// Diamond number pattern

public class Program39{
    public static void main(String[] args) {
        int num = 1;
        for (int i=1; i<=5; i++) {
            for (int j=1; j<=5-i+1; j++) {
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
        for (int i=2; i<=5; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print(" ");
            }
            for (int k=1; k<=5-i+1; k++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}

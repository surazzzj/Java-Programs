// right-aligned right-angled triangle

public class Program22 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) { // for spaces
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {     // for stars
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

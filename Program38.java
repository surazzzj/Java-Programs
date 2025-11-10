public class Program38 {
    public static void main (String[] args) {
        for(int i=1; i<=5; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            for (int k=1; k<=5-i+1; k++) {
                System.out.print("  ");
            }
            for (int l=1; l<=i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int m=2; m<=5; m++) {
            for (int n=1; n<=5-m+1; n++) {
                System.out.print("*");
            }
            for (int o=1; o<=m; o++) {
                System.out.print("  ");
            }
            for (int p=1; p<=5-m+1; p++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

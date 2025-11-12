// Half-diamond pattern

public class Program23 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < 2 * n; i++) {                  // loop for rows
            int totalcol = i > n ? 2 * n - i : i;          // decide how many stars in this row
            for (int j = 0; j < totalcol; j++) {           // loop for stars
                System.out.print("* ");          
            }
            System.out.println();
        }
    }
}

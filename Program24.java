// Diamond Pattern

public class Program24 {
    public static void main(String[] args) {
        int n =5;

        for (int i=0; i<=2*n; i++){
            int totalcol = i>n ? 2*n-i : i;
            
            int noOfSpaces = n-totalcol;
            for (int s=0; s<noOfSpaces; s++){
                System.out.print(" ");
            }
            for(int col=0; col<totalcol; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

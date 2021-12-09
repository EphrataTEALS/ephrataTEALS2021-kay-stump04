package Labs;

public class Loops {
    public static void main(String[] args) {
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                int product = row * col;
                System.out.print(product + "\t");
            }

            System.out.println();
        }
    }
    
}

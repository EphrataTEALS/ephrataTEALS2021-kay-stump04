package Labs;

import java.util.Scanner;

public class SimpleScanner {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.println("What is your favorite Music Group?");
        String favoritemusic = console.nextLine();
        System.out.println("My favorite music group is " + favoritemusic);

    }
}

package studentWork.Chapter1.CodeSpaces;

import java.util.*;

public class Game {
    public static void main(String[] args) {
        Scanner coinflip = new Scanner (System.in);
        int quit = 0;
        while (quit != -1) {
        String userchoice = "";
        System.out.println("Choose Heads or Tales");
        userchoice = coinflip.next();
        System.out.println(userchoice);
        Random computer = new Random();
        double computerChoice = computer.nextDouble();
        String computerChoiceString = "";
        System.out.println(computerChoice);
        if (computerChoice <0.5) {
            computerChoiceString = "Heads";
        } else {
            computerChoiceString = "Tales";
        }
        System.out.println("computerChoiceString");
        
        if (userchoice.equals(computerChoiceString)){
            System.out.println("Both choices were the same: You won!");
        } else {
            System.out.println("The choices were not the same: You lost");
        }
        System.out.println("Type -1 to quit, or any other number to play again.");
        quit = coinflip.nextInt();
    }
    }



}

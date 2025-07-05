import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner object.

        // generate random number which helps to select rock/paper/scissor randomly
        Random rand = new Random();  // instance
        int random = rand.nextInt(30); // random number generate between (0 to 29).

        // required variables and taking user input.
        String winner = "";
        String computer;
        System.out.print("Chose (rock/paper/scissor): ");
        String user = sc.nextLine().toLowerCase(); // converts user input to lower case --> no missMatch


        // assign (rock/paper/scissor) randomly to the computer
        if (random>10 && random<=20){
            computer = "rock";
        } else if (random<=10) {
            computer = "paper";
        } else{
            computer = "scissor";
        }

        // input validation............
        if((user.equals("rock")) || (user.equals("paper")) || (user.equals("scissor")) ) {
            //  winner checking
            if (computer.equals("rock") && user.equals("scissor")) {
                winner = "Computer";
            } else if (computer.equals("scissor") && user.equals("paper")) {
                winner = "Computer";
            } else if (computer.equals("paper") && user.equals("rock")) {
                winner = "Computer";
            } else if (computer.equals(user)) {
                winner = "tie";
            } else {
                winner = "Player";
            }
        } else {
            System.out.println("Invalid chose please chose between ('rock' / 'paper' / 'scissor')");
        }

        // Result---
        switch (winner){
            case "Computer":
                System.out.format("%s Win. computer chose \"%s\" & player chose \"%s\"", winner, computer, user);
                break;
            case "Player":
                System.out.format("%s Win. computer chose \"%s\" & player chose \"%s\"", winner, computer, user);
                break;
            case "tie":
                System.out.printf("No Winner, computer chose \"%s\" and player chose \"%s\" so tie", computer, user);
                break;
            default:
                winner = "null";
        }



    }
}

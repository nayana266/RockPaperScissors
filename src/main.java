import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String[] rps = {"rock", "paper", "scissors"};
            String computerTurn = rps[new Random().nextInt(rps.length)];
            // selects random move from array


            String playerTurn;

            while (true) {
                System.out.println("Please enter your move rock, paper, or scissors");
                playerTurn = scanner.nextLine();
                // obtains next line from user

                if (playerTurn.equals("rock") || playerTurn.equals("paper") || playerTurn.equals("scissors")) {
                    break;
                    // checking to see if player move is valid
                }
                System.out.println(playerTurn + "is not a valid move. Try again");
            }

            System.out.println("Computer played: " + computerTurn);

            if (playerTurn.equals(computerTurn)) {
                System.out.println("Tie!");
            } else if (playerTurn.equals("rock")) {
                if (computerTurn.equals("paper")) {
                    System.out.println("You lose.");
                } else {
                    System.out.println("You win!");
                }
            } else if (playerTurn.equals("paper")) {
                if (computerTurn.equals("scissors")) {
                    System.out.println("You lose.");
                } else {
                    System.out.println("You win!");
                }
            } else if (playerTurn.equals("scissors")) {
                if (computerTurn.equals("rock")) {
                    System.out.println("You lose.");
                } else {
                    System.out.println("You win!");
                }
            }
            System.out.println("Do you want to play again? y/n");
            String playAgain = scanner.nextLine();

            if(!playAgain.equals("y")){
                break;
            }
        }
    }
}

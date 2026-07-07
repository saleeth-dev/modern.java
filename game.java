import java.util.Scanner;
import java.util.Random;
public class game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();


        String[] choices = {"rock", "paper", "scissors"};
        String computerChoice;
        String playerChoice;
        String playAgain = "yes";

        System.out.println("Enter your move (rock, paper, or scissors): ");
        playerChoice = sc.nextLine().toLowerCase();

        if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")) {
            System.out.println("Invalid move. Please try again.");
            sc.close();
            return;
        }

        computerChoice = choices[rand.nextInt(choices.length)];
        System.out.println("Computer chose: " + computerChoice);

        if (playerChoice.equals(computerChoice)) {
            System.out.println("It's a tie!");
        } else if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                   (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                   (playerChoice.equals("scissors") && computerChoice.equals("paper"))) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }

        System.out.println("Do you want to play again? (yes/no): ");
        playAgain = sc.nextLine().toLowerCase();

        if(playAgain.equalsIgnoreCase("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
        }

        sc.close();
    }
}

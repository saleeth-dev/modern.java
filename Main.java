import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int numofDice;
        int total = 0;

        System.out.print("Enter the # of dice to roll: ");
        numofDice = sc.nextInt();

        
        if(numofDice > 0) {

            for(int i = 0; i < numofDice; i++) {
                int roll = rand.nextInt(1, 7);
                printDie(roll);
                System.out.println("You rolled a " + roll);
                total += roll;
            }
            System.out.println("Total: " + total);
            
        } else {
            System.out.println("You must roll at least one die.");
        }
        sc.close();
    }
    static void printDie(int roll) {

        String dice1 = """

                -----------
                |         |
                |    *    |
                |         |
                -----------
                """;
        String dice2 = """

                -----------
                |  *      |
                |         |
                |      *  |
                -----------
                """;    
        String dice3 = """

                -----------
                |  *      |
                |    *    |
                |      *  |
                -----------
                """;
        String dice4 = """
                -----------
                |  *   *  |
                |         |
                |  *   *  |
                -----------
                """;
        String dice5 = """
                -----------
                |  *   *  |
                |    *    |
                |  *   *  |
                -----------
                """;
        String dice6 = """
                -----------
                |  *   *  |
                |  *   *  |
                |  *   *  |
                -----------
                """;
        switch (roll) {
            case 1:
                System.out.print(dice1);
                break;
            case 2:
                System.out.print(dice2);
                break;
            case 3:
                System.out.print(dice3);
                break;
            case 4:
                System.out.print(dice4);
                break;
            case 5:
                System.out.print(dice5);
                break;
            case 6:
                System.out.print(dice6);
                break;
            default:
                System.out.println("Invalid die roll.");
        }
    }
}

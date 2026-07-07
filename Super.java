import java.util.Scanner;
public class Super {
    public static void main(String[] args) {

        String[] questions = {"What is the main function of a router? ",
                              "Who is the prime minister of india? ",
                              "What is the capital of india? ",
                              "What is the currency of india? ",
                              "What was the first programming language? "};

        String[][] options = {{"A. To connect multiple networks and direct data packets between them", "B. To store data and files for a network",
                            "C. To provide security for a network", "D. To manage user access to a network"},
                            {"A. priyank kharge", "B. Rahul Gandhi", "C. Manmohan Singh", "D. Atal Bihari Vajpayee"},
                            {"A. Bangaluru", "B. New Delhi", "C. Kolkata", "D. Chennai", "D. Chennai"},
                            {"A. Indian Rupee (INR)", "B. US Dollar (USD)", "C. Euro (EUR)", "D. British Pound (GBP)"},
                            {"A. Fortran", "B. COBOL", "C. Assembly Language", "D. C"}};

        int[] answers = {1, 2, 2, 1, 1};
        int score = 0;
        int guess;

        Scanner sc = new Scanner(System.in);

        System.out.println("**********************");
        System.out.println("Welcome to the Java Quiz Game!");
        System.out.println("**********************");
        
        for(int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

            for(String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if(guess == answers[i]) {
                System.out.println("***********");
                System.out.println("Correct!");
                System.out.println("***********");
                score++;
            }
            else {
                System.out.println("***********");
                System.out.println("Wrong!");
                System.out.println("***********");
            }
        }

        System.out.println("**********************");
        System.out.println("Your score is: " + score + "/" + questions.length);


        sc.close();

    }
}

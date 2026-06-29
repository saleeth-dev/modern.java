
public class Main {
    public static void main(String[] args) {

        // ternary operator 1
        int score = 55;
        String passOrFail = (score >= 60) ? "Pass" : "Fail";
        System.out.println("Result: " + passOrFail);

        // ternary operator 2
        int number = 3;
        String evenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";
        System.out.println("The number is: " + evenOrOdd);

        // ternary operator 3
        int hours = 13;
        String timeOfDay = (hours < 12) ? "A.M." : "P.M.";
        System.out.println("Time of day: " + timeOfDay);
    }
}

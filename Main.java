import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the day of the week: ");
        String day = sc.nextLine();

        switch(day){
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" ->
                System.out.println(day + " is a weekday.");
            case "Saturday", "Sunday" ->
                System.out.println(day + " is a weekend.");
            default ->
                System.out.println("Invalid day of the week.");
        }
        sc.close();
        
    }
}


public class Main {
    public static void main(String[] args) {

        String day = "Friday";

        if(day.equals("Monday")) {
            System.out.println("Today is Monday");
        } else if(day.equals("Tuesday")) {
            System.out.println("Today is Tuesday");
        } else if(day.equals("Wednesday")) {
            System.out.println("Today is Wednesday");
        } else if(day.equals("Thursday")) {
            System.out.println("Today is Thursday");
        } else if(day.equals("Friday")) {
            System.out.println("Today is Friday");
        } else if(day.equals("Saturday")) {
            System.out.println("Today is Saturday");
        } else if(day.equals("Sunday")) {
            System.out.println("Today is Weekend");
        } else {
            System.out.println("Invalid day");
        }
    }
}


public class Main{
    public static void main(String[] args){

        String fullName = getFullName("John", "Doe");
        System.out.println("FullName is " + fullName);
        
    }

        static void happyBirthday(String name, int age) {
            System.out.println("Happy Birthday to you!");
            System.out.printf("Happy Birthday %s Your age is now %d\n", name, age);
            System.out.printf("Happy Birthday dear %s\n ", name);
            System.out.println("Happy Birthday to you!\n");
        }
        static double square(double number) {
            return number * number;
        }
        static String getFullName(String firstName, String lastName) {
            return firstName + " " + lastName;
        }

}


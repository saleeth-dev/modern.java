public class Object {
    public static void main(String[] args) {
        car myCar = new car();
        System.out.println("Make: " + myCar.make);
        System.out.println("Model: " + myCar.model);
        System.out.println("Year: " + myCar.year);
        System.out.println("Price: $" + myCar.price);
        System.out.println("Is Electric: " + myCar.isElectric);

        myCar.start();
        myCar.stop();
    }
}

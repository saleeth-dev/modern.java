class Student {
    String name;
    int id;
    double rollNumber;

    Student(String name, int id, double rollNumber) {
        this.name = name;
        this.id = id;
        this.rollNumber = rollNumber;
    }
}

public class inherit extends Student {

    String nickName;

    inherit(String name, int id, double rollNumber, String nickName) {
        super(name, id, rollNumber);
        this.nickName = nickName;
    }

    void show() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Nickname: " + nickName);
    }

    public static void main(String[] args) {
        inherit obj = new inherit("Gullu", 20, 33.4, "Guddu");
        obj.show();
    }
}
public class car {
    String name;
    int age;
    String email;
    double salary;
    char gender;
    float height;


car(String name, int age){
    this.name = name;
    this.age = age;
}

car(String name, int age, String email){
    this.name = name;
    this.age = age;
    this.email = email;
}

car(String name, int age, String email, double salary){
    this.name = name;
    this.age = age;
    this.email = email;
    this.salary = salary;
}

car(String name, int age, String email, double salary, char gender){
    this.name = name;
    this.age = age;
    this.email = email;
    this.salary = salary;
    this.gender = gender;
}

car(String name, int age, String email, double salary, char gender, float height){
    this.name = name;
    this.age = age;
    this.email = email;
    this.salary = salary;
    this.gender = gender;
    this.height = height;
}
}
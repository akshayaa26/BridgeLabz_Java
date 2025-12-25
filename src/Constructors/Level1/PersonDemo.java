package Constructors.Level1;
class Person {


    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    Person(Person otherPerson) {
        this.name = otherPerson.name;
        this.age = otherPerson.age;
    }
    void displayDetails() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}

public class PersonDemo {
    public static void main(String[] args) {
        Person p1 = new Person("Akshayaa", 21);
        Person p2 = new Person(p1);

        System.out.println("👤 Original Person");
        p1.displayDetails();

        System.out.println("\n👤 Cloned Person");
        p2.displayDetails();
    }
}

package Constructors.AccessModifiers;

public class UniversityDemo {

    public static void main(String[] args) {


        Student s1 = new Student(101, "Akshayaa", 9.4);

        System.out.println("📘 Student Details");
        s1.displayStudentDetails();

        s1.setCGPA(9.6);
        System.out.println("\nAfter Updating CGPA:");
        System.out.println("Updated CGPA: " + s1.getCGPA());


        PostgraduateStudent pg = new PostgraduateStudent(201, "Rahul", 8.8, "M.Tech");

        System.out.println("🎓 Postgraduate Student Details");
        pg.displayPostgraduateDetails();
    }
}

class Student {


    public int rollNumber;
    protected String name;
    private double CGPA;


    Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }


    public double getCGPA() {
        return CGPA;
    }
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
    public void displayStudentDetails() {
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Name        : " + name);
        System.out.println("CGPA        : " + CGPA);
    }
}

class PostgraduateStudent extends Student {

    String course;

    PostgraduateStudent(int rollNumber, String name, double CGPA, String course) {
        super(rollNumber, name, CGPA);
        this.course = course;
    }

    void displayPostgraduateDetails() {
        System.out.println("Roll Number : " + rollNumber);  // public → accessible
        System.out.println("Name        : " + name);        // protected → accessible in subclass
        System.out.println("CGPA        : " + getCGPA());   // private → accessed via public method
        System.out.println("Course      : " + course);
    }
}

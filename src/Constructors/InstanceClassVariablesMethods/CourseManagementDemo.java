package Constructors.InstanceClassVariablesMethods;

public class CourseManagementDemo {

    public static void main(String[] args) {
        Course c1 = new Course("Java Full Stack", "6 Months", 45000);
        Course c2 = new Course("Python Data Science", "5 Months", 40000);
        c1.displayCourseDetails();
        c2.displayCourseDetails();

        System.out.println();
        Course.updateInstituteName("TechSkill Academy");
        System.out.println("\nAfter Updating Institute Name:\n");
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}

class Course {

    String courseName;
    String duration;
    double fee;

    static String instituteName = "SkillUp Institute";

    Course(String courseName, String duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }
    void displayCourseDetails() {
        System.out.println("Institute Name : " + instituteName);
        System.out.println("Course Name    : " + courseName);
        System.out.println("Duration       : " + duration);
        System.out.println("Fee            : ₹" + fee);
        System.out.println("-------------------------------");
    }
    static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }
}

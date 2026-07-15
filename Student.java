public class Student {
    static String studentName;
    static int studentAge;

    Student(String studentName, int studentAge) {
        this.studentName = studentName;
        this.studentAge = studentAge;
    }

    public static void display() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Age: " + studentAge);
    }
    public static void main(String[] args) {
        Student student1 = new Student("Heng", 20);
        student1.display();
    }
}

interface Printable {
    void printDetails();
}

interface Showable {
    void showInfo();
}

class Student implements Printable, Showable {
    String name;
    int roll;
    double marks;

    Student(String name, int roll, double marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }

    @Override
    public void printDetails() {
        System.out.println("Print student details....");
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Marks: " + marks);
    }

    @Override
    public void showInfo() {
        System.out.println("Showing student info....");
        System.out.println("Student " + name + " has secured " + marks + " marks.");
    }
}

public class assingment2_Q2 {
    public static void main(String[] args) {
        Student s = new Student("rahul sharma", 101, 89.5);
        s.printDetails();
        s.showInfo(); 
    }
}

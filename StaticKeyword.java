class Student {
    int rollno;
    String name;
    static String college;

    static {
        college = "BURIT";
    }

    Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    static void change() {
        college = "BURITN";
    }

    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}

public class StaticKeyword {
    public static void main(String args[]) {
        Student s1 = new Student(111, "Karan");
        Student s2 = new Student(222, "Potti");
        s1.display();
        s2.display();
        Student.change();
        s1.display();
        s2.display();
    }
}

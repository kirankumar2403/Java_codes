class Library {
    int id;

    Library(int id) {
        this.id = id;
    }
}

class Student extends Library {
    String name;

    Student(int id, String name) {
        super(id);
        this.name = name;
    }

    void display() {
        System.out.println("ID = " + id + ", Student Name = " + name);
    }
}

public class SimpleInheritance {
    public static void main(String args[]) {
        Student s = new Student(1, "Kiran");
        s.display();
    }
}

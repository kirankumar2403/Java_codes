class Student {
    int id;
    String name;
    int fee;

    Student(int i, String n) {
        id = i;
        name = n;
    }

    Student(int i, String n, int f) {
        id = i;
        name = n;
        fee = f;
    }

    void display() {
        System.out.println(id + " " + name + " " + fee);
    }
}

class ConstructorOverload {
    public static void main(String[] args) {
        Student s1 = new Student(11, "Kiran");
        Student s2 = new Student(22, "Kiran", 100);
        s1.display();
        s2.display();
    }
}

class Student {
    int rollno;
    String name;
    String course;
    float fee;

    Student(int rollno, String name, String course) {
        this.rollno = rollno;
        this.name = name;
        this.course = course;
    }

    Student getInstance() {
        return this;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + course + " " + fee);
    }

    public static void main(String[] args) {
        Student s = new Student(11, "Kiran", "Java");
        s.getInstance().display();
    }
}

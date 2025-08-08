interface A {
    void show();
}

interface B {
    void print();
}

interface C extends A, B {
    void display();
}

class D implements C {
    public void show() {
        System.out.println("Interface A method");
    }

    public void print() {
        System.out.println("Interface B method");
    }

    public void display() {
        System.out.println("Interface C method");
    }
}

public class MultipleInheritanceI {
    public static void main(String args[]) {
        D ob = new D();
        ob.show();
        ob.print();
        ob.display();
    }
}

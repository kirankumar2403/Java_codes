interface A {
    void show();
}

interface B {
    void print();
}

abstract class C implements A, B {
    public void print() {
        System.out.println("Interface B method");
    }
}

class D extends C {
    public void show() {
        System.out.println("Interface A method");
    }

    public void display() {
        System.out.println("class D method");
    }
}

public class AbstractInterface {
    public static void main(String args[]) {
        D ob = new D();
        ob.show();
        ob.print();
        ob.display();
    }
}

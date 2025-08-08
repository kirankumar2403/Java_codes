class A {
    int a, b;

    A(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void sum() {
        System.out.println("Sum is: " + (a + b));
    }
}

class B extends A {
    int c;

    B(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }

    @Override
    void sum() {
        System.out.println("Sum is: " + (a + b + c));
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        A a = new A(1, 2);
        a.sum();

        B b = new B(5, 6, 7);
        b.sum();
    }
}

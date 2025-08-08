import p1.A;

class Ex1 implements A {
    public void calculate() {
        System.out.println("sum is " + (a + b));
    }
}

public class PackageEx {
    public static void main(String args[]) {
        Ex1 ob = new Ex1();
        ob.calculate();
    }
}

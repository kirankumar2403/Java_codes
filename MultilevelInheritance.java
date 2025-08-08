class Grandfather {
    void ownHouse() {
        System.out.println("Own 2 BHK house");
    }
}

class Father extends Grandfather {
    void ownLand() {
        System.out.println("Own 1000 sq. yards land");
    }
}

class Son extends Father {
    void ownCar() {
        System.out.println("Own Audi car");
    }
}

public class MultilevelInheritance {
    public static void main(String args[]) {
        Son obj = new Son();
        obj.ownHouse();
        obj.ownLand();
        obj.ownCar();
    }
}

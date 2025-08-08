class Sample {
    static void sum(int a, int b) {
        System.out.println(a + b);
    }

    static void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    static void sum(float a, float b) {
        System.out.println(a + b);
    }
}

class MethodOverloading {
    public static void main(String[] args) {
        Sample s = new Sample();
        s.sum(1, 2);
        s.sum(2, 3, 4);
        s.sum(2.3f, 3.4f);
    }
}

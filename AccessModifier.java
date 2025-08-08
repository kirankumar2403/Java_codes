import cse.Example;

class AccessModifier {
    void show() {
        Example e = new Example();
        // System.out.println(e.a); // Error: private access
        System.out.println(e.b); // Public access
        // System.out.println(e.c); // Error: protected access outside package
        // System.out.println(e.d); // Error: default access
    }

    public static void main(String args[]) {
        AccessModifier ob = new AccessModifier();
        ob.show();
    }
}

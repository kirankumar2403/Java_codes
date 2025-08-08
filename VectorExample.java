import java.util.*;

class VectorExample {
    public static void main(String args[]) {
        Vector<String> v = new Vector<String>(3);

        System.out.println(v.size());
        System.out.println(v.capacity());

        v.add("suresh");
        v.add("ramesh");
        v.add("mukesh");
        v.add("vedansh");

        System.out.println(v.size());
        System.out.println(v.capacity());

        v.add("mukesh");
        v.add("vedansh");
        v.add("ramesh");

        System.out.println(v.size());
        System.out.println(v.capacity());
    }
}

import java.util.*;

class ArrayListEx {
    public static void main(String args[]) {
        ArrayList<Integer> al = new ArrayList<Integer>(3);
        System.out.println(al.size());

        al.add(21);
        al.add(3);
        al.add(34);
        al.add(10);

        System.out.println(al.size());
        System.out.println(al.indexOf(3));

        Collections.sort(al); // sorting

        Iterator i = al.iterator();
        while (i.hasNext())
            System.out.println(i.next());
    }
}

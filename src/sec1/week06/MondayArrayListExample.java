package sec1.week06;

import java.util.ArrayList;

public class MondayArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        System.out.println(al);
        al.add(1, 5);
        System.out.println(al);

        ArrayList<String> sl = new ArrayList<>();
        sl.add("hello");
        sl.add("goodbye");
        sl.add("ciao");
        System.out.println(sl);
        sl.remove("ciao");
        System.out.println(sl);
        sl.remove(1);
        System.out.println(sl);
        sl.add(0, "bonjour");
        sl.add(1, "guten tag");
        System.out.println(sl);
        sl.add(3, "ten");
        System.out.println(sl);
//        sl.add(5, "eleven");
//        sl.
    }
}

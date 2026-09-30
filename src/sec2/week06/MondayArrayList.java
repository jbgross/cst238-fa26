package sec2.week06;

import java.util.ArrayList;

public class MondayArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        int x = 2;
        al.add(x);
        al.add(3);
        System.out.println(al);
        al.set(2, 4);
        System.out.println(al);
        al.remove(1);
        System.out.println(al);
        al.add(1, 2);
        System.out.println(al);
        al.remove(new Integer(1));
        System.out.println(al);

        ArrayList<String> sl = new ArrayList<>();
        sl.add("hello");
        sl.add("goodbye");
        sl.add("ciao");
        System.out.println(sl);
        sl.add(0, "bonjour");
        System.out.println(sl);
        sl.add(2, "guten tag");
        System.out.println(sl);
        sl.remove(1);
        sl.remove("goodbye");
        System.out.println(sl);

    }
}

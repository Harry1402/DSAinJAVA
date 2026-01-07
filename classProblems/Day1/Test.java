import java.util.*;

public class Test {

    public static void main(String[] args) {
        Employee e1 = new Employee(10, "Hari");
        Employee e2 = new Employee(20, "Vishal");

        List<Employee> Al = new ArrayList<>();
        Al.add(e1);
        Al.add(e2);

        // System.out.println(Al);

        int abc[] = { 23, 42, 45, 12, 10 };
        System.out.println(Arrays.toString(abc));
        Arrays.sort(abc);
        System.out.println(Arrays.toString(abc));

        // ArrayList Main Combarable use karte huwe

        List<Integer> ls = new ArrayList<>();
        ls.add(20);
        ls.add(80);
        ls.add(10);

        Collections.sort(ls, Collections.reverseOrder());
        System.out.println(Collections.max(ls));
        System.out.println(ls);

         ArrayList<Employee> a = new ArrayList<Employee>();
       a.add(e1);
       a.add(e2);

       System.out.println(a);
       Collections.sort(a , new NameComparison());

       System.out.println(a);

    }
}

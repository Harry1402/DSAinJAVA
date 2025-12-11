
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class collections {
    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(20);
        a.add(30);

        // for(int i =0 ; i<a.size() ;i++){
        // System.out.println(a.get(i));
        // }

        Iterator<Integer> it = a.listIterator();

        while (it.hasNext()) {
        System.out.print(it.next());
        }

        Stack<Integer> s = new Stack<>();
        s.push(50);
        s.push(60);
        s.push(30);
        s.sort(null );

        System.out.println(s);

       // Queue collections

        Queue<Integer> Q = new LinkedList<>();
        ArrayBlockingQueue<String> s1= new ArrayBlockingQueue<>(2);

        s1.offer("hello");
        s1.offer("world");
        s1.offer("we");

        System.out.println(s);

        Q.offer(10);
        Q.offer(50);
        Q.offer(20);
        Q.add(20);

        System.out.println(Q);


        // PriorityQueqe
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(30);
        pq.add(60);
        pq.add(50);

        // pq.poll();
        System.out.println(pq);

       // ArrayDeque
     

        ArrayDeque<Integer> aq = new ArrayDeque<>();
        aq.add(20);
        aq.add(30);
        aq.add(50);
        aq.add(60);
        aq.addFirst(100);
        aq.addLast(200);

        // System.out.println(aq);
        System.out.println(aq.peek());
        System.out.println(aq.peekLast());
        System.out.println(aq.pollFirst());
        System.out.println(aq.pollLast());
        System.out.println(aq);

        //Set 

        Set<Integer> st = new TreeSet<>();
        st.add(20);
        st.add(80);
        st.add(60);

        System.out.println(st);


    


   // Map

    Map<Integer ,String> mp = new TreeMap<>() ;
    mp.put(2, "vishal");
    mp.put(3, "rakeshnag");
    mp.put(6, "saaurab");
    mp.put(5, "rajdeep");

    System.out.println(mp);

    for (Integer Rollno : mp.keySet()){
        System.out.println(Rollno);
    }

    for (String Name : mp.values()){
        System.out.println(Name);
    }


}};

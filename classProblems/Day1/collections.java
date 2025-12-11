
import java.util.*;



public class collections {
    public static void main(String[] args) {
        
  List <Integer> a = new ArrayList<>();
  a.add(10);
  a.add(20);
  a.add(30);




//   for(int i =0 ; i<a.size() ;i++){
//     System.out.println(a.get(i));
//   }

   Iterator<Integer> it = a.listIterator();
       
       while(it.hasNext())
       {
         System.out.print(it.next());
       }


    }
    
}

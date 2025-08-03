
import java.util.*;
public class  Arithmetic
{
   static int a , b ;

    public static int area(){
      return a * b;
    }

    public static int perimeter(){
      return 2 *(a+b );
    }
  public static void main(String[] args) {
   
    Scanner scanner = new Scanner(System.in);
    a =scanner.nextInt();
    b= scanner.nextInt();

    System.out.println(area());
    System.out.print(perimeter());

   
   
  }
}

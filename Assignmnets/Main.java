import java.util.*;
public class Main {
  static String name ;

  public static String Greet(){
    return "Hello,"+ " "+name ;
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
      name =scanner.nextLine();

    System.out.print(Greet());
    
  }
}

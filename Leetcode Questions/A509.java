
import java.util.Scanner;

public class A509 {
    public static void main(String[] var0) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter vallue of n ");
        int n= sc.nextInt();
        System.out.println("Fibonacii "+ fib(n));
        
    }

     static int fib(int n){
            if(n<= 1)
             return n;

             else 
               return fib(n-1)+fib(n-2);
        }
}

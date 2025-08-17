import java.util.Scanner;

public class A231 {

    public static boolean isPowerOfTwo(int n) {
        if (n == 1)
            return true;
        if (n < 1)
            return false;
        return (n % 2 == 0) && isPowerOfTwo(n / 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        boolean result = isPowerOfTwo(n);
        System.out.println("Is power of two? " + result);
        sc.close();
    }
}

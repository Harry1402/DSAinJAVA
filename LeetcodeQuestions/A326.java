import java.util.Scanner;

public class A326 {

    public static boolean isPowerOfThree(int n) {
        if (n == 1)
            return true;
        if (n < 1)
            return false;
        return (n % 3 == 0) && isPowerOfThree(n / 3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        boolean result = isPowerOfThree(n);
        System.out.println("Is power of Three? " + result);
        sc.close();
    }
}

import java.util.Scanner;

public class A342 {

    public static boolean isPowerOfFour(int n) {
        if (n == 1)
            return true;
        if (n < 1)
            return false;
        return (n % 4 == 0) && isPowerOfFour(n / 4);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        boolean result = isPowerOfFour(n);
        System.out.println("Is power of Four? " + result);
        sc.close();
    }
}

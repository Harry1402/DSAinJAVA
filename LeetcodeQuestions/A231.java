import java.util.Scanner;

public class A231 {

    static boolean isPowerOfTwo(int n) {
        if (n == 1)
            return true;
        if (n <= 0 || n % 2 != 0)
            return false;
        return isPowerOfTwo(n / 2); // recursion
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPowerOfTwo(n));
    }
}

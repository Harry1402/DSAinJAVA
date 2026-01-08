public class ConsecutiveCharacters {

    public static int maxPower(String s) {
        int count = 1;
        int ret = 1;

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                count = 1;
            }
            ret = Math.max(ret, count);
        }
        return ret;
    }

    public static void main(String[] args) {
        String s = "abbcccddddeeeeedcba";
        System.out.println(maxPower(s));
    }
}

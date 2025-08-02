import java.util.*;

public class Mapss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        Map<String, Integer> studentMarks = new HashMap<>();

        for (int i = 0; i < Q; i++) {
            String[] input = sc.nextLine().split(" ");
            String command = input[0];
            String name = input[1];

            switch (command) {
                case "add":
                    int marks = Integer.parseInt(input[2]);
                    studentMarks.put(name, marks);
                    break;

                case "erase":
                    studentMarks.remove(name);
                    break;

                case "print":
                    System.out.println(studentMarks.getOrDefault(name, 0));
                    break;
            }
        }
    }
}

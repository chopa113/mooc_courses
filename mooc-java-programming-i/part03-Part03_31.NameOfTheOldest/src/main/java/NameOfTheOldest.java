
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        String name = "";

        while (true) {
            String[] words = {};
            String input = String.valueOf(scanner.nextLine());

            if (input.equals("")) {
                break;
            }

            words = input.split(",");
            if (age < Integer.parseInt(words[1])) {
                age = Integer.parseInt(words[1]);
                name = words[0];
            }

        }
        System.out.println("Name of the oldest: " + name);

    }
}

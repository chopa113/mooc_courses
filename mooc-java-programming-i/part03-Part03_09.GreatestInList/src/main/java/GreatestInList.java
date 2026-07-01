
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }else{
                list.add(input);
            }
        }
        list.sort(Comparator.reverseOrder());
        
        System.out.println("The greatest number: " + list.get(0));
    }
}


import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();

        while (true) {
            String input = String.valueOf(scanner.nextLine());
            if (input.equals("")) {
                break;
            }
            String[] words = input.split(",");

            names.add(words[0]);
            ages.add(Integer.parseInt(words[1]));
        }
        String namee = names.get(0);
        int chars = names.get(0).length();
        for (String name : names) {
            if (name.length() > chars) {
                chars = name.length();
                namee = name;
            }
        }
        int sum = 0;
        for(int year: ages){
            sum +=year;
        }
        double avg = 0;
        avg = ((double) sum / ages.size());
        System.out.println("Longest name: " + namee);
        System.out.println("Average of the birth years: " + avg);
        
        
    }
}


import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        
        while(true){
            String[] words = {};
            String input = String.valueOf(scanner.nextLine());
            
            if(input.equals("")){
                break;
            }
            
            words = input.split(",");
            if(age < Integer.parseInt(words[1])){
                age = Integer.parseInt(words[1]);
            }
            
        }
        System.out.println("Age of the oldest: " + age);

    }
}

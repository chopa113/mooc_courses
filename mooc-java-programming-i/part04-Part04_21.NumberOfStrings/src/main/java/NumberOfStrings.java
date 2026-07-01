
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numOfStrings = 0;
        
        while(true){
            String line = scanner.nextLine();
            
            if("end".equals(line)){
                break;
            }
            numOfStrings++;
        }
        
        System.out.println(numOfStrings);
    }
}

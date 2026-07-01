
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num = 0;
        int sum = 0;
        
        while(true){
            int number = Integer.valueOf(scanner.nextLine());
            
            if(number == 0){
                break;
            }else if(number < 0){
                continue;
            }else{
                num += 1;
                sum += number;
                continue; 
            }
        }
        if(num != 0){
            double dbl = (double) sum/num;
            System.out.println("Average of the numbers: " + dbl);
        }else {
            System.out.println("Cannot calculate the average");
        }

    }
}


import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        Statistics statistics = new Statistics();
        Statistics evenStatistics = new Statistics();
        Statistics oddStatistics = new Statistics();
        
        System.out.println("Enter numbers:");
        while(true){
            int num = Integer.valueOf(scanner.nextLine());
            
            if(num == -1){break;}
            
            statistics.addNumber(num);
            
            if(num % 2 == 0){
                evenStatistics.addNumber(num);
            }else{
                oddStatistics.addNumber(num);
            }
                
        }

        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + evenStatistics.sum());
        System.out.println("Sum of odd numbers: " + oddStatistics.sum());
    }
}

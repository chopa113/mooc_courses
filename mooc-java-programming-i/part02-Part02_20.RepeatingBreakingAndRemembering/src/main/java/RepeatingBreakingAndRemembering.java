
import java.util.Scanner;
import java.util.ArrayList;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Give numbers:");
        
        while(true){
            int num = Integer.valueOf(scanner.nextLine());
            if(num == -1){
                break;
            }else{
                list.add(num);
                continue;
            }
        }
        
        
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        int size = list.size();
        int even = 0;
        int odd = 0;
        
        for(int num: list){
            if (num % 2 == 0) {
                even+=1;
            } else {
                odd+=1;
            }
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + size);
        System.out.println("Average: " + ((double) sum / size));
        System.out.println("Even: " + even + "\nOdd: " + odd);
        

    }
}

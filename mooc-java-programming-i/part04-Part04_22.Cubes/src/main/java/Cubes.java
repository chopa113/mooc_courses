
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            String line = scanner.nextLine();
            
            if("end".equals(line)){
                break;
            }
            
            int num = Integer.valueOf(line);
                    
            System.out.println((int) Math.pow(num,3));
        }

    }
}

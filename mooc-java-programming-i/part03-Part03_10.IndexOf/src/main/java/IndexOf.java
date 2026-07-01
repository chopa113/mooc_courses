
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList <Integer> list = new ArrayList <>();

        while(true){
            int number = Integer.valueOf(scanner.nextLine());
            
            if(number == -1){
                break;
            }else{
                list.add(number);
                continue;
            }
        }
        
        System.out.println("Search for?");
        int searchNum = Integer.valueOf(scanner.nextLine());
        for(int i = 0; i<list.size(); i++){
            if(list.get(i) == searchNum){
                System.out.println(searchNum + " is at index " + i);
            }
        }
        
        
        scanner.close();
    }
}


import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Name: ");
            String name = String.valueOf(scanner.nextLine());
            
            if("".equals(name)){break;}
            items.add(new Item(name));
        }
        
        for(Item name : items){
            System.out.println(name);
        }
        
        
    }
}

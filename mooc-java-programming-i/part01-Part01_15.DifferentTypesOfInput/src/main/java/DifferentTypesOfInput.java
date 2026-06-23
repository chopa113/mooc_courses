
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give a string:");
        String string = String.valueOf(scan.nextLine());
        
        System.out.println("Give an integer:");
        int integer = Integer.valueOf(scan.nextLine());
        
        System.out.println("Give a double:");
        double double1 = Double.valueOf(scan.nextLine());
        
        System.out.println("Give a boolean:");
        boolean bool = Boolean.valueOf(scan.nextLine());
        
        
        System.out.println("You gave the string " + string + "\nYou gave the integer " + integer + "\nYou gave the double " + double1 + "\nYou gave the boolean " + bool);
        
        
        

    }
}

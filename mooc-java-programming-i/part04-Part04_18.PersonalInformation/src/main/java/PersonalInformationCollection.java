
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.println("First name:");
            String firstname = String.valueOf(scanner.nextLine());
            
            if ("".equals(firstname)) {break;}
            
            System.out.println("Last name:");
            String lastname = String.valueOf(scanner.nextLine());
            
            System.out.println("Identification number:");
            String id = String.valueOf(scanner.nextLine());
            
            infoCollection.add(new PersonalInformation(firstname,lastname,id));

        }
        
        for(PersonalInformation info : infoCollection){
            System.out.println(info.getFirstName() + " " + info.getLastName());
        }

    }
}

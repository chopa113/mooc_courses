
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] usernames = {"alex","emma"};
        String[] passwords = {"sunshine","haskell"};

        System.out.println("Enter username:");
        String userInput = String.valueOf(scanner.nextLine());
        
        System.out.println("Enter password:");
        String passInput = String.valueOf(scanner.nextLine());
        
        boolean isLogged = false;
        
        for(int i = 0; i < usernames.length; i++){
            if(usernames[i].equals(userInput) && passwords[i].equals(passInput)){
                System.out.println("You have successfully logged in!");
                isLogged = true;
                break;
            }
        }
        if(!isLogged){
            System.out.println("Incorrect username or password!");
        }
        

    }
}

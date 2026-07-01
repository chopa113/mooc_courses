
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Title:");
            String title = String.valueOf(scanner.nextLine());
            
            if("".equals(title)){break;}
            
            System.out.println("Pages:");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication year:");
            int year = Integer.valueOf(scanner.nextLine());
            
            
            
            books.add(new Book(title, pages, year));
        }
        System.out.println("What information will be printed?");
        String info = String.valueOf(scanner.nextLine());
        
        switch(info){
            case "everything":
                for(Book book : books){System.out.println(book);}
                break;
            case "name":
                for(Book book : books){System.out.println(book.getTitle());}
                break;
        }

        scanner.close();

    }
}

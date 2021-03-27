import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {       
        Scanner scan = new Scanner(System.in);
        
        ArrayList<Book> books = new ArrayList<>();
        
        while (true) {
            System.out.print("Title: ");
            String title = scan.nextLine();
            if (title.isEmpty()) {
                break;
            }
            
            System.out.print("Pages: ");
            int pages = Integer.valueOf(scan.nextLine());
            System.out.print("Publication year: ");
            int year = Integer.valueOf(scan.nextLine());
            
            books.add(new Book(title, pages, year));
        }
        System.out.println();
        System.out.print("What information will be printed? ");
        String toPrint = scan.nextLine();
       
        int i = 0;
        while(i < books.size()) {
            Book book = books.get(i);
            
            if (toPrint.equals("everything")) {
                System.out.println(book);
            } else if (toPrint.equals("name")) {
                System.out.println(book.getTitle());
            }
            i++;
        }        
    }
}

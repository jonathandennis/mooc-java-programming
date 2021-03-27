
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        int found = 0;
        
        try (Scanner scanFile = new Scanner(Paths.get(file))) {
            while (scanFile.hasNextLine()) {
                String row = scanFile.nextLine();
                if (row.contains(searchedFor)) {
                    found++;
                }
            }
            if (found > 0) {
                 System.out.println("Found!");
             } else {
                 System.out.println("Not found.");
             }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
    }
}

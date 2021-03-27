
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("First name: ");
            String nameFirst = scanner.nextLine();
            if (nameFirst.isEmpty()) {
                break;
            }
            
            System.out.print("Last name: ");
            String nameLast = scanner.nextLine();
            
            System.out.print("Identification number: ");
            String idNum = scanner.nextLine();
            
            infoCollection.add(new PersonalInformation(nameFirst, nameLast, idNum));
        }
        System.out.println();
        for (PersonalInformation infoCollected : infoCollection) {
            System.out.println(infoCollected.getFirstName() + " " + infoCollected.getLastName());
        }
    }
}

import java.util.List;
import java.util.Scanner;

public class Search {

    public static void search (List<Contact> contactList, Scanner scan) {
        System.out.print("\nWhat contact would you like to search for?\n" +
                "\nfirstname:\n");
        String searchFirstname = scan.nextLine();
        int index = 0;
        for (Contact c : contactList) {
            if (searchFirstname.equals(c.getFirstName())) {
                System.out.print("Nr." + (index + 1) + "\n");
                c.printContact();
                System.out.print("\n\n");
            }
            index ++;
        }
    }
}

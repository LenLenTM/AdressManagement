import java.util.List;
import java.util.Scanner;

public class Delete {

    public static void deleteContact (List<Contact> contactList, Scanner scan) {

        System.out.print("\nWhich contact do you want to delete?\n" +
                    "Enter number of contact\n\n");
        int delete = scan.nextInt();
        scan.nextLine(); //Clear Scanner
        Contact temp = contactList.get(delete-1);
        contactList.remove(delete - 1);
        temp.printContact();
        System.out.print("\nwas deleted.\n");
        }
}
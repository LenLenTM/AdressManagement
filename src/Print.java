import java.util.List;
import java.util.Scanner;

public class Print {

    public static void print (List<Contact> contactList, Scanner scan) {

            System.out.print("\n\nWhat contact would you like to print?" +
                    "\n\nPrint a specific contact - Press s" +
                    "\nPrint all contacts       - Press a\n\n");
            String menu = scan.nextLine();

            if (menu.equals("s")) {
                System.out.print("\nWhich contact would you like to print?\n" +
                        "Enter number of contact\n\n");
                int specificNumber = scan.nextInt();
                System.out.print("\n");
                contactList.get(specificNumber).printContactAndAddress();
                System.out.print("\n\n");
                scan.nextLine(); //Clear Scanner
            }
            if (menu.equals("a")) {
                int contactListSize = contactList.size();
                for (int i = 0; i < contactListSize; i++) {
                    System.out.print("\n");
                    System.out.print("Nr." + (i +1) + "\n");
                    contactList.get(i).printContactAndAddress();
                    System.out.print("\n\n");
                }
            }
    }
}

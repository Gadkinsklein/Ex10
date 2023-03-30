import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;





public class Main {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Create a ContactList object to store the contacts
        ContactList contactList = new ContactList();

        // Get contact information from the user
        System.out.print("Enter the number of contacts: ");
        int numContacts = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        for (int i = 0; i < numContacts; i++) {
            System.out.println("Enter contact " + (i+1) + " information:");
            System.out.print("First name: ");
            String firstName = scanner.nextLine();
            System.out.print("Last name: ");
            String lastName = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();
            Contact contact = new Contact(firstName, lastName, email);
            contactList.addContact(contact);
        }

        // Display the contacts using a for-each loop
        System.out.println("Contacts:");
        for (Contact contact : contactList) {
            System.out.println(contact.getFirstName() + " " + contact.getLastName() + " (" + contact.getEmail() + ")");
        }
    }
}

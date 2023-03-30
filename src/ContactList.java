import java.util.ArrayList;
import java.util.Iterator;

class ContactList implements Iterable<Contact> {
    private ArrayList<Contact> contacts;

    public ContactList() {
        contacts = new ArrayList<Contact>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    @Override
    public Iterator<Contact> iterator() {
        return contacts.iterator();
    }}

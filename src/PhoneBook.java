import java.util.*;

public class PhoneBook {
    private Map<String, List<String>> contacts;
    public PhoneBook() {
        this.contacts = new HashMap<>();
    }
    public void add(String lastName, String phoneNumber) {
        List<String> numbers = contacts.getOrDefault(lastName, new ArrayList<>());
        numbers.add(phoneNumber);
        contacts.put(lastName, numbers);
    }
    public List<String> get(String lastName) {
        return contacts.getOrDefault(lastName, new ArrayList<>());
    }
}

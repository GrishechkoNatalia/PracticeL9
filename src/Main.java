import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Задание #1
        String[] words = {"apple", "banana", "apple", "orange", "banana", "grape", "apple", "melon", "orange", "grape", "kiwi"};
        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }

        Set<String> uniqueWords = new HashSet<>(wordCountMap.keySet());
        System.out.println("Уникальные слова:");

        for (String word : uniqueWords) {
            System.out.println(word + ": " + wordCountMap.get(word));
        }

        // Задание #2
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Иванов", "123-456");
        phoneBook.add("Петров", "789-012");
        phoneBook.add("Иванов", "456-789");

        System.out.println("Номера Иванова: " + phoneBook.get("Иванов"));
        System.out.println("Номера Петрова: " + phoneBook.get("Петров"));
        System.out.println("Номера Сидорова: " + phoneBook.get("Сидоров"));
    }
}

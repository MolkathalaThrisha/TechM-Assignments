package Questions;
import java.util.Map;
import java.util.TreeMap;
public class MultiLanguageDictionary<K extends Comparable<K>, V> {
    private final TreeMap<K, V> dictionary;
    public MultiLanguageDictionary() {
        dictionary = new TreeMap<>();
    }
    public void addWord(K word, V translation) {
        dictionary.put(word, translation);
    }
    public V getTranslation(K word) {
        return dictionary.get(word);
    }
    public void displayAllWords() {
        System.out.println("Dictionary Contents:");
        for (Map.Entry<K, V> entry : dictionary.entrySet()) {
            System.out.println("Word: " + entry.getKey() + " - Translation: " + entry.getValue());
        }
    }
    public static void main(String[] args) {
        MultiLanguageDictionary<String, String> engToFrench = new MultiLanguageDictionary<>();
        engToFrench.addWord("Hello", "Bonjour");
        engToFrench.addWord("Goodbye", "Au revoir");
        engToFrench.addWord("Please", "S'il vous plaît");
        engToFrench.addWord("Thank you", "Merci");
        String translation = engToFrench.getTranslation("Please");
        System.out.println("Translation of 'Please': " + translation);
        System.out.println();
        engToFrench.displayAllWords();
    }
}

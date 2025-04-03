package Questions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AnonymousClassSorting {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Grapes");
        Collections.sort(fruits, new Comparator<String>() {
            @Override
            public int compare(String fruit1, String fruit2) {
                return fruit2.compareTo(fruit1); // Reverse order
            }
        });
        System.out.println("Fruits in reverse alphabetical order:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

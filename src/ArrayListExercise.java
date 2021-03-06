import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExercise {
    public static void main(String[] args) {
    
        // Create an ArrayList of 5 Strings
        List<String> animals = new ArrayList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Goat");
        animals.add("Horse");
        animals.add("Duck");

        // Remove an element from the List of Strings
        animals.remove(0);

        // Add two elements to the List of Strings
        animals.add("Cow");
        animals.add("Chicken");

        // Create another ArrayList of 5 Strings
        List<String> cats = new ArrayList<>();
        cats.add("Tiger");
        cats.add("Cheetah");
        cats.add("Lion");
        cats.add("Leopard");
        cats.add("Jaguar");

        // Combine both Lists of Strings into a new ArrayList
        List<String> allAnimals = new ArrayList<>();
        allAnimals.addAll(animals);
        allAnimals.addAll(cats);

        // Iterate through your combined List of Strings and print each element
        Iterator<String> iterate = allAnimals.iterator();
        System.out.println("All Animals Array List: " + allAnimals);

        for(Iterator<String> i = allAnimals.iterator(); i.hasNext();) {
            System.out.println(i.next());
        }

        while(iterate.hasNext()){
            System.out.print(iterate.next());
            System.out.print(", ");
            }
            
            System.out.println("");

        // Remove your first List of Strings from your combined List.
        allAnimals.removeAll(animals);
        System.out.println("Cats Array List: " + allAnimals);

        // Clear all your Lists of Strings
        animals.clear();
        cats.clear();
        allAnimals.clear();
    }
}
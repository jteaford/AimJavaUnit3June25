import java.util.HashMap;
import java.util.Map;

public class HashMapExercise {
    public static void main(String[] args) {
        // Create a HashMap of 5 colors and their hex values
        Map<String, Integer> colors = new HashMap<>();
        colors.put("Red", 1);
        colors.put("Orange", 2);
        colors.put("Yellow", 3);
        colors.put("Green", 4);
        colors.put("Blue", 5);

        // Loop through and print each key and value of the map
        

        // Check to see if one of the colors exist in the map
        colors.containsKey("Blue");
        System.out.println("Does map contain blue? : " +colors.containsKey("Blue"));

        // Remove that color from the Map
        int value = colors.remove("Blue");
        System.out.println("Removed value: " + value);

        // Write a condition to check for the existence of that color again in the Map
        colors.containsKey("Blue");
        System.out.println("Is blue still there? : " + colors.containsKey("Blue"));

        // Print out something for each condition


        // Use the keySet() method to print out all keys in the map
        System.out.println("Keys: " + colors.keySet());

        // Use the values() method to print out all the values in the map
        System.out.println("Values: " + colors.values());
    }
}
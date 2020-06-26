import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExercise {
    public static void main(String[] args) {
        // Create a HashMap of 5 colors and their hex values
        Map<String, String> colors = new HashMap<>();
        colors.put("Red", "FF0000");
        colors.put("Orange", "FFA500");
        colors.put("Yellow", "#FFFF00");
        colors.put("Green", "#008000");
        colors.put("Blue", "#0000FF");

        // Loop through and print each key and value of the map
        Iterator iter = colors.entrySet().iterator();
        while(iter.hasNext()) {
            Map.Entry element = (Map.Entry) iter.next();
            System.out.println("Key" + element.getKey() + ", Value: " + element.getValue());
        }

        // Check to see if one of the colors exist in the map
        boolean containsBlue = colors.containsKey("Blue");
        System.out.println("Does map contain blue? : " + containsBlue);

        // Remove that color from the Map
        String removeColor = colors.remove("Blue");
        System.out.println(removeColor + " was removed");

        if (containsBlue == false) {
        System.out.println("Color is in map.");
        } else {
            System.out.println("Color is not in map.");
        }

        // Write a condition to check for the existence of that color again in the Map

        // Print out something for each condition


        // Use the keySet() method to print out all keys in the map
        System.out.println("Keys: " + colors.keySet());

        // Use the values() method to print out all the values in the map
        System.out.println("Values: " + colors.values());
    }
}
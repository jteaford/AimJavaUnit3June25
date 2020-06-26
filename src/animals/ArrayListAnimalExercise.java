package animals;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAnimalExercise {
    public static void main(String[] args) {
        
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Duck());

        for (Animal animal : animals) {
            if (animal instanceof Dog) {
                System.out.println("I am a dog");
            } else if (animal instanceof Cat) {
                System.out.println("I am a cat");
            }
        }
    }
}
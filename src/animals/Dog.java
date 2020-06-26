package animals;

public class Dog extends Animal {
    String breed;
    String size;
    short age;
    String color;

    //run
    public void run() {
        System.out.println("Dogs run...");
    }

    public void eat() {
        System.out.println("Dogs eat dog food.");

    }

    public void makeNoise() {
        super.makeNoise();
        System.out.println("Bow wow wow!");
    }
}
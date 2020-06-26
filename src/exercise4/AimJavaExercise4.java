package exercise4;

import java.util.Scanner;

public class AimJavaExercise4 {
    public static void main(String[] args) {
        // Tells the user what the program does.
        System.out.println("This program creates a point at (0,0) and a point at the coordinates entered by you. It then computes and displays the distance from (0,0) to the point defined by you, using three different methods.");

        // Uses the no-arg constructor to create a MyPoint object p1 at (0,0).

        // Prompts the user to enter the x and y coordinates of a point.
        System.out.println("Enter the x coordinate of a point: ");
        System.out.println("Enter the y coordinate of a point: ");
        

        // Saves the users input.
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        input.close();

        // Uses the first distance method to calculate and display the distance between the MyPoint object p1 and the point at the x and y coordinates entered by the user. The distance is displayed with two digits after the decimal point.


        // Uses the parameterized constructor to create a MyPoint object p2 using the x coordinate and y coodinate entered by the user.


        // Uses the second and third distance method to calculate and display the distance between the MyPoint object p1 and the MyPoint object p2. The distance is displayed with two digits after the decimal point.


        // Displays a goodbye message.
        System.out.println("Goodbye ...");
    }
    
}
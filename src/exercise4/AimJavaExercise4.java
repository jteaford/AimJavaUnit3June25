package exercise4;

import java.util.Scanner;

public class AimJavaExercise4 {
    public static void main(String[] args) {
        // Tells the user what the program does.
        System.out.println("This program creates a point at (0,0) and a point at the coordinates entered by you. It then computes and displays the distance from (0,0) to the point defined by you, using three different methods.");

        // Uses the no-arg constructor to create a MyPoint object p1 at (0,0).
        MyPoint p1 = new MyPoint();

        // Prompts the user to enter the x and y coordinates of a point.

        // Saves the users input.
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the x coordinate of a point: ");
        int x2 = input.nextInt();
        
        System.out.println("Enter the y coordinate of a point: ");
        int y2 = input.nextInt();
        
        input.close();

        // Uses the first distance method to calculate and display the distance between the MyPoint object p1 and the point at the x and y coordinates entered by the user. The distance is displayed with two digits after the decimal point.
        System.out.print("Using method 1, the distance from ("); 
        System.out.print(p1.getX());
        System.out.print(",");
        System.out.print(p1.getY());
        System.out.print(")");
        System.out.print(" to (");
        System.out.print(x2);
        System.out.print(",");
        System.out.print(y2);
        System.out.print(")");
        System.out.print(" is ");
        System.out.format("%1.2f", p1.distance(x2,y2));
        System.out.println("");

        // Uses the parameterized constructor to create a MyPoint object p2 using the x coordinate and y coodinate entered by the user.
        MyPoint p2 = new MyPoint(x2, y2);

        // Uses the second and third distance method to calculate and display the distance between the MyPoint object p1 and the MyPoint object p2. The distance is displayed with two digits after the decimal point.
        System.out.println("Using method 2, the distance from (");
        System.out.print(p1.getX());
        System.out.print(",");
        System.out.print(p1.getY());
        System.out.print(")");
        System.out.print(" to (");
        System.out.print(p2.getX());
        System.out.print(",");
        System.out.print(p2.getY());
        System.out.print(")");
        System.out.print(" is ");
        System.out.format("%1.2f", p1.distance(p2));
        System.out.println("");

        System.out.println("Using method 3, the distance from (");
        System.out.print(p1.getX());
        System.out.print(",");
        System.out.print(p1.getY());
        System.out.print(")");
        System.out.print(" to (");
        System.out.print(p2.getX());
        System.out.print(",");
        System.out.print(p2.getY());
        System.out.print(")");
        System.out.print(" is ");
        System.out.format("%1.2f", MyPoint.distance(p1, p2));
        System.out.println("");

        // Displays a goodbye message.
        System.out.println("Goodbye ...");
    }
    
}
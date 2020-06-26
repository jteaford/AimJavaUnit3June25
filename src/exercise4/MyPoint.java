package exercise4;

public class MyPoint {
    // Two data fields x and y, that represent the x-coordinate and the y-coordinate of the point.
    int x;
    int y;

    // Getter and setter methods for x and y.
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // A no-arg constructor that creates a default point at (0,0).
    public MyPoint() {
        MyPoint p1 = new MyPoint();
        x = 0;
        y = 0;
        }

    // A parameterized constructor that creates a point at the designated x and y coordinate.
    public MyPoint(int x, int y) {
    
    }

    // A member method named distance that calculates and returns the distance between this MyPoint object and another point that is specified by its x- and y-coordinates. The method header looks like this: public double distance(int xCoord, int yCoord);
        public double distance(int xCoord, int yCoord){
            MyPoint mp1 = new MyPoint();
            MyPoint mp2 = new MyPoint();
            MyPoint.distance(mp1, mp2);
        }

    // A member method named distance that calculates and returns the distance between this MyPoint object and another object of the MyPoint class. The method header looks like this: public double distance(MyPoint p)
        public double distance(MyPoint p){

        }

    // A static, non-member method named distance that takes two objects of the MyPoint class as parameters, and calculates and returns the distance between the two of them. The method header looks like this: public static double distance (MyPoint mp1, MyPoint mp2)
        public static double distance(MyPoint mp1, MyPoint mp2){

            return distance;
        }
    
    // Create a UML diagram that documents your class design.  

}



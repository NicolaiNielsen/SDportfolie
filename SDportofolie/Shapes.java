import java.awt.Polygon;

public abstract class Shapes extends Polygon{
    //using abstract class that cant be instantiated but can be extended to subclass
    //using abstract methods to declare the method and provide implementation later on

    //define methods
    //methods are private since we only access them using objects of the same superclass and subclass

    abstract public double[] calculateCenter();
    abstract public double calculateArea();
    abstract public double calculateCircumference();
    abstract public boolean checkInside();

}
import java.util.*;
import java.awt.Polygon;
import java.awt.geom.*;

public class Main {
    public static void main(String[] args) {

        Polygon rectangle = new Polygon(new int[]{-2, 1, 5, 2}, new int[]{3, 6, 2, -1}, 4);
        Rectangle rect = new Rectangle(2, 2);
        rect.setPolygon(rectangle);
        System.out.println(rect.checkInside());
        System.out.println("width: " + rect.calculateWidth() + " height: " + rect.calculateHeight());
        System.out.println("Area: " + rect.calculateArea());
        System.out.println("Perimeter: " + rect.calculateCircumference());
        System.out.println("Center coordinate: " + Arrays.toString(rect.calculateCenter()));

        Polygon triangle = new Polygon(new int[]{0, 2, 5}, new int[]{0, 4, 0}, 3);
        Triangle tri = new Triangle(2, 2);
        tri.setPolygon(triangle);
        System.out.println("Area: " + tri.calculateArea());
        System.out.println("Perimeter: " + tri.calculateCircumference());
        System.out.println("Center coordinate: " + Arrays.toString(tri.calculateCenter()));

        Ellipse2D circle = new Ellipse2D.Double(1, 1, 1, 1);
        Circle circ = new Circle(1.5, 1.5);
        circ.setPolygon(circle);
        System.out.println("Area: " + circ.calculateArea());
        System.out.println("Perimeter: " + circ.calculateCircumference());
        System.out.println("Center coordinate: " + Arrays.toString(circ.calculateCenter()));
        System.out.println(circ.checkInside());

    }
}

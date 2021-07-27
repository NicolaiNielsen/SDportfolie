import java.awt.geom.*;


public class Circle extends Shapes{

    Ellipse2D shape;
    double x, y;
    double width, height;
    final double pi = Math.PI;

    public Circle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setPolygon(Ellipse2D shape) {
        this.shape = shape;
    }

    @Override
    public double[] calculateCenter() {
        
        double[] center = new double[2];
        center[0] = shape.getCenterY();
        center[1] = shape.getCenterY();

        return center;
    }

    @Override
    public double calculateArea() {
        return pi * Math.pow(shape.getWidth()/2, 2);
    }

    @Override
    public double calculateCircumference() {
        return 2 * pi * shape.getWidth()/2;
    }

    @Override
    public boolean checkInside() {
        return shape.contains(x, y);
    }
    
}

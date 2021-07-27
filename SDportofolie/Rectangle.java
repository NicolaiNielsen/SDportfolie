import java.awt.Polygon;


public class Rectangle extends Shapes {

    Polygon shape;
    double x, y;
    double width, height;

    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setPolygon(Polygon shape) {
        this.shape = shape;
    }

    public double calculateWidth() {
        return width = Math.sqrt((shape.xpoints[1]-shape.xpoints[0])*(shape.xpoints[1]-shape.xpoints[0]) + (shape.ypoints[1]-shape.ypoints[0])*(shape.ypoints[1]-shape.ypoints[0]));
    }

    public double calculateHeight() {
        return height = Math.sqrt((shape.xpoints[3]-shape.xpoints[0])*(shape.xpoints[3]-shape.xpoints[0]) + (shape.ypoints[3]-shape.ypoints[0])*(shape.ypoints[3]-shape.ypoints[0]));
    }


    @Override
    public double calculateArea() {
        return height * width;
    }

    @Override
    public double calculateCircumference() {
        return height*2 + width*2;
    }

    @Override
    public boolean checkInside() {
        return shape.contains(x, y);
    }

	@Override
	public double[] calculateCenter() {

        double[] center = new double[2];
        center[0] = height/2;
        center[1] = width/2;

        return center;
	}
    
}

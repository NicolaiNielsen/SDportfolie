import java.awt.Polygon;

public class Triangle extends Shapes {

    Polygon shape;
    double x, y;
    double width, height;

    public Triangle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setPolygon(Polygon shape) {
        this.shape = shape;
    }

    @Override
    public double[] calculateCenter() {
    //x = (ax + bx + cx/3)
    //y = (ay + by + cy/3)
    
    double[] center = new double[2];
    center[0] = (float)(shape.xpoints[0] + shape.xpoints[1] + shape.xpoints[2]) / 3;
    center[1] = (float)(shape.ypoints[0] + shape.ypoints[1] + shape.ypoints[2]) / 3;

    return center;
    }

    @Override
    public double calculateArea() {
        return Math.abs((shape.xpoints[0]*(shape.ypoints[1]-shape.ypoints[2]) + shape.xpoints[2]*(shape.ypoints[2]-shape.ypoints[0])+shape.xpoints[2]*(shape.ypoints[0]-shape.ypoints[1]))/2.0);
    }

    @Override
    public double calculateCircumference() {
        //3x = √ ( (x2 - x1)2 + (y2 - y1)2 )
        double AB = Math.sqrt((Math.pow(shape.xpoints[1]-shape.xpoints[0],2) + Math.pow(shape.ypoints[1]-shape.ypoints[0],2)));
        double BC = Math.sqrt((Math.pow(shape.xpoints[2]-shape.xpoints[1],2) + Math.pow(shape.ypoints[2]-shape.ypoints[1],2)));
        double CA = Math.sqrt((Math.pow(shape.xpoints[0]-shape.xpoints[2],2) + Math.pow(shape.ypoints[0]-shape.ypoints[2],2)));
        return AB + BC + CA;
    }

    @Override
    public boolean checkInside() {
        return shape.contains(x, y);
    }


}

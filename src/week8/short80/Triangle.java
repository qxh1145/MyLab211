package week8.short80;
public class Triangle extends TwoDimensonalShape {
    private double side;

    public Triangle(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return (Math.sqrt(3) / 4) * side * side;
    }

    @Override
    public String toString() {
        return "Triangle[side=" + side + "]";
    }
}
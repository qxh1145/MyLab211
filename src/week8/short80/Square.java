package week8.short80;

public class Square extends TwoDimensonalShape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Square[side=" + side + "]";
    }
}

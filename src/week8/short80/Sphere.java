package week8.short80;

// Sphere class
public class Sphere extends ThreeDimensionalShape {
    private double radius;
    private static final double PI = Math.PI;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 4 * PI * radius * radius;
    }

    @Override
    public double getVolume() {
        return (4.0 / 3.0) * PI * Math.pow(radius, 3);
    }

    @Override
    public String toString() {
        return "Sphere[radius=" + radius + "]";
    }
}

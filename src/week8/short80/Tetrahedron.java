package week8.short80;

public class Tetrahedron extends ThreeDimensionalShape {
    private double edge;

    public Tetrahedron(double edge) {
        this.edge = edge;
    }

    @Override
    public double getArea() {
        return Math.sqrt(3) * edge * edge;
    }

    @Override
    public double getVolume() {
        return (1.0 / 12.0) * Math.sqrt(2) * Math.pow(edge, 3);
    }

    @Override
    public String toString() {
        return "Tetrahedron[edge=" + edge + "]";
    }
}

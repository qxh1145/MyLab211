package week8.short80;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle(5.0));
        shapes.add(new Square(4.0));
        shapes.add(new Triangle(3.0));
        shapes.add(new Sphere(2.0));
        shapes.add(new Cube(3.0));
        shapes.add(new Tetrahedron(4.0));

        for (Shape shape : shapes) {
            if (shape instanceof TwoDimensonalShape) {
                TwoDimensonalShape twoDShape = (TwoDimensonalShape) shape;
                System.out.printf("Area: %.2f%n", twoDShape.getArea());
            } else if (shape instanceof ThreeDimensionalShape) {
                ThreeDimensionalShape three = (ThreeDimensionalShape) shape;
                System.out.printf("Surface Area: %.2f%n", three.getArea());
                System.out.printf("Volume: %.2f%n", three.getVolume());
            }
            System.out.println();
        }
    }
}

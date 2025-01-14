/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2.calculateperimeterandarea.model;

/**
 *
 * @author knigh
 */
public class Circle extends Shape {
    static final double PI = 3.14;
    private double r;

    public Circle() {
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * r;
    }

    @Override
    public double getArea() {
        return PI * (r * r);
    }

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public void printResult() {
        System.out.println("----Circle----");
        System.out.println("Radius: "+getR());
        System.out.println("P: "+getPerimeter());
        System.out.println("A: "+getArea());
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2.calculateperimeterandarea.model;

/**
 *
 * @author knigh
 */
public class Rectangle extends Shape{
    double a,b;

    public Rectangle() {
    }

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double getPerimeter() {
        return 2 * (a + b);
    }

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public void printResult() {
        System.out.println("----Rectangle----");
        System.out.println("Width: "+ getB());
        System.out.println("Length: "+ getA());
        System.out.println("P: "+getPerimeter());
        System.out.println("A: "+getArea());
    }
}

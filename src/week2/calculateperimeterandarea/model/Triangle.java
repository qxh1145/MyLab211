/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2.calculateperimeterandarea.model;

/**
 *
 * @author knigh
 */
public class Triangle extends Shape{
    private double a,b,c,h;

    public Triangle() {
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
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

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public double getArea() {
        double haftPermeter = getPerimeter() / 2;
        if (h > 0){
            return 1/2*(b * h);
        }else {
            return Math.sqrt(haftPermeter*(haftPermeter - a) * (haftPermeter - b) * (haftPermeter - c));
        }
    }

    @Override
    public void printResult() {
        System.out.println("----Triangle----");
        System.out.println("Side A: " + getA());
        System.out.println("Side B: "+ getB());
        System.out.println("Side C: " + getC());
        System.out.println("P: "+getPerimeter());
        System.out.println("A: "+getArea());
    }
}

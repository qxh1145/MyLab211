/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2.calculateperimeterandarea.model;

import week2.calculateperimeterandarea.view.Validation;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author knigh
 */
public class Function {
    private ArrayList<Shape> shapeList =new ArrayList<>();
    Scanner input = new Scanner(System.in);
    public void inputShape(){
        double sw = Validation.getDouble("Please input side width of Rectangle:");
        double len = Validation.getDouble("Please input length of Rectangle:");
        double rad = Validation.getDouble("Please input radius of Circle:");
        double a = Validation.getDouble("Please input side A of Triangle:");
        double b = Validation.getDouble("Please input side B of Triangle:");
        double c = Validation.getDouble("Please input side C of Triangle:");

        shapeList.add(new Rectangle(sw,len));
        shapeList.add(new Circle(rad));
        shapeList.add(new Triangle(a,b,c));
    }

    public void display(){
        for (Shape shape : shapeList){
            shape.printResult();
        }
    }

}

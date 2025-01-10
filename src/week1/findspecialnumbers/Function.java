/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1.findspecialnumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author knigh
 */
public class Function {
    SpeacialNumbers speacialNumbers = new SpeacialNumbers();

    public static void displayMenu(){
        System.out.println("\n=== Equation Program ===");
        System.out.println("1. Calculate Superlative Equation");
        System.out.println("2. Calculate Quadratic Equation");
        System.out.println("3. Exit");
    }

    public static void calSuperlativeEquation(){
        float a = Validation.getFloat("Enter coeffficent A:  ");
        float b =Validation.getFloat("Enter coeffficent B: ");

        List<Float> result = calculateEquation(a,b);
        if(result == null){
            System.out.println("No solution");
        }else if (result.isEmpty()){
            System.out.println("Infinite solution");
        }else {
            System.out.println("Solution: x = " + result.get(0));
        }
        displayEquation(a,b);
    }

    public static void calQuadEquation(){
        float a = Validation.getFloat("Enter coefficent A: ");
        float b = Validation.getFloat("Enter coefficent B: ");
        float c = Validation.getFloat("Enter coefficent C: ");

        List<Float> result = calculateQuadraticEquation(a,b,c);

        if (result == null){
            System.out.println("No solution");
        }else if (result.isEmpty()){
            System.out.println("infitine solution");
        }else if (result.size() == 1) {
            System.out.println("Solution: x = " + result.get(0));
        }else {
            System.out.println("Solution: x1: = " + result.get(0) + "x2 = " + result.get(1));
        }

        displayQuadraticEquation(a,b,c);
    }



    private static List<Float> calculateEquation(float a, float b){
        if (a == 0){
            return b == 0 ? new ArrayList<>() : null;
        }
        return Collections.singletonList(-b/a);
    }
    private static List<Float> calculateQuadraticEquation(float a, float b, float c) {

        if (a == 0) {
            return calculateEquation(b, c);
        }
        float denta = b * b - 4 * a * c;
        if (denta < 0) {
            return null;
        } else if (denta == 0){
            return Collections.singletonList(-b / (2 * a));
        }else {
            return Arrays.asList((-b + (float) Math.sqrt(denta)) / (2 * a), (-b - (float) Math.sqrt(denta)) / (2 * a));
        }
    }

    private static boolean isEven(double a){
        return (a % 2 == 0);
    }
    private static boolean isPerfectSquare(double a){
        if (a < 0){
            return false;
        }
        return Math.sqrt(a) * Math.sqrt(a) == a;
    }

    private static void displayQuadraticEquation(float... nums) {
        System.out.println("\n----- Calculate Quadratic Equation -----");

        List<Float> oddNumbers = new ArrayList<>();
        List<Float> evenNumbers = new ArrayList<>();
        List<Float> perfectSquares = new ArrayList<>();

        for (float num : nums) {
            if (isEven(num)) {
                evenNumbers.add(num);
            } else {
                oddNumbers.add(num);
            }
            if (isPerfectSquare(num)) {
                perfectSquares.add(num);
            }
        }

        if (!oddNumbers.isEmpty()) {
            System.out.print("Odd Number(s): ");
            for (Float odd : oddNumbers) {
                System.out.print(odd + ", ");
            }
            System.out.println();
        }

        if (!evenNumbers.isEmpty()) {
            System.out.print("Number is Even: ");
            for (Float even : evenNumbers) {
                System.out.print(even + ", ");
            }
            System.out.println();
        }

        if (!perfectSquares.isEmpty()) {
            System.out.print("Number is Perfect Square: ");
            for (Float square : perfectSquares) {
                System.out.print(square + ", ");
            }
            System.out.println();
        }
    }

    private static void displayEquation(float... nums) {
        System.out.println("\n----- Calculate Equation -----");

        List<Float> oddNumbers = new ArrayList<>();
        List<Float> evenNumbers = new ArrayList<>();
        List<Float> perfectSquares = new ArrayList<>();

        for (float num : nums) {
            if (isEven(num)) {
                evenNumbers.add(num);
            } else {
                oddNumbers.add(num);
            }
            if (isPerfectSquare(num)) {
                perfectSquares.add(num);
            }
        }

        if (!oddNumbers.isEmpty()) {
            System.out.print("Odd Number(s): ");
            for (Float odd : oddNumbers) {
                System.out.print(odd + ", ");
            }
            System.out.println();
        }

        if (!evenNumbers.isEmpty()) {
            System.out.print("Number is Even: ");
            for (Float even : evenNumbers) {
                System.out.print(even + ", ");
            }
            System.out.println();
        }

        if (!perfectSquares.isEmpty()) {
            System.out.print("Number is Perfect Square: ");
            for (Float square : perfectSquares) {
                System.out.print(square + ", ");
            }
            System.out.println();
        }
    }



}

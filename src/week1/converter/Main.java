/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1.converter;

import java.util.Scanner;

/**
 *
 * @author knigh
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Function conveter = new Function();

        System.out.print("Enter input base (2,10,16): ");
        int inputBase = input.nextInt();

        System.out.print("Enter output base (2,10,16): ");
        int outputBase = input.nextInt();

        System.out.println("Enter the input value: ");
        String inputValue = input.next().toUpperCase();

        Base base = new Base(inputValue, inputBase, outputBase);
        System.out.println(base);

        try {
            String outputValue = conveter.convert(inputValue, inputBase, outputBase);
            System.out.println("Output value: " +outputValue);
        }catch (Exception e) {
            System.out.println("error");
        }
    }
    
}

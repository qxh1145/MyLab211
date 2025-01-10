/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1.countwordandchar;

import java.util.Scanner;

/**
 *
 * @author knigh
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String ");
        String input =  sc.nextLine();
        CountWordAndChar run = new CountWordAndChar(input);
        System.out.println(run.toString());
    }

}

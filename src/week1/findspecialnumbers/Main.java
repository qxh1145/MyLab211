/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1.findspecialnumbers;

import java.util.Scanner;

/**
 *
 * @author knigh
 */
public class Main {
    public void run(){
        int op;
        while (true) {
            Function.displayMenu();
            do {
                op = Validation.getInt("Enter your choice: ");
            } while (op < 1);
            switch (op) {
                case 1 -> {
                    Function.calSuperlativeEquation();
                }
                case 2 -> {
                    Function.calQuadEquation();
                }
                case 3 -> {
                    System.out.println("Exiting...");
                    System.exit(0);
                }
            }
        }
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
}

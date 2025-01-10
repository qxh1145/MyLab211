/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1.linearsearch;

/**
 *
 * @author knigh
 */
public class Main {
    public static void main(String[] args) {
        Function fcn = new Function();

        fcn.generateArr();
        fcn.lSearch();
        System.out.println(fcn.getLinearSearch().toString());
    }
}

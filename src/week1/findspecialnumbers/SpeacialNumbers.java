/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1.findspecialnumbers;

/**
 *
 * @author knigh
 */
public class SpeacialNumbers {
   
    private float coefficientA;
    private float coefficientB;
    private float coefficientC;

    

    public SpeacialNumbers() {
    }

    public SpeacialNumbers(float coefficientA, float coefficientB, float coefficientC) {
        this.coefficientA = coefficientA;
        this.coefficientB = coefficientB;
        this.coefficientC = coefficientC;
    }
    
    public float getCoefficientA() {
        return coefficientA;
    }

    public float getCoefficientB() {
        return coefficientB;
    }

    public float getCoefficientC() {
        return coefficientC;
    }
}

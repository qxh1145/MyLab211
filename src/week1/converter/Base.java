/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1.converter;

/**
 *
 * @author knigh
 */
public class Base {
    private String inputValue;
    private int inputBase;
    private int outputBase;

    public Base(String inputValue, int inputBase, int outputBase) {
        this.inputValue = inputValue;
        this.inputBase = inputBase;
        this.outputBase = outputBase;
    }

    @Override
    public String toString() {
        return "Input Value: " + inputValue + ", Input Base: " + inputBase + ", Output Base: " + outputBase;
    }
}

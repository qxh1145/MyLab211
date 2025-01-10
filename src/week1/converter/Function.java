/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1.converter;

/**
 *
 * @author knigh
 */
public class Function {
    public int cvtToDecimal(String number, int base){
        int decimalValue = 0;
        int power = 0;
        for (int i = number.length() - 1; i >= 0; i--){
            char digit = number.charAt(i);
            int digiValue = (digit >= '0' && digit <= '9') ? digit - '0' : digit - 'A' + 10;
            decimalValue += digiValue * Math.pow(base, power);
            power++;
        }
        return decimalValue;
    }
    
    public String cvtFromDecimal(int decimal, int base){
        StringBuilder result = new StringBuilder();
        while (decimal > 0) {
            int remain = decimal % base;
            char digit = (char) ((remain < 10) ? ('0' + remain) : ('A' + remain - 10));
            result.insert(0, digit);
            decimal /= base;
        }
        return result.length() > 0 ? result.toString() : "0";
    }

    public String convert(String inputValue, int inputBase, int outputBase){
        int decimalValue = cvtToDecimal(inputValue, inputBase);
        return cvtFromDecimal(decimalValue, outputBase);
    }
}

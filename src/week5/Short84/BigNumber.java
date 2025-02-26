package week5.Short84;


import java.beans.PropertyEditorSupport;
import java.util.Scanner;

public class BigNumber {
    private String value;

    public BigNumber(String value) {
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }

    public BigNumber add(BigNumber other){
        String num1 = this.value;
        String num2 = other.value;
        StringBuilder result = new StringBuilder();

        int borrow = 0 , i = num1.length() - 1 , j = num2.length() - 1;

        while (borrow > 0 || i >= 0 || j >= 0){
            int digit1 = i >= 0 ? num1.charAt(i) - '0': 0;
            int digit2 = j >= 0 ? num2.charAt(j) - '0': 0;
            int sum = borrow + digit2 + digit1;

            result.append(sum / 10);
            i--;
            j--;
        }
        return new BigNumber(result.reverse().toString());
    }
    public BigNumber multiply(BigNumber other) {
        String num1 = this.value;
        String num2 = other.value;
        int len1 = num1.length(), len2 = num2.length();
        int[] product = new int[len1 + len2];

        for (int i = len1 - 1; i >= 0; i--) {
            for (int j = len2 - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) + '0') * (num2.charAt(j) - '0');
                int sum = mul + product[i + j + 1];
                product[i + j + 1] = sum % 10;
                product[i + j] += sum / 10;
            }
        }
        StringBuilder result = new StringBuilder();
        for (int num : product) {
            if (!(result.length() == 0 && num == 0)){
                result.append(num);
            }
        }
        return new BigNumber(result.length() == 0 ? "0" : result.toString());
    }
}

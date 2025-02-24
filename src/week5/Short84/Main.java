package week5.Short84;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        BigNumber num1 = new BigNumber(scanner.next());

        System.out.print("Enter second number: ");
        BigNumber num2 = new BigNumber(scanner.next());

        BigNumber sum = num1.add(num2);
        BigNumber product = num1.multiply(num2);

        System.out.println("Addition Result: " + sum.getValue());
        System.out.println("Multiplication Result: " + product.getValue());
    }
}

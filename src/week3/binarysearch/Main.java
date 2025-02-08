package week3.binarysearch;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Function function = new Function(10);
        function.showValue();
        System.out.println("Enter value you want to find: ");
        int target = input.nextInt();

        System.out.println("Found at "+ function.search(target) + " position");
    }
}

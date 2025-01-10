/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1.linearsearch;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author knigh
 */
public class Function {
    private LinearSearch linearSearch = new LinearSearch();
    private Scanner input = new Scanner(System.in);

    public void generateArr() {
        Random rand = new Random();

        System.out.print("Enter the number of elements in the array: ");
        int nArr = input.nextInt();
        linearSearch.setNumberOfArray(nArr);

        int[] arr = new int[nArr];
        for (int i = 0; i < nArr; i++) {
            arr[i] = rand.nextInt(100);
        }
        System.out.println("Generated Array: " + Arrays.toString(arr));
        linearSearch.setArray(arr);
    }

    public void lSearch() {
        System.out.print("Enter the value to search for: ");
        int value = input.nextInt();
        linearSearch.setSearchValue(value);

        int[] arr = linearSearch.getArray();
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                linearSearch.setIdx(i);
                found = true;
                break;
            }
        }
        if (!found) {
            linearSearch.setIdx(-1);
        }
    }

    public LinearSearch getLinearSearch() {
        return linearSearch;
    }
}

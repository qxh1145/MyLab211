package week3.binarysearch;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Function {
    private int[] arr;
    Scanner input = new Scanner(System.in);

    public Function(int n) {
        this.arr = new int[n];
        addValues();
        sort();
    }

    public void addValues() {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element "+ i + ": ");
            this.arr[i] = input.nextInt();
        }
    }

    public void showValue() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public void sort(){
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > i ; j--) {
                if (arr[j] < arr[j - 1]){
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

    public int search(int target) {
        sort();

        int low = 0;
        int high = arr.length - 1;

        //
        while (low <= high){
            int mid = (high - low) / 2;
            if (arr[mid] == target){
                return mid;
            }else if (arr[mid] < target){
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        return -1;
    }
}

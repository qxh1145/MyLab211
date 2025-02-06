package week3.bubblesort;

import java.util.Random;

public class Function {
    private int[] arr;

    public Function(int n) {
        this.arr = new int[n];
        addValues();
    }

    public void addValues(){
        for (int i = 0 ; i < arr.length ; i++){
            Random rand = new Random();
            this.arr[i] = rand.nextInt(1000) + 1;
        }
    }
    public void showValue(){
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
    public void sort(){
        int temp;
        System.out.println("\nMang ban dau: ");
        showValue();
        for (int i = -1 ; ++i < arr.length-1;){
            for (int j = arr.length-1 ; j >= 1 ; j--){
                if (arr[j] < arr[j - 1]){
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        System.out.println("\nMang sau khi sap xep: ");
        showValue();
    }
}

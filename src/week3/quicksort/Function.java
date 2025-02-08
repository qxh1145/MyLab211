package week3.quicksort;

import java.util.Random;

public class Function {
    private int[] arr;

    public Function(int n) {
        this.arr = new int[n];
        addValues();
    }

    public void addValues() {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            this.arr[i] = rand.nextInt(10) + 1;
        }
    }

    public void showValue() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void sort() {
        System.out.println("Array before sort: ");
        showValue();
        quicksort(0, arr.length - 1);
        System.out.println("Array after sort: ");
        showValue();
    }
    private void quicksort(int start, int end){
        if (end <= start){
            return;
        }
        int pivot = partition(start, end);
        quicksort(start, pivot - 1);
        quicksort(pivot + 1, end);
    }
    private int partition(int start, int end){
        int pivot = arr[end];
        int i = start - 1;

        for (int j = start; j <= end - 1 ; j++) {
            if (arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[end];
        arr[end] = temp;
        return i;
    }
}

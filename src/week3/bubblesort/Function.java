package week3.bubblesort;

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
        int temp;
        System.out.println("Mảng ban đầu: ");
        showValue();

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }

        System.out.println("Mảng sau khi sắp xếp: ");
        showValue();
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1.linearsearch;

import java.util.Arrays;

/**
 *
 * @author knigh
 */
public class LinearSearch {
    private int numberOfArray;
    private int searchValue;
    private int idx = -1;
    private int[] array;

    public LinearSearch() {
    }

    public LinearSearch(int numberOfArray, int searchValue, int[] array) {
        this.numberOfArray = numberOfArray;
        this.searchValue = searchValue;
        this.array = array;
    }

    public int getNumberOfArray() {
        return numberOfArray;
    }

    public void setNumberOfArray(int numberOfArray) {
        this.numberOfArray = numberOfArray;
    }

    public int getSearchValue() {
        return searchValue;
    }

    public void setSearchValue(int searchValue) {
        this.searchValue = searchValue;
    }

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "The array: " + Arrays.toString(getArray()) + "\n" +
               "Found value " + searchValue + " at index: " + (idx == -1 ? "Not Found" : idx);
    }
}

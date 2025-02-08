package week3.stacks;

import week3.binarysearch.Function;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push("Something");
        myStack.push("Someone");
        myStack.get(1);
        myStack.pop();
    }
}

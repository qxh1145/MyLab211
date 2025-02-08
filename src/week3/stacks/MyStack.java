package week3.stacks;

import java.util.Stack;

public class MyStack {
    Stack<String> stack = new Stack<>();

    public void push(String stackValue){
        stack.push(stackValue);
    }

    public void pop(){
        if (!stack.isEmpty()) {
            stack.pop();
        } else {
            System.out.println("Stack is empty");
        }
    }

    public void get(int index){
        if (index >= 0 && index < stack.size()) {
            System.out.println("Element at index " + index + ": " + stack.get(index));
        } else {
            System.out.println("Index out of bounds.");
        }
    }
}

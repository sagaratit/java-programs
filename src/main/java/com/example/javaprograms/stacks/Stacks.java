package com.example.javaprograms.stacks;

import java.util.Stack;

/*
 * swap stack element from the last to first
 * */
public class Stacks {
    public static void main(String[] args) {
        Stack stack = new Stack<String>();
        Stack newStack = new Stack();
        stack.push("sagar");
        stack.push("sg");
        stack.push("atit");
        System.out.println("stack elements => " + stack);
        int stackSize = stack.size();
        System.out.println("stack size => " + stack.size());
        System.out.println(newStack);
        //move last element of satck to new first element..
        for (int i = 0; i < stackSize; i++) {
            newStack.push(stack.pop());
        }
        //iterate new stack ro see order
        for (Object elm : newStack) {
            System.out.println(elm);
        }
    }
}

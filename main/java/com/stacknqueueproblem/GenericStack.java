package com.stacknqueueproblem;

public class GenericStack {
    private final GenericLinkedList genericLinkedList;

    public GenericStack() {
        genericLinkedList = new GenericLinkedList();
    }

    public void push(GenericNode newNode) {
        genericLinkedList.add(newNode);
    }

    public void printStack() {
        genericLinkedList.printList();
    }

    public GenericNode peek() {
        return genericLinkedList.getHead();
    }

    public GenericNode pop() {
        return genericLinkedList.pop();
    }
}

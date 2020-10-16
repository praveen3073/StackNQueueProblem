package com.stacknqueueproblem;

public class GenericQueue {
    private final GenericLinkedList genericLinkedList;

    public GenericQueue() {
        genericLinkedList = new GenericLinkedList();
    }

    public void enqueue(GenericNode newNode) {
        genericLinkedList.append(newNode);
    }

    public void printStack() {
        genericLinkedList.printList();
    }

    public GenericNode front() {
        return genericLinkedList.getHead();
    }
}

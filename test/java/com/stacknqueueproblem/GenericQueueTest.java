package com.stacknqueueproblem;

import org.junit.Assert;
import org.junit.Test;

public class GenericQueueTest {
    @Test
    public void given3Numbers_WhenAddedToQueue_ShouldHaveFirstAddedAtTheTop() {
        GenericQueue genericQueue = new GenericQueue();
        GenericNode<Integer> firstNode = new GenericNode<>(56);
        GenericNode<Integer> secondNode = new GenericNode<>(30);
        GenericNode<Integer> thirdNode = new GenericNode<>(70);
        genericQueue.enqueue(firstNode);
        genericQueue.enqueue(secondNode);
        genericQueue.enqueue(thirdNode);
        genericQueue.printStack();
        GenericNode result = genericQueue.front();
        Assert.assertEquals(firstNode, result);
    }

    @Test
    public void givenQueue_WhenDequeued_ShouldReturnFrontNode() {
        GenericQueue genericQueue = new GenericQueue();
        GenericNode<Integer> firstNode = new GenericNode<>(56);
        GenericNode<Integer> secondNode = new GenericNode<>(30);
        GenericNode<Integer> thirdNode = new GenericNode<>(70);
        genericQueue.enqueue(firstNode);
        genericQueue.enqueue(secondNode);
        genericQueue.enqueue(thirdNode);
        genericQueue.printStack();
        GenericNode result = genericQueue.dequeue();
        Assert.assertEquals(firstNode, result);
        genericQueue.printStack();
    }
}

package com.stacknqueueproblem;

import org.junit.Assert;
import org.junit.Test;

public class GenericStackTest {
    @Test
    public void given3Numbers_WhenAddedToStack_ShouldHaveLastAddedAtTheTop() {
        GenericStack genericStack = new GenericStack();
        GenericNode<Integer> firstNode = new GenericNode<>(56);
        GenericNode<Integer> secondNode = new GenericNode<>(30);
        GenericNode<Integer> thirdNode = new GenericNode<>(70);
        genericStack.push(firstNode);
        genericStack.push(secondNode);
        genericStack.push(thirdNode);
        genericStack.printStack();
        GenericNode result = genericStack.peek();
        Assert.assertEquals(thirdNode, result);
    }

    @Test
    public void givenStack_WhenPopped_ShouldMatchLastAddedNumber() {
        GenericStack genericStack = new GenericStack();
        GenericNode<Integer> firstNode = new GenericNode<>(56);
        GenericNode<Integer> secondNode = new GenericNode<>(30);
        GenericNode<Integer> thirdNode = new GenericNode<>(70);
        genericStack.push(firstNode);
        genericStack.push(secondNode);
        genericStack.push(thirdNode);
        genericStack.printStack();
        GenericNode result = genericStack.pop();
        Assert.assertEquals(thirdNode, result);
        genericStack.printStack();
    }
}

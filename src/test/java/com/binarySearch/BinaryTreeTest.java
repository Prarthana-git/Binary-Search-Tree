package com.binarySearch;

import org.junit.Assert;
import org.junit.Test;

public class BinaryTreeTest {
	/**
     * this test method will check the add method and size method.
     */
    @Test
    public void Elements_Added_Returns_Size3() {
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        binaryTree.add(56);
        binaryTree.add(30);
        binaryTree.add(70);
        Assert.assertEquals(3, binaryTree.size());
    }
}

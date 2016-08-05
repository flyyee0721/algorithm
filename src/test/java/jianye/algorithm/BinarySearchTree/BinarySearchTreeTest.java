
package jianye.algorithm.BinarySearchTree;

import java.util.*;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class BinarySearchTreeTest {

    private BinarySearchTree<Integer, String> binarySearchTree;

    @BeforeClass
    public void setUpBeforeClass() throws Exception {
        binarySearchTree = new BinarySearchTree<>();
    }

    @AfterClass
    public static void cleanUpAfterClass() throws Exception {

    }

    @BeforeMethod
    public void setUpBeforeMethod() throws Exception {

    }

    @AfterMethod
    public void cleanUpAfterMethod() throws Exception {

    }

    @Test
    public void testTrue() throws Exception {
        Assert.assertTrue(true);
    }

    @Test
    public void testRun() throws Exception {
        System.out.println(binarySearchTree.size());
        binarySearchTree.put(12, "Test");
        String ret = binarySearchTree.get(12);
        if (ret != null) {
            System.out.println("12 is found with value " + ret);
        }
        ret = binarySearchTree.get(13);
        if (ret == null) {
            System.out.println("13 is not found");
        }
        System.out.println(binarySearchTree.size());
        binarySearchTree.put(15, "Test");
        System.out.println(binarySearchTree.size());
    }

}


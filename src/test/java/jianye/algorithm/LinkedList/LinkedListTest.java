
package jianye.algorithm.LinkedList;

import java.util.*;
import org.testng.Assert;
import org.testng.annotations.*;

public class LinkedListTest {

    private LinkedList<Integer> linkedList;

    @BeforeClass
    public void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void cleanUpAfterClass() throws Exception {

    }

    @BeforeMethod
    public void setUpBeforeMethod() throws Exception {
        linkedList = new LinkedList<>();

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
        linkedList.insert(12);
        linkedList.insert(22);
        linkedList.insert(35);
        System.out.println(linkedList.toString());
        if (linkedList.find(22)) {
            System.out.println("22 is found!");
        }
        if (!linkedList.find(23)) {
            System.out.println("23 is not found!");
        }
        if (linkedList.remove(12)) {
            System.out.println("remove 12 successfully");
            System.out.println(linkedList.toString() + " is after removal!");
        }
        linkedList.insert(25);
        System.out.println(linkedList.toString() + " is after insert 25!");
        if (linkedList.remove(25)) {
            System.out.println("remove 25 successfully");
            System.out.println(linkedList.toString() + " is after removal!");
        }
        linkedList.insert(37);
        linkedList.insert(39);
        System.out.println(linkedList.toString() + " is after insert 37 and 39!");
        if (linkedList.remove(35)) {
            System.out.println("remove 35 successfully");
            System.out.println(linkedList.toString() + " is after removal!");
        }
        if (!linkedList.remove(71)) {
            System.out.println("Fail to remove 71 successfully");
            System.out.println(linkedList.toString() + " is after removal!");
        }
    }

    @Test
    public void testRunDummy() throws Exception {
        linkedList.insert(12);
        linkedList.insert(22);
        linkedList.insert(35);
        System.out.println(linkedList.toString());
        if (linkedList.find(22)) {
            System.out.println("22 is found!");
        }
        if (!linkedList.find(23)) {
            System.out.println("23 is not found!");
        }
        if (linkedList.removeDummy(12)) {
            System.out.println("remove 12 successfully");
            System.out.println(linkedList.toString() + " is after removal!");
        }
        linkedList.insert(25);
        System.out.println(linkedList.toString() + " is after insert 25!");
        if (linkedList.removeDummy(25)) {
            System.out.println("remove 25 successfully");
            System.out.println(linkedList.toString() + " is after removal!");
        }
        linkedList.insert(37);
        linkedList.insert(39);
        System.out.println(linkedList.toString() + " is after insert 37 and 39!");
        if (linkedList.removeDummy(35)) {
            System.out.println("remove 35 successfully");
            System.out.println(linkedList.toString() + " is after removal!");
        }
        if (!linkedList.removeDummy(71)) {
            System.out.println("Fail to remove 71 successfully");
            System.out.println(linkedList.toString() + " is after removal!");
        }
    }

    @Test
    public void testReverse() throws Exception {
        linkedList.insert(12);
        linkedList.insert(33);
        linkedList.insert(331);
        linkedList.insert(303);
        linkedList.insert(133);
        System.out.println("Before reverse: " + linkedList.toString());
        System.out.println("Before reverse, reverse print is : " + linkedList.reverseToString());
        System.out.println("Before reverse, reverse print is : " + linkedList.reverseToStringStack());
        linkedList.reverse();
        System.out.println("After reverse: " + linkedList.toString());
        System.out.println("After reverse, reverse print is : " + linkedList.reverseToString());
        System.out.println("After reverse, reverse print is : " + linkedList.reverseToStringStack());
        linkedList.remove(12);
        linkedList.remove(121);
        linkedList.remove(33);
        linkedList.remove(331);
        System.out.println("After remove: " + linkedList.toString());
        System.out.println("Before reverse, reverse print is : " + linkedList.reverseToString());
        System.out.println("Before reverse, reverse print is : " + linkedList.reverseToStringStack());
        linkedList.reverse();
        System.out.println("After reverse: " + linkedList.toString());
        linkedList.remove(133);
        System.out.println("Before reverse, reverse print is : " + linkedList.reverseToString());
        System.out.println("Before reverse, reverse print is : " + linkedList.reverseToStringStack());
        linkedList.reverse();
        System.out.println("After reverse: " + linkedList.toString());
        linkedList.remove(303);
        System.out.println("After remove: " + linkedList.toString());
        System.out.println("Before reverse, reverse print is : " + linkedList.reverseToString());
        System.out.println("Before reverse, reverse print is : " + linkedList.reverseToStringStack());
        linkedList.reverse();
        System.out.println("After reverse: " + linkedList.toString());
    }

    @Test
    public void testFindKthFromTail() throws Exception {
        linkedList.insert(12);
        linkedList.insert(33);
        linkedList.insert(331);
        linkedList.insert(303);
        linkedList.insert(133);
        System.out.println("The linkelist contains " + linkedList.toString());
        System.out.println("1st from the tail is " + linkedList.findKthFromTail(1));
        System.out.println("2nd from the tail is " + linkedList.findKthFromTail(2));
        System.out.println("3rd from the tail is " + linkedList.findKthFromTail(3));
        System.out.println("4th from the tail is " + linkedList.findKthFromTail(4));
        System.out.println("5th from the tail is " + linkedList.findKthFromTail(5));
        if (linkedList.findKthFromTail(6) == null) {
            System.out.println("6th element doesnt exist!");
        }
    }

    @Test (expectedExceptions = IllegalArgumentException.class)
    public void testFindKthFromTailInvalidInput() throws Exception {
        if (null == linkedList.findKthFromTail(3)) {
            System.out.println("3rd element does not exist!");
        }
        linkedList.insert(12);
        linkedList.insert(33);
        linkedList.insert(331);
        linkedList.insert(303);
        linkedList.insert(133);
        linkedList.findKthFromTail(-2);
    }

    @Test
    public void testFindKthFromTailEmptyInput() throws Exception {
        if (null == linkedList.findKthFromTail(3)) {
            System.out.println("3rd element does not exist!");
        }
    }
    @Test
    public void testFindKthFromTailTwoPointer() throws Exception {
        linkedList.insert(12);
        linkedList.insert(33);
        linkedList.insert(331);
        linkedList.insert(303);
        linkedList.insert(133);
        System.out.println("The linkelist contains " + linkedList.toString());
        System.out.println("1st from the tail is " + linkedList.findKthFromTailTwoPointer(1));
        System.out.println("2nd from the tail is " + linkedList.findKthFromTailTwoPointer(2));
        System.out.println("3rd from the tail is " + linkedList.findKthFromTailTwoPointer(3));
        System.out.println("4th from the tail is " + linkedList.findKthFromTailTwoPointer(4));
        System.out.println("5th from the tail is " + linkedList.findKthFromTailTwoPointer(5));
        if (linkedList.findKthFromTailTwoPointer(6) == null) {
            System.out.println("6th element doesnt exist!");
        }
    }
}


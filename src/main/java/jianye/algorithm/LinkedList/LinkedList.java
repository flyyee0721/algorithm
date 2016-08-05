
/*
analysis：
    key words:

    requirements:

    clarification:

    corner cases:


solution:
    start with example:

    regular method:

    improved method:

    time and space complexity:

    test with examples:

    follow up:

    knowledge learned:

*/


package jianye.algorithm.LinkedList;


import java.util.*;

public class LinkedList<Value> {
    private class ListNode {
        Value value;
        ListNode next;
        public ListNode(Value value) {
            this.value = value;
            next = null;
        }
    }

    private ListNode head;

    //ERROR: public LinkedList<Value>() {
    public LinkedList() {
        head = null;
        //always update the head, no need to maintain a tail pointer.
    }

    /**
     * Append a value to the head of the list.
     * @param v Input value.
     */
    public void insert(Value v) {
        ListNode newNode = new ListNode(v);
        newNode.next = head;
        //Always update the head.
        head = newNode;
    }

    /**
     * Search if a given value v is in the list.
     * @param v Input value.
     * @return True if the value exists, else false.
     */
    public boolean find(Value v) {
        ListNode runner = head;
        while(runner != null) {
            //ERROR: if (runner.value.equalTo(v)) {
            if (runner.value.equals(v)) {
                return true;
            }
            //ERROR:runner = runner.next();
            runner = runner.next;
        }
        return false;
    }

    /**
     * Remove a value from the list if it exists.
     * @param v Input value
     * @return True if the value exists and is removed, else false.
     */
    public boolean remove(Value v) {
        //If the linkedlist is null
        if (head == null) {
            return false;
        }
        //If head is to be removed, need to update head position.
        if (head.value.equals(v)) {
            head = head.next;
            return true;
        }
        ListNode runner = head;
        while(runner.next!= null) {
            if (runner.next.value.equals(v)) {
                runner.next = runner.next.next;
                return true;
            }
            runner = runner.next;
        }
        return false;
    }

    /**
     * Remove a value from the linkedlist.
     * @param v Input value.
     * @return True if it exists, else false.
     */
    public boolean removeDummy(Value v) {
        ListNode dummy = new ListNode(v);
        dummy.next = head;
        ListNode runner = dummy;
        while(runner.next != null) {
            if (runner.next.value.equals(v)) {
                runner.next = runner.next.next;
                //Have head point to the new head node.
                head = dummy.next;
                return true;
            }
            runner = runner.next;
        }
        head = dummy.next;
        return false;
    }

    /**
     * Reverse the nodes of a LinkedList.
     */
    public void reverse() {
        //If no nodes, or one node, no need to revert.
        if (head == null || head.next == null) {
            return;
        }
        ListNode newHead = null;
        while(head != null) {
            ListNode current = head.next;
            head.next = newHead;
            newHead = head;
            head = current;
        }
        head = newHead;
    }


    /**
     * Traverse the linkedlist to get the number of elements.
     * @return Size of the LinkedList
     */
    public int size() {
        int ret = 0;
        ListNode runner = head;
        while(runner != null) {
            ret++;
            runner = runner.next;
        }
        return ret;
    }

    /**
     * Find the kth element from the tail of the linkedlist.
     * @param k Input.
     * @return The kth element from the tail, null if k is larger than the linkedlist size.
     */
    public Value findKthFromTail(int k) {
        if (k <= 0) throw new IllegalArgumentException("Input needs to be positive.");
        int size = this.size();
        if (k > size) {
            return null;
        }
        int m = size - k + 1;
        ListNode runner = head;
        while(--m > 0) {
            runner = runner.next;
        }
        return runner.value;
        //Kth from tail is size - k + 1 from head.
    }

    /**
     * Find the kth element from the tail of the linkedlist, use double pointer method.
     * @param k Input.
     * @return The kth element from the tail, null if k is larger than the linkedlist size.
     */
    public Value findKthFromTailTwoPointer(int k) {
        if (k <= 0) {
            throw new IllegalArgumentException("Input needs to be positive.");
        }
        return null;

    }

    @Override
    public String toString() {
        ListNode runner = head;
        String out = "";
        while(runner != null) {
            out += runner.value.toString() + " ";
            runner = runner.next;
        }
        return out;
    }
}


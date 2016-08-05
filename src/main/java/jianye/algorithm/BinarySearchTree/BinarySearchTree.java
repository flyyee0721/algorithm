
/*
analysis：
    key words:
        In binary search tree, the key needs to be comparable, either primitive type or extends from Comparable
        Instead of implementing a simple binary search tree, use template here to be more generic.
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


package jianye.algorithm.BinarySearchTree;


import java.util.*;

//Template
public class BinarySearchTree<Key extends Comparable<Key>, Value> {

    private Node root = null;

    private class Node {
        private Key key;
        private Value value;
        private Node left;
        private Node right;
        private int size;
        public Node(Key key, Value value) {
            this.key = key;
            this.value = value;
            left = null;
            right = null;
            size = 1;
        }
    }

    public int size() { return size(root); }

    private int size(Node root) {
        return (root == null) ? 0 : root.size;
    }

    /** No arguments constructor. */
    public BinarySearchTree() {
    }

    public BinarySearchTree(Key key, Value value) {
        root = new Node(key, value);
    }

    public void put(Key key, Value value) {
        root = put(root, key, value);
    }

    private Node put(Node root, Key key, Value value) {
        if (null == root) {
            return new Node(key, value);
        }
        int cmp = key.compareTo(root.key);
        if (cmp < 0) {
            root.left = put(root.left, key, value);
        } else if (cmp > 0) {
            root.right = put(root.right, key, value);
        } else {
            //update the value
            root.value = value;
        }
        root.size = size(root.left) + size(root.right) + 1;
        return root;
    }

    public Value get(Key key) {
        return get(root, key);
    }

    private Value get(Node root, Key key) {
        if (null == root) {
            return null;
        }
        int cmp = key.compareTo(root.key);
        if (cmp == 0) {
            return root.value;
        } else if (cmp < 0) {
            return get(root.left, key);
        } else {
            return get(root.right, key);
        }
    }

    public void delete(int value) {
        //root = delete(root, value);
    }

    private Node delete(Node root, int value) {
        return root;
    }

}


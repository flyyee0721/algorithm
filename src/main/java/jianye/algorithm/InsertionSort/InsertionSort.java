/*
Overview:

    name:
        Insertion sort.
    description:
        Sort an input array using insertion method.
        Insertion sort iterates through the list by consuming one input element at each repetition, and growing a sorted output list.
        On a repetition, insertion sort removes one element from the input data, finds the location it belongs within the sorted list,
        and inserts it there. It repeats until no input elements remain.
    key words:
        Sort, insertion method.

Solution:

    start with example:
        [3, 2, 9, 11, 6] =>
    regular method:
        For a given value at index i, insert it into the sub array before it. array[0...i-1]
        Need to make sure the subarray is always sorted, insert makes it work.
            To insert array[i], compare it with array[i - 1], if array[i] is smaller, swap it
            with array[i - 1], because array[i - 1] is the largest value in sub array[0 ... i - 1],
            we now move to i - 1 and compare it with i - 2... Until we reach the first element.
    improved method:
        SKIP
    time and space complexity:
        Time complexity is O(n^2), space complexity is O(1), in place.
    test with examples:
        SKIP
    follow up:
        SKIP
    knowledge learned:
        Stable sort.

   Pros and cons:
    Pros:
        1) It is very simple.
        2) It is very efficient for small data sets.
        3) It is stable; i.e., it does not change the relative order of elements with equal keys.
        4) In-place; i.e., only requires a constant amount O(1) of additional memory space.

    Cons:

*/

package jianye.algorithm.InsertionSort;


import java.util.*;

public class InsertionSort {

    /** No arguments constructor. */
    public InsertionSort() {

    }

    //TODO: KNOWLEDGE: How to define a template function.
    //TODO: KNOWLEDGE: How to extends from Comparable<T>
    public <T extends Comparable<T>> void sort (T[] array) {
        if (null == array || array.length <= 1) {
            return;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j].compareTo(array[j - 1]) < 0) {
                    T temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
    }

}


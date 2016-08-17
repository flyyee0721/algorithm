
package jianye.algorithm.InsertionSort;

import java.util.*;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class InsertionSortTest {

    private InsertionSort insertionSort;

    @BeforeClass
    public void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void cleanUpAfterClass() throws Exception {

    }

    @BeforeMethod
    public void setUpBeforeMethod() throws Exception {
        insertionSort = new InsertionSort();
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
        Integer[] array = {12, 31, 2, 11, 5, 6};
        insertionSort.sort(array);
        Assert.assertEquals(array[0].intValue(), 2);
        Assert.assertEquals(array[1].intValue(), 5);
        Assert.assertEquals(array[2].intValue(), 6);
        Assert.assertEquals(array[3].intValue(), 11);
        Assert.assertEquals(array[4].intValue(), 12);
        Assert.assertEquals(array[5].intValue(), 31);
    }

    @Test
    public void testEmpty() throws Exception {
        Integer[] array = null;
        insertionSort.sort(array);
        Assert.assertNull(array);
        array = new Integer[0];
        insertionSort.sort(array);
        Assert.assertEquals(array.length, 0);
        array = new Integer[1];
        array[0] = 2;
        insertionSort.sort(array);
        Assert.assertEquals(array.length, 1);
        Assert.assertEquals(array[0].intValue(), 2);

    }


}


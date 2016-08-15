
package jianye.algorithm.DepthFirstSearch;

import java.util.*;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import jianye.algorithm.DepthFirstSearch.DepthFirstSearch.UndirectedGraphNode;

public class DepthFirstSearchTest {

    private DepthFirstSearch depthFirstSearch;

    @BeforeClass
    public void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void cleanUpAfterClass() throws Exception {

    }

    @BeforeMethod
    public void setUpBeforeMethod() throws Exception {
        depthFirstSearch = new DepthFirstSearch();
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
        UndirectedGraphNode first = new UndirectedGraphNode(1);
        UndirectedGraphNode second = new UndirectedGraphNode(2);
        UndirectedGraphNode third = new UndirectedGraphNode(3);
        UndirectedGraphNode fourth = new UndirectedGraphNode(4);
        UndirectedGraphNode fifth = new UndirectedGraphNode(5);
        UndirectedGraphNode sixth = new UndirectedGraphNode(6);
        UndirectedGraphNode seventh = new UndirectedGraphNode(7);
        first.neighbors.add(second);
        first.neighbors.add(third);
        second.neighbors.add(third);
        second.neighbors.add(fifth);
        third.neighbors.add(fourth);
        fourth.neighbors.add(fifth);
        fourth.neighbors.add(sixth);
        sixth.neighbors.add(first);
        sixth.neighbors.add(seventh);
        seventh.neighbors.add(sixth);
        depthFirstSearch.dfsStack(first);
        depthFirstSearch.dfs(first);

    }

}


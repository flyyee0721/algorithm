
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


package jianye.algorithm.DepthFirstSearch;


import java.util.*;

public class DepthFirstSearch {
    public static class UndirectedGraphNode {
        public int label;
        public ArrayList<UndirectedGraphNode> neighbors;
            public UndirectedGraphNode(int label) {
                this.label = label;
                neighbors = new ArrayList<UndirectedGraphNode>();
            }
        }
    /** No arguments constructor. */
    public void dfs(UndirectedGraphNode node) {
        if (null == node) {
            return;
        }
        Set<UndirectedGraphNode> visited = new HashSet<>();
        dfsHelper(node, visited);
    }

    private void dfsHelper(UndirectedGraphNode node, Set<UndirectedGraphNode> visited) {
        visit(node);
        visited.add(node);
        for (UndirectedGraphNode neighbor : node.neighbors) {
            if (!visited.contains(neighbor)) {
                dfsHelper(neighbor, visited);
            } else {
                System.out.println("The node " + node.label + " has been visited!");
            }
        }

    }
    public void dfsStack(UndirectedGraphNode node) {
        Stack<UndirectedGraphNode> stack = new Stack<>();
        Set<UndirectedGraphNode> visited = new HashSet<>();
        visit(node);
        stack.add(node);
        visited.add(node);
        while(!stack.isEmpty()) {
            UndirectedGraphNode poped = stack.pop();
            for (UndirectedGraphNode neighbor : poped.neighbors) {
                //make sure the first time we see the node, it is visited and markted as visited.
                if (!visited.contains(neighbor))  {
                    visit(neighbor);
                    visited.add(neighbor);
                    stack.add(neighbor);
                } else {
                    System.out.println("The node " + neighbor.label + " has been visited.");
                }
            }
        }
    }

    private void visit(UndirectedGraphNode node) {
        System.out.println("Visit node " + node.label);
    }

}


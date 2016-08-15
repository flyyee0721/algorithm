
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


package jianye.algorithm.BreadFirstSearch;


import java.util.*;

public class BreadFirstSearch {
    public static class UndirectedGraphNode {
        public int label;
        public ArrayList<UndirectedGraphNode> neighbors;
        public UndirectedGraphNode(int label) {
            this.label = label;
            neighbors = new ArrayList<UndirectedGraphNode>();
        }
    }
    /** No arguments constructor. */
    public void bfs(UndirectedGraphNode node) {
        Queue<UndirectedGraphNode> queue = new LinkedList<>();
        queue.add(node);
        visit(node);
        Set<UndirectedGraphNode> visited = new HashSet<>();
        visited.add(node);
        while (!queue.isEmpty()) {
            UndirectedGraphNode poped = queue.poll();
            for (UndirectedGraphNode neighbor : poped.neighbors) {
                if (!visited.contains(neighbor)) {
                    visit(neighbor);
                    visited.add(neighbor);
                    queue.add(neighbor);
                } else {
                    System.out.println("node " + poped.label + " has been visited!");
                }
            }
        }
    }

    private void visit(UndirectedGraphNode node) {
        System.out.println("Visiting node " + node.label);
        System.out.println("Visiting node " + node.label + " done");
    }

}


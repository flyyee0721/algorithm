
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
        The time complexity can be expressed as {\displaystyle O(|V|+|E|)} O(|V|+|E|),[5] since every vertex and every edge
        will be explored in the worst case. {\displaystyle |V|} |V| is the number of vertices and {\displaystyle |E|} |E|
        is the number of edges in the graph. Note that {\displaystyle O(|E|)} O(|E|) may vary between {\displaystyle O(1)}
        O(1) and {\displaystyle O(|V|^{2})} O(|V|^{2}), depending on how sparse the input graph is.

        When the number of vertices in the graph is known ahead of time, and additional data structures are used to determine
        which vertices have already been added to the queue, the space complexity can be expressed as {\displaystyle O(|V|)} O(|V|),
        where {\displaystyle |V|} |V| is the cardinality of the set of vertices (as said before). If the graph is represented by an
        adjacency list it occupies {\displaystyle \Theta (|V|+|E|)} \Theta (|V|+|E|)[6] space in memory, while an adjacency matrix
        representation occupies {\displaystyle \Theta (|V|^{2})} \Theta (|V|^{2}).[7]
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
            //TODO: Remind, the dequeued node has already been visited before enqueueing
            UndirectedGraphNode poped = queue.poll();
            for (UndirectedGraphNode neighbor : poped.neighbors) {
                //TODO: REMIND, because it is a graph, check if the neighbor node has been visited, to avoid pushing duplicated nodes back to the queue.
                if (!visited.contains(neighbor)) {
                    visit(neighbor);
                    visited.add(neighbor);
                    //TODO: REMIND, The node pushed into the queue must have been visited
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


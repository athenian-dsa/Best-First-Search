import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyTests {
    @Test
    public void BFSTest() {
        BestFirstSearchGraph g1 = new BestFirstSearchGraph();
        g1.addVertex("A", 0, 0);
        g1.addVertex("B", 1, 0);
        g1.addVertex("C", 2, 0);
        g1.addVertex("D", 5, 0);
        g1.addVertex("E", 0, 1);
        g1.addVertex("F", 2, 1);
        g1.addVertex("G", 2, 2);
        g1.addVertex("H", 4, 2);
        g1.addVertex("I", 5, 2);
        g1.addVertex("J", 2, 5);
        g1.addVertex("K", 4, 5);
        g1.addVertex("L", 5, 5);
        g1.addVertex("M", 0, 6);
        g1.addVertex("N", 2, 6);
        g1.addVertex("O", 3, 6);
        g1.addVertex("P", 4, 6);
        g1.addVertex("Q", 5, 6);

        g1.addEdge("A", "B", 1);
        g1.addEdge("A", "E", 1);
        g1.addEdge("A", "F", 4);
        g1.addEdge("B", "C", 1);
        g1.addEdge("C", "D", 3);
        g1.addEdge("C", "F", 1);
        g1.addEdge("D", "I", 2);
        g1.addEdge("E", "M", 5);
        g1.addEdge("F", "G", 2);
        g1.addEdge("G", "H", 3);
        g1.addEdge("G", "J", 4);
        g1.addEdge("G", "K", 6);
        g1.addEdge("H", "I", 2);
        g1.addEdge("H", "K", 3);
        g1.addEdge("I", "L", 3);
        g1.addEdge("J", "K", 3);
        g1.addEdge("J", "N", 1);
        g1.addEdge("J", "O", 3);
        g1.addEdge("L", "P", 2);
        g1.addEdge("L", "Q", 1);
        g1.addEdge("M", "N", 2);
        g1.addEdge("N", "O", 1);
        g1.addEdge("O", "P", 1);

        assertEquals(17, g1.bestFirstSearch("A", "Q"));
        assertEquals(14, g1.bestFirstSearch("A", "P"));
        assertEquals(16, g1.bestFirstSearch("A", "L"));
    }
}
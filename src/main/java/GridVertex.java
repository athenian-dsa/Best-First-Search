import java.util.LinkedList;

public class GridVertex {
    String label;
    LinkedList<WeightedEdge> edges;
    int x;
    int y;

    public GridVertex(String label, int x, int y) {
        this.label = label;
        this.edges = new LinkedList<>();
        this.x = x;
        this.y = y;
    }
}
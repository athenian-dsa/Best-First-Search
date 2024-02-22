public class PQNode implements Comparable<PQNode> {
    String label;
    int weight;

    public PQNode(String label, int weight){
        this.label = label;
        this.weight = weight;
    }

    @Override
    public int compareTo(PQNode o) {
        return this.weight - o.weight;
    }
}
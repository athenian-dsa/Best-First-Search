public class WeightedEdge implements Comparable<WeightedEdge> {
    GridVertex source;
    GridVertex destination;
    int weight;

    public WeightedEdge(GridVertex source, GridVertex destination, int weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }

    public boolean equals(Object other) {
        if (other instanceof WeightedEdge) {
            WeightedEdge otherEdge = (WeightedEdge) other;
            return this.source.equals(otherEdge.source) && this.destination.equals(otherEdge.destination) ||
                    this.source.equals(otherEdge.destination) && this.destination.equals(otherEdge.source);
        }
        return false;
    }

    @Override
    public String toString() {
        return source.label + "->" + destination.label;
    }

    @Override
    public int compareTo(WeightedEdge o) {
        return this.weight - o.weight;
    }
}
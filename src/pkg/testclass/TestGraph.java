package pkg.testclass;
import  pkg.nonlineasds.Graph;

public class TestGraph {
    public static void main(String[] args) {
        Graph G = new Graph(5);
        // G.makeAdjMatrix();
        // G.showAdjMatrix();
        G.makeAdjList();
        G.showAdjList();
    }
}

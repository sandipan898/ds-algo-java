package pkg.nonlineasds;
import java.util.Scanner;
import java.util.ArrayList;

public class Graph {
    protected int adjMatrix[][];
    int n = 0;
    public Graph(int node) {
        n = node;
    }

    public int[][] makeAdjMatrix() {
        adjMatrix = new int[n+1][n+1];
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of Edges: ");
        int e = scan.nextInt();
        for (int i=0; i<e; i++) {
            System.out.println("Enter the edge:");
            int u = scan.nextInt();
            int v = scan.nextInt();
            adjMatrix[u][v] = 1;
            adjMatrix[v][u] = 1;
        }
        return adjMatrix;
    }
    public void showAdjMatrix() {
        for(int i=0; i<=n; i++) {
//            System.out.print(i + " - ");
            for(int j=0; j<=n; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

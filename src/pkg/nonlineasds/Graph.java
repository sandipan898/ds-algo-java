package pkg.nonlineasds;
import java.util.Scanner;
import java.util.ArrayList;

public class Graph {
    protected int adjMatrix[][];
    protected ArrayList<ArrayList<Integer>> adjList;
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
        scan.close();
        return adjMatrix;
    }

    public void showAdjMatrix() {
        for(int i=0; i<=n; i++) {
            for(int j=0; j<=n; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void makeAdjList() {
        adjList = new ArrayList<ArrayList<Integer>>();
        Scanner scan = new Scanner(System.in);

        for (int i=0; i<=n; i++) {
            adjList.add(new ArrayList<Integer>());
        }
        System.out.print("Enter number of Edges: ");
        int e = scan.nextInt();
        for (int i=0; i<e; i++) {
            System.out.println("Enter the edge:");
            int u = scan.nextInt();
            int v = scan.nextInt();
            
            if (!adjList.get(u).contains(v) && !adjList.get(v).contains(u)) {
                adjList.get(u).add(v);  
                adjList.get(v).add(u);
            } else {
                System.out.println("Connection between " + u + " to " + v + " already exists!");
                i--;
            }
        }
        scan.close();
    }
    
    public void showAdjList() {
        for (int i=0; i<adjList.size(); i++) {
            System.out.print("V " + i + ": ");
            for (int j=0; j<adjList.get(i).size(); j++) {
                System.out.print("--> " + adjList.get(i).get(j));
            }
            System.out.println();
        }
    }
}

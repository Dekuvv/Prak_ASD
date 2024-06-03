package Jobsheet12;

public class GraphMain {
    public static void main(String[] args) {
        Graph g = new Graph(8);

        g.addEdge(0, 1, 2);
        g.addEdge(1, 2, 3);
        g.addEdge(2, 3, 1);
        g.addEdge(3, 4, 2);
        g.addEdge(4, 5, 2);
        g.addEdge(5, 6, 4);
        g.addEdge(6, 7, 2);
        g.addEdge(7, 0, 5);

        boolean hasEdge = g.getEdge(1, 3);

        if (hasEdge) {
            System.out.println("Terdapat edge antara vertex 1 dan vertex 3");
        } else {
            System.out.println("Tidak terdapat edge antara vertex 1 dan vertex 3");
        }



        // g.addEdge(0, 1);
        // g.addEdge(0, 2);
        // g.addEdge(1, 2);
        // g.addEdge(2, 0);
        // g.addEdge(2, 3);
        // g.addEdge(6, 7);

        g.print();
        g.getDegree(); 
    }
}

package Jobsheet12;

public class City {
    private String[] vertices;
    private int[][] adjacencyMatrix;
    private int numVertices;

    // Constructor
    public City(int numVertices) {
        this.numVertices = numVertices;
        vertices = new String[numVertices];
        adjacencyMatrix = new int[numVertices][numVertices];
    }

    // menambah vertex
    public void addVertex(int index, String name) {
        vertices[index] = name;
    }

    // menambahkan edge
    public void addEdge(int index1, int index2, int weight) {
        adjacencyMatrix[index1][index2] = weight;
        adjacencyMatrix[index2][index1] = weight;
    }

    // mendapatkan indeks vertex berdasarkan nama
    public int getVertexIndex(String name) {
        for (int i = 0; i < numVertices; i++) {
            if (vertices[i].equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1; // jika vertex tidak ada
    }

    // Print
    public void printGraph() {
        for (int i = 0; i < numVertices; i++) {
            System.out.println(vertices[i] + ":");
            for (int j = 0; j < numVertices; j++) {
                if (adjacencyMatrix[i][j] > 0) {
                    System.out.println("  - Jarak ke " + vertices[j] + ": " + adjacencyMatrix[i][j]);
                }
            }
        }
    }
}
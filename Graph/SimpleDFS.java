package Graph;

import java.util.*;

public class SimpleDFS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int n = sc.nextInt();

        int[][] graph = new int[n][n];  // adjacency matrix

        System.out.print("Enter number of edges: ");
        int e = sc.nextInt();

        System.out.println("Enter edges (u v):");
        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph[u][v] = 1;
            graph[v][u] = 1;  // undirected
        }

        System.out.print("Enter starting node for DFS: "); 
        int start = sc.nextInt();

        boolean[] visited = new boolean[n];
        Stack <Integer> stack = new Stack<>(); 

        visited[start] = true;
        stack.push(start); 

        System.out.print("DFS Traversal: "); 
        while (!stack.isEmpty()) { 
            int curr = stack.pop(); 
            System.out.print(curr + " ");

            for (int i = n-1; i >=0; i--) { 
                if (graph[curr][i] == 1 && !visited[i]) {
                    stack.push(i); 
                    visited[i] = true;
                }
            }
        } 

        sc.close();
    }
}


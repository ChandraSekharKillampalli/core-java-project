package core;

import java.util.*;

public class CityTravel {

    static class Edge {
        int to;
        int cost;
        Edge(int to, int cost) {
            this.to = to;
            this.cost = cost;
        }
    }

    public static void main(String[] args) {
        int[][] input = {{1,2},{1,3},{2,3},{3,4}};
        int[] cost = {2, 5, 7}; // last connection [3,4] has no cost entry
        int[] pow = {2}; // zero-based index where power is applied

        int n = 4; // number of cities
        Map<Integer, List<Edge>> graph = new HashMap<>();

        // Apply power by setting that edge's cost to 0
        Set<Integer> powerSet = new HashSet<>();
        for (int p : pow) powerSet.add(p);

        // Build graph with cost
        for (int i = 0; i < input.length; i++) {
            int from = input[i][0];
            int to = input[i][1];
            int edgeCost = (i < cost.length) ? cost[i] : 0; // if cost is missing, use 0
            if (powerSet.contains(i)) edgeCost = 0;

            graph.computeIfAbsent(from, x -> new ArrayList<>()).add(new Edge(to, edgeCost));
            graph.computeIfAbsent(to, x -> new ArrayList<>()).add(new Edge(from, edgeCost)); // undirected
        }

        // Dijkstra from node 1
        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[1] = 0;

        PriorityQueue<Edge> pq = new PriorityQueue<>(Comparator.comparingInt(e -> e.cost));
        pq.offer(new Edge(1, 0));

        while (!pq.isEmpty()) {
            Edge current = pq.poll();
            int u = current.to;
            int d = current.cost;

            if (d > dist[u]) continue;

            for (Edge neighbor : graph.getOrDefault(u, new ArrayList<>())) {
                int v = neighbor.to;
                int newCost = d + neighbor.cost;
                if (newCost < dist[v]) {
                    dist[v] = newCost;
                    pq.offer(new Edge(v, newCost));
                }
            }
        }

        // Print costs from city 1 to others
        for (int i = 2; i <= n; i++) {
            System.out.println("Cost to city " + i + ": " + dist[i]);
        }
    }
}

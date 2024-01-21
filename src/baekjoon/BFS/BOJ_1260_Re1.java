package baekjoon.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1260_Re1 {
    static int n, m, v; // 정점 수, 간선 수, 시작 정점
    static int[][] arr;
    static boolean[] visit;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());

        arr = new int[n + 1][n + 1];
        visit = new boolean[n + 1];
        for (int i = 0; i < m; i++) {
            StringTokenizer st1 = new StringTokenizer(bufferedReader.readLine());
            int node = Integer.parseInt(st1.nextToken());
            int linkNode = Integer.parseInt(st1.nextToken());
            arr[node][linkNode] = 1;
            arr[linkNode][node] = 1;
        }

        dfs(v);
        Arrays.fill(visit, false);
        sb.append("\n");
        bfs(v);
        System.out.println(sb);

    }

    static void dfs(int v){
        visit[v] = true;
        sb.append(v).append(" ");
        for (int i = 1; i <= n; i++) {
            if (arr[v][i] == 1 && !visit[i]) {
                dfs(i);
            }
        }
    }

    static void bfs(int v) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(v);
        visit[v] = true;
        while (!q.isEmpty()) {
            v = q.poll();
            sb.append(v).append(" ");
            for (int i = 1; i <= n; i++) {
                if (arr[v][i] == 1 && !visit[i]) {
                    q.offer(i);
                    visit[i] = true;
                }
            }
        }
    }
}

package baekjoon.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// DFS와 BFS 1260
public class BOJ_1260 {
    static int n, m, v;
    static int[][] arr;
    static boolean[] visit;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st1.nextToken());
        m = Integer.parseInt(st1.nextToken());
        v = Integer.parseInt(st1.nextToken());

        arr = new int[n+1][n+1];
        visit = new boolean[n+1];

        for (int i = 0; i < m; i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int node = Integer.parseInt(st2.nextToken());
            int linkNode = Integer.parseInt(st2.nextToken());
            arr[node][linkNode] = 1;
            arr[linkNode][node] = 1;
        }
        dfs(v);
        Arrays.fill(visit, false);
        sb.append("\n");
        bfs(v);

        System.out.println(sb);


    }

    public static void dfs(int v){
        visit[v] = true;
        sb.append(v + " ");
        for (int i = 1; i <= n; i++){
            if (arr[v][i] == 1 && !visit[i]){
                dfs(i);
            }
        }
    }

    public static void bfs(int v){
        Queue<Integer> q = new LinkedList<>();
        q.offer(v);
        visit[v] = true;

        while (!q.isEmpty()) {
            v = q.poll();
            sb.append(v + " ");
            for (int i = 1; i <= n; i++) {
                if (arr[v][i] == 1 && !visit[i]) {
                    q.offer(i);
                    visit[i] = true;
                }
            }
        }


    }
}

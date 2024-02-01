package baekjoon.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 미로 탐색 - 2178
public class BOJ_2178 {
    static int n, m;
    static int[][] arr;
    // 상, 우, 하, 좌
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            String miro = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = miro.charAt(j) - '0';
            }
        }

        bfs(0,0);
        System.out.println(arr[n-1][m-1]);
    }

    public static void bfs(int x, int y) {
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(x,y));
        while (!q.isEmpty()) {
            Node node = q.poll();
            // 현재 노드 좌표
            x = node.getNx();
            y = node.getNy();
            for (int i = 0; i < 4; i++) {
                // 이동한 좌표
                int cx = x + dx[i];
                int cy = y + dy[i];

                if (cx <0 || cx >= n || cy < 0 || cy  >= m){
                    continue;
                }

                if (arr[cx][cy] == 0) {
                    continue;
                }

                if (arr[cx][cy] == 1){
                    arr[cx][cy] = arr[x][y] + 1;
                    q.offer(new Node(cx, cy));
                }
            }
        }
    }
}

// 위치 정보를 위해 node 사용
class Node{
    private int nx;
    private int ny;

    public Node(int nx, int ny) {
        this.nx = nx;
        this.ny = ny;
    }

    public int getNx() {
        return nx;
    }

    public int getNy() {
        return ny;
    }
}

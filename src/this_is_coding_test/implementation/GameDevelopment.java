package this_is_coding_test.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// 게임 개발 Page.118
public class GameDevelopment {
    static int direction;

    public static void turnDirection(){
        direction += 1;
        if (direction > 3) direction = 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        // 맵 크기
        int n = sc.nextInt();
        int m = sc.nextInt();

        // 캐릭터의 위치와 바라보는 방향(0-북, 1-서, 2-남, 3-동)
        int x = sc.nextInt();
        int y = sc.nextInt();
        direction = sc.nextInt();

        // 맵 방문 위치 캐릭터 생성 위치 1로 설정
        int[][] point = new int[n][m];
        point[x][y] = 1;

        // 맵 설정
        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // 북, 서, 남, 동
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, -1, 0, 1};

        int cnt = 1;
        int block = 0;
        while(true){
            turnDirection();
            int px = x + dx[direction];
            int py = y + dy[direction];
            if (point[px][py] == 0 && arr[px][py] == 0) {
                point[px][py] = 1;
                x = px;
                y = py;
                cnt = cnt + 1;
                block = 0;
                continue;
            }else {
                block = block + 1;
            }
            if (block == 4){
                px = x - dx[direction];
                py = y - dy[direction];
                if (arr[px][py] == 0) {
                    x = px;
                    y = py;
                    block = 0;
                }else {
                    break;
                }
            }
        }
        System.out.println(cnt);

    }
}

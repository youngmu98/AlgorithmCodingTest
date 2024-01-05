package this_is_coding_test.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 상하좌우 Page.110
public class UpDownLeftRight {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] plan = br.readLine().split(" ");
        int x = 0;
        int y = 0;

        // L, R, U, D
        int[] dx = { 0, 0, -1, 1 };
        int[] dy = { -1, 1, 0, 0 };
        String[] move = {"L", "R", "U", "D"};

        for (int i = 0; i < plan.length; i++){
            int moveChoice = Arrays.asList(move).indexOf(plan[i]);
            if (x + dx[moveChoice] >= 0 && x + dx[moveChoice] < n){
                if (y + dy[moveChoice] >= 0 && y + dy[moveChoice] < n){
                    x = x + dx[moveChoice];
                    y = y + dy[moveChoice];
                }
            }
        }
        System.out.println((x+1)+" "+(y+1));

    }
}

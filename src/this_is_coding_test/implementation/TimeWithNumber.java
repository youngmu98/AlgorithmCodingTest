package this_is_coding_test.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 시각 Page.113
public class TimeWithNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        // 시 0 ~ 23, 분 0 ~ 59, 초 0 ~ 59
        for (int h = 0; h <= n; h++) {
            for (int m = 0; m < 60; m++){
                for (int s = 0; s < 60; s++){
                    if (h % 10 == 3 || m / 10 == 3 || m % 10 == 3 || s / 10 == 3 || s % 10 == 3) {
                        cnt = cnt + 1;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}

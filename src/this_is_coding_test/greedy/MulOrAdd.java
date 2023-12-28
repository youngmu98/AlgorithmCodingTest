package this_is_coding_test.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 곱하기 혹은 더하기 Page.312
public class MulOrAdd {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine(); // 0~9까지로 이루어진 문자열 1 <= s <= 20
        long cnt = 0;

        for (String i : s.split("")) {
            int num = Integer.parseInt(i);
            if (num<2 || cnt < 2){
                cnt = cnt + num;
            }else {
                cnt = cnt * num;
            }
        }
        System.out.println(cnt);
    }
}

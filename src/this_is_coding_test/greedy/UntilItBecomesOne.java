package this_is_coding_test.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1이 될때까지 page.99
public class UntilItBecomesOne {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 내 풀이
        int n = Integer.parseInt(br.readLine());
        int t = Integer.parseInt(br.readLine());
        int cnt = 0;
        while (true){
            if(n==1){
                break;
            }else if (n%t == 0){
                n = n/t;
                cnt++;
            }else {
                n = n - 1;
                cnt++;
            }
        }
        System.out.println("cnt = " + cnt);

        // 책 풀이
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int count = 0;
        while(true){
            int target = (a/b)*b;
            count += (a-target);
            a=target;
            if(a<b) break;
            count += 1;
            a /= b;
        }
        count += (a-1);
        System.out.println("count = " + count);

    }
}

package this_is_coding_test.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


// 모험가 길드 Page.311
public class AdventurerGuild {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 모험가 수  n = 1 ~ 100,000
        String fear = br.readLine(); // 모험가 공포도 1 2 3 공백으로 받음
        List<Integer> fearList = new ArrayList<>();

        for (String i : fear.split(" ")) {
            fearList.add(Integer.parseInt(i));
        }
        Collections.sort(fearList); // 오름차순 정렬

        int result = 0;
        int cnt = 0;

        for (Integer i : fearList) {
            cnt = cnt + 1;
            if (cnt >= i){
                result = result + 1;
                cnt = 0;
            }
        }

        System.out.println(result);

    }
}

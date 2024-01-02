package this_is_coding_test.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 만들 수 없는 금액 Page.314
public class ImpossibleToMake {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String num = br.readLine();

        List<Integer> numList = new ArrayList<>();
        for (String i : num.split(" ")) {
            numList.add(Integer.parseInt(i));
        }
        Collections.sort(numList);

        int result = 1; // 만들수 없는 값 확인
        for (Integer i : numList) {
            if(result < i){ // 리스트의 값보다 만들 수 없는 값이 작다면 멈추기
                break;
            }
            result = result + i;
        }
        System.out.println("result = " + result);

    }
}

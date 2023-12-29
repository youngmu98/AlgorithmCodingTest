package this_is_coding_test.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

// 문자열 뒤집기 Page.313
public class ReverseString {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        String[] listS = s.split("");


        int result = 0;
        String first = String.valueOf(s.charAt(0));
        int cnt = 0;

        for(int i = 1; i< listS.length; i++){
            if (!listS[i].equals(first)){
                if(i+1< listS.length && listS[i].equals(listS[i+1])){ // 다음 번호와 같은지 확인
                    cnt = cnt + 1;
                }
                listS[i] = first;
                result = result + 1;
            }

        }
        System.out.println("result = " + (result-cnt));
    }
}

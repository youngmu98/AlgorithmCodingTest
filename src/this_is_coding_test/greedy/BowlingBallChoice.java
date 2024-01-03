package this_is_coding_test.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// 볼링공 고르기 Page.315
public class BowlingBallChoice {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String numAndMaxWeight = br.readLine();
        String weight = br.readLine();

        List<Integer> weightList = new ArrayList<>();
        for (String i : weight.split(" ")) {
            weightList.add(Integer.parseInt(i));
        }

        int result = 0;
        int cnt = 1;

        for (Integer i : weightList) {
            for(int j = cnt; j<weightList.size(); j++){
                if (!i.equals(weightList.get(j))){
                    result = result + 1;
                }
            }
            cnt = cnt + 1;
        }

        System.out.println(result);
    }
}

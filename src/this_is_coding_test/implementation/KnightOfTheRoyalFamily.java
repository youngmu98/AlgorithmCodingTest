package this_is_coding_test.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

// 왕실의 기사 Page.115
public class KnightOfTheRoyalFamily {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String location = br.readLine();

        // 나이트의 위치
        List<Character> column = List.of('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h');
        int x = column.indexOf(location.charAt(0)) + 1;
        int y = location.charAt(1) - 48;

        int result = 0;

        // 오른쪽, 아래, 왼쪽, 위 이동 거리
        int[] dx = {-1, 1, 2, 2, -1, 1, -2, -2};
        int[] dy = {2, 2, -1, 1, -2, -2, -1, 1};

        for (int i = 0; i < dx.length; i++) {
            if (x + dx[i] > 0 && x + dx[i] < 9 && y + dy[i] > 0 && y + dy[i] < 9){
                result = result + 1;
            }
        }
        System.out.println(result);

    }
}

package Programmers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class programmers77484 {

    public static void main(String[] args) {
        final int[] sol1 = solution(new int[]{44, 1, 0, 0, 31, 25},
                new int[]{31, 10, 45, 1, 6, 19});
        final int[] sol2 = solution(new int[]{0, 0, 0, 0, 0, 0},
                new int[]{38, 19, 20, 40, 15, 25});
        final int[] sol3 = solution(new int[]{45, 4, 35, 20, 3, 9},
                new int[]{20, 9, 3, 45, 4, 35});
        System.out.println(Arrays.toString(sol1));
        System.out.println(Arrays.toString(sol2));
        System.out.println(Arrays.toString(sol3));
    }

    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        final List<Integer> winToList = Arrays.stream(win_nums)
                .boxed()
                .collect(Collectors.toList());
        int[] win = {0, 6, 5, 4, 3, 2, 1};
        int winNumber = 0;
        int possibleNumber = 0;
        for (int lotto : lottos) {
            if (winToList.contains(lotto)) {
                winNumber++;
            }
            if (lotto == 0) {
                possibleNumber++;
            }
        }
        answer[0] = win[winNumber + possibleNumber];
        answer[1] = win[winNumber];
        return answer;
    }
}

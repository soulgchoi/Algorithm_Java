package Programmers;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class programmers68644 {
    public static void main(String[] args) {
        int[] tc1 = {2, 1, 3, 4, 1};
        int[] tc2 = {5, 0, 2, 7};
        solution2(tc1);
        solution2(tc2);
    }

    public static int[] solution(int[] numbers) {
        int[] answer;
        int[] result = new int[200];
        for (int i=0; i<numbers.length-1; i++) {
            for (int j=i+1; j<numbers.length; j++) {
                result[numbers[i]+numbers[j]] = 1;
            }
        }
        answer = IntStream.range(0, result.length)
                .filter(r-> result[r] == 1)
                .toArray();
        return answer;
    }

    public static int[] solution2(int[] numbers) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] result = new int[200];
        for (int i=0; i<numbers.length-1; i++) {
            for (int j=i+1; j<numbers.length; j++) {
                result[numbers[i]+numbers[j]] = 1;
            }
        }
        for (int r=0; r<result.length; r++) {
            if (result[r] == 1) {
                answer.add(r);
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}

package Programmers;

import java.util.ArrayList;
import java.util.List;

public class programmers12906 {
    public static void main(String[] args) {
        int[] tc1 = { 1,1,3,3,0,1,1 };
        int[] tc2 = { 4, 4, 4, 3, 3, };
        solution(tc1);
        solution(tc2);
    }

    public static int[] solution(int []arr) {
        List<Integer> answer = new ArrayList();
        answer.add(arr[0]);
        for (int i=1; i<arr.length; i++) {
            if (arr[i] != answer.get(answer.size()-1)) {
                answer.add(arr[i]);
            }
        }
        System.out.println(answer);
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}

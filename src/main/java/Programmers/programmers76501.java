package Programmers;

public class programmers76501 {
    public static void main(String[] args) {
        int[] tc1_absolutes = {4, 7, 12};
        boolean[] tc1_signs = {true, false, true};
        int[] tc2_absolutes = {1, 2, 3};
        boolean[] tc2_signs = {false, false, true};
        int answer1 = solution(tc1_absolutes, tc1_signs);
        int answer2 = solution(tc2_absolutes, tc2_signs);

        System.out.println(answer1);
        System.out.println(answer2);
    }

    public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i=0; i<absolutes.length; i++) {
            answer += absolutes[i] * (signs[i] ? 1 : -1);
        }
        return answer;
    }
}
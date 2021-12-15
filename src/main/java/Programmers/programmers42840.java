package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class programmers42840 {
    public static void main(String[] args) {
        int[] tc1 = {1, 2, 3, 4, 5};
        int[] tc2 = {1, 3, 2, 4, 2};
        solution(tc1);
        solution(tc2);
    }
    
    public static int[] solution(int[] answers) {
        int[] grade = new int[3];
        int[] first = {1, 2, 3, 4, 5};
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        for (int i=0; i<answers.length; i++) {
            if (answers[i] == first[i%first.length]) grade[0] += 1;
            if (answers[i] == second[i%second.length]) grade[1] += 1;
            if (answers[i] == third[i%third.length]) grade[2] += 1;
        }

        int max = 0;
        ArrayList<Integer> answer = new ArrayList<>();
        for (int g : grade) {
            if (g > max) {
                max = g;
            }
        }
        for (int s=0; s<grade.length; s++) {
            if (grade[s] == max) {
                answer.add(s+1);
            }
        }
        System.out.println(answer);
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }


    public static int[] solution2(int[] answers) {
        List<Integer> answer = new ArrayList<>();
        int[] grade = new int[3];
        int[] first = {1, 2, 3, 4, 5};
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        List<int[]> students = new ArrayList<>();
        students.add(first);
        students.add(second);
        students.add(third);

        for (int[] student : students) {
            int i = 0;
            int j = 0;
            int cnt = 0;
            while (i < answers.length) {
                if (student == first && j % 5 == 0) {
                    j = 0;
                }
                if (student == second && j % 8 == 0) {
                    j = 0;
                }
                if (student == third && j % 10 == 0) {
                    j = 0;
                }
                if (answers[i] == student[j]) {
                    cnt += 1;
                }
                j += 1;
                i += 1;
            }
            grade[students.indexOf(student)] = cnt;
        }
        System.out.println(Arrays.toString(grade));
        int max = 0;
        for (int g : grade) {
            if (g > max) {
                max = g;
            }
        }
        System.out.println(max);
        for (int s=0; s<grade.length; s++) {
            if (grade[s] == max) {
                answer.add(s+1);
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}

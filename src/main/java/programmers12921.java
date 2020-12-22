import java.util.ArrayList;
import java.util.List;

public class programmers12921 {
    public static void main(String[] args) {
        solution(10);
        solution(5);
    }

    public static int solution(int n) {
        int answer;
        boolean isPrime;
        List<Integer> primeNumber = new ArrayList<>();
        for (int i=2; i<n+1; i++) {
            isPrime = true;
            for (int j=0; j<primeNumber.size(); j++) {
                if (primeNumber.get(j) < Math.sqrt(i)+1) {
                    if (i % primeNumber.get(j) == 0) {
                        isPrime = false;
                        break;
                    }
                } else break;
            }
            if (isPrime) {
                primeNumber.add(i);
            }
        }
        answer = primeNumber.size();
        return answer;
    }
}

import java.util.HashSet;

public class 소인수분해_프로그래머스 {
    public static void main(String[] args) {
        int[] answer = {};
        int n = 420;
        HashSet<Integer> test = new HashSet<>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                test.add(i);
                n /= i;
            }
        }
        if (n != 1) {
            test.add(n);
        }

        answer = test.stream().mapToInt(Integer::intValue).sorted().toArray();
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }
}

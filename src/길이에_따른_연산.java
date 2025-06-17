public class 길이에_따른_연산 {
    public static void main(String[] args) {
        int[] num_list = {2, 3, 4, 5};

        int answer = (num_list.length >= 11) ? 0 : 1;

        for (int num : num_list) {
            answer = (num_list.length >= 11) ? answer + num : answer * num;
        }

        System.out.println("answer = " + answer);  // 출력: 120
    }
}

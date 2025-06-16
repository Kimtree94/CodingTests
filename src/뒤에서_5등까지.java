import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class 뒤에서_5등까지 {
    public static void main(String[] args) {
        int[] num_list = {12, 4, 15, 46, 38, 14, 1};

        // num_list 배열을 오름차순으로 정렬
        Arrays.sort(num_list);

        // 가장 작은 5개의 수를 제외한 나머지 요소를 포함하는 배열 생성
        int[] answer = Arrays.copyOfRange(num_list, 0,5);
        // answer 배열의 각 요소 출력
        System.out.println("answer: " + Arrays.toString(answer));
    }
}

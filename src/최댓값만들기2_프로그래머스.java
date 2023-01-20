import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import static java.util.Arrays.*;

public class 최댓값만들기2_프로그래머스 {
    public static void main(String[] args) {
        /*
        정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소 중
        두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.
        */

        int[] numbers = new int[]{10, -31, 24, 10, 1, 9}; // 주어진 배열
        int answer = 0; // 곲한값 넣을 answer

        Arrays.sort(numbers); // Array.sort를 사용하면 오름차순 정렬이됨

        int A = numbers[0] * numbers[1]; // 첫번째 인덱스 두번째 인덱스를 곱한값 A
        int B = numbers[numbers.length - 1] * numbers[numbers.length - 2];// 마지막 인덱스 마지막인덱스의 전 인덱스
        //즉 양쪽 앞뒤값을 비교하여 대입한다 .
        if (A > B) {
            answer = A;
        } else {
            answer = B;
        }
    }
}

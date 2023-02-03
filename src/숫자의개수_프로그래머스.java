import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class 숫자의개수_프로그래머스 {
    public static void main(String[] args) {
        /*
         머쓱이는 행운의 숫자 7을 가장 좋아합니다.
         정수 배열 array가 매개변수로 주어질 때,
          7이 총 몇 개 있는지 return 하도록 solution 함수를 완성해보세요.
        */
        int[] array = {10, 29};
        int answer = 0;
        for (int i : array) { // arr를 int i 에 하나씩 대입
            String s = String.valueOf(i); // 그 값을 String으로 바꾸고
            for (char c : s.toCharArray()) { // char c에 한글자씩 대입해서
                if (c == '7') {  // 그 값이 만약 '7'과 같으면
                    answer++; // answer을 카운트
                }
            }
        }

    }
}

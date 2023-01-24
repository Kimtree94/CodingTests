import java.util.Arrays;

public class A로B만들기_프로그래머스 {
    public static void main(String[] args) {
        /*
        문자열 before와 after가 매개변수로 주어질 때,
        before의 순서를 바꾸어 after를 만들 수 있으면 1을, 만들 수 없으면 0을 return 하도록 solution 함수를 완성해보세요.
        */

        String before = "allpe";
        String after = "apple";
        int answer = 0;

        char[] test = before.toCharArray(); // 한글자씩 자를 char배열 before
        char[] V = after.toCharArray(); // 한글자씩 자를 char배열 after
        Arrays.sort(test);  // 정렬
        Arrays.sort(V);     // 정렬
        String A = "";  //char 배열을 equals로 비교하기위해 임시배열 선언
        String B = "";  //char 배열을 equals로 비교하기위해 임시배열 선언
        for (int i = 0; i < test.length; i++) { // test길이까지 반복문
            A += String.valueOf(test[i]); //A에 자른배열 대입
            B += String.valueOf(V[i]);  // B에 자른배열 대입
        }
        if (A.equals(B)) { // 같으면 1
            answer = 1;
        } else { // 다르면 0
            answer = 0;
        }
        System.out.println(answer);
    }
}

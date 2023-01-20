import java.util.Arrays;

public class 문자열정렬하기2_프로그래머스 {
    public static void main(String[] args) {
        String my_string = "Bcad";
        String answer = "";
        my_string = my_string.toLowerCase();        // 소문자로 바꾸기
        char[] a = my_string.toCharArray();         // 순서 맞추기위한 char배열
        Arrays.sort(a);                             //sort이용해 순서 맞추기
        answer = String.valueOf(a);                 // answer에 대입
        System.out.println(answer);
    }
}

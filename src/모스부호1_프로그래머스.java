import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 모스부호1_프로그래머스 {
    public static void main(String[] args) {
        Map<String, String> morse = new HashMap<String, String>() {//속도가 빠른 Map
            {
                put(".-", "a");
                put("-...", "b");
                put("-.-.", "c");
                put("-..", "d");
                put(".", "e");
                put("..-.", "f");
                put("--.", "g");
                put("....", "h");
                put("..", "i");
                put(".---", "j");
                put("-.-", "k");
                put(".-..", "l");
                put("--", "m");
                put("-.", "n");
                put("---", "o");
                put(".--.", "p");
                put("--.-", "q");
                put(".-.", "r");
                put("...", "s");
                put("-", "t");
                put("..-", "u");
                put("...-", "v");
                put(".--", "w");
                put("-..-", "x");
                put("-.--", "y");
                put("--..", "z");
            }
        }; // 인덱스가 있는 Map에 morse 를 추가
        String answer = "";

        String letter="hello";
        String[] arr = letter.split(" ");
        for (String A : arr) { // String A 에 주어진 모스부호를 잘라서 넣어준다 [ 향상된 for문 사용 ]
            answer += morse.get(A); // answer에 string A 에 맞는 알파벳을 morse에서 얻는다 .
        }
        System.out.println(answer);
    }
}

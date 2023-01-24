import java.util.Arrays;
import java.util.stream.Stream;

public class 중복된문자제거_프로그래머스 {
    public static void main(String[] args) {
        /*
        문자열 my_string이 매개변수로 주어집니다. my_string에서
         중복된 문자를 제거하고 하나의 문자만 남긴 문자열을 return하도록 solution 함수를 완성해주세요.
        */
        String my_string="people";
        String answer = "";

        char [] test =my_string.toCharArray(); //문자열을 하나씩 잘라서 char배열에 담아줍니다.

        for(int i=0;i<test.length;i++){// test의 길이까지 돌려주고
            if(!answer.contains(String.valueOf(test[i]))){ //리턴할 answer에 test의 i값이
                answer+=String.valueOf(test[i]); // answer에 중복된값을 제거한 값을 추가합니다.
            }
        }
        System.out.println(answer);
    }
}

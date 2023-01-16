import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 문자열정렬하기_프로그래머스 {
    public static void main(String[] args) {
        /*
    문자열 my_string이 매개변수로 주어질 때,
    my_string 안에 있는 숫자만 골라 오름차순 정렬한
    리스트를 return 하도록 solution 함수를 작성해보세요.
        */
        String my_string = "p2o4i8gj2";
        int[] answer = {};

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i++) {
           char A = my_string.charAt(i);
           if(Character.isDigit(A)){
               String B = String.valueOf(A);
               list.add(B);
           }
        }
        for(int i=0;i<list.size();i++){
//           answer = list.get(i);
        }
    }
}

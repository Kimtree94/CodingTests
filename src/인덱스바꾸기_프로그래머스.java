import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class 인덱스바꾸기_프로그래머스 {
    public static void main(String[] args) {
        /*
        문자열 my_string과 정수 num1, num2가 매개변수로 주어질 때,
        my_string에서 인덱스 num1과 인덱스 num2에 해당하는 문자를 바꾼
        문자열을 return 하도록 solution 함수를 완성해보세요.
        */
/*        String answer = "";
        String my_string ="I love you";
        int num1=3;
        int num2=6;
        String temp = String.valueOf(my_string.charAt(num1)); // 임시 스트링 배열을 선언하고 num1에 해당하는 문자를 대입한다
        String [] we = {}; //자리수를 구분하기 위한 스트링 배열을 선언한다
        we = my_string.split("");//주어진 매개변수를 한자리씩 잘라 넣는다
        we[num1]=we[num2];//첫번째자리에 교체할 문자열을 자리를 넣고
        we[num2]=temp; // 교체된자리에 임시에 저장되있던 문자를 대입한다
        for(int i=0;i<we.length;i++){
            answer+=we[i];//반복문을 돌려 answer에 대입한다
        }
        System.out.println(answer);*/
       /* List<String> list = Arrays.stream(myString.split("")).collect(Collectors.toList());

        Collections.swap(list, num1, num2);
        return String.join("", list);*/
        String answer = "";
        String my_string ="I love you";
        int num1=3;
        int num2=6;
        List<String > list = Arrays.stream(my_string.split("")).collect(Collectors.toList());

        Collections.swap(list,num1,num2);

        System.out.println(String.join("",list));
    }
}

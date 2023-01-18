import java.util.Arrays;
import java.util.stream.Stream;

public class 외계행성의나이_프로그래머스 {
    public static void main(String[] args) {
        /*
             우주여행을 하던 머쓱이는 엔진 고장으로 PROGRAMMERS-962 행성에 불시착하게 됐습니다. 입국심사에서 나이를 말해야 하는데,
              PROGRAMMERS-962 행성에서는 나이를 알파벳으로 말하고 있습니다. a는 0, b는 1, c는 2, ..., j는 9입니다.
              예를 들어 23살은 cd, 51살은 fb로 표현합니다. 나이 age가 매개변수로
              주어질 때 PROGRAMMER-962식 나이를 return하도록 solution 함수를 완성해주세요.

              알파뱃 순서가 숫자가되는것
        */
        int age =100;
        String answer = "";
        String A = "abcdefghijklmnopqrstuvwxyz";
        int[] Num = Stream.of(String.valueOf(age).split("")).mapToInt(Integer::parseInt).toArray(); // age를 Stream 을 사용해서 한자리수로 자른다
//        System.out.println(Arrays.toString(Num));

        for(int i=0;i<Num.length;i++){
          answer+=String.valueOf(A.charAt(Num[i])); //그다음 선언한 문자열 알파벳에서 각각 자리값을 찾아서 뽑는다
        }
        System.out.println(answer);
    }
}

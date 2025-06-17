import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 할_일_목록 {
    /*
오늘 해야 할 일이 담긴 문자열 배열 todo_list와 각각의
일을 지금 마쳤는지를 나타내는 boolean 배열 finished가 매개변수로 주어질 때,
 todo_list에서 아직 마치지 못한 일들을 순서대로 담은 문자열 배열을 return 하는 solution 함수를 작성해 주세요.
*/
        public static void main(String[] args) {
            String[] todo_list = {"problemsolving", "practiceguitar", "swim", "studygraph"};
            boolean[] finished = {true, false, true, false};

            String str = "";
            for(int i=0; i<finished.length; i++){
                str = finished[i]==false ? str+todo_list[i]+"," : str;
            }

            System.out.println("str.split(\",\") = " + str.split(","));
        }
}

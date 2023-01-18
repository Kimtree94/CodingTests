import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 배열회전시키기_프로그래머스 {
    public static void main(String[] args) {
        /*
        정수가 담긴 배열 numbers와 문자열 direction가 매개변수로 주어집니다.
        배열 numbers의 원소를 direction방향으로 한 칸씩 회전시킨 배열을 return하도록 solution 함수를 완성해주세요.
        123 => right => 312
        123 => left =>231
        */
        int[] numbers = {1, 2, 3};
        String direction = "left";
        int[] answer = new int[numbers.length];     // answer의 길이를 numbers의 길이까지로 설정하고
        for (int i = 0; i < numbers.length; i++) {  // 반복문을 number의 길이까지 반복문을 돌려주고
            if (direction.equals("left")) { // 만약에 조건이 left면
                if (i != numbers.length - 1) {  // i가 numbers의 마지막 인덱스가 아니면
                    answer[i] = numbers[i + 1]; // i가 0번부터이니 answer의 첫자리에 numbers의 두번째인덱스값을 대입하고
                } else {                        //  아니면
                    answer[numbers.length - 1] = numbers[0];    //  answer의 마지막인덱스에 number의 첫 인덱스를 대입한다
                }
            }else{
                if(i!=numbers.length-1){            //  위와 같은조건 즉 조건이 right이면
                    answer[i+1]=numbers[i];         //  answer의 두번째에 number의 첫 인덱스를 대입하고
                }else{
                    answer[0]=numbers[i];           // i가 마지막 인덱스이면 answer의 첫번째에 number의 마지막값을 대입한다
                }
            }

        }
    }
}
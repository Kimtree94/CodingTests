import java.util.Arrays;
import java.util.Comparator;

public class 진료순서정하기_프로그래머스 {
    public static void main(String[] args) {
        /*
        외과의사 머쓱이는 응급실에 온 환자의 응급도를 기준으로 진료 순서를 정하려고 합니다.
        정수 배열 emergency가 매개변수로 주어질 때 응급도가 높은 순서대로 진료 순서를
        정한 배열을 return하도록 solution 함수를 완성해주세요.
        */

        int[] emergency={1, 2, 3, 4, 5, 6, 7};
        int[] answer = new int[emergency.length]; // 답의 길이를 emergency만큼으로 선언

        System.out.println(  Arrays.stream(emergency).mapToObj(i->Arrays.stream(emergency).boxed().sorted(Comparator.reverseOrder())));
        for(int i=0;i<emergency.length;i++){ //emergency의 길이만큼 반복문
            for(int o=0;o<emergency.length;o++){ // 비교를 위한 반복문 하나 더 선언
                if(emergency[i]<emergency[o]){ // 만약에 i값이 o값보다 작으면
                    answer[i]++; // 즉 자신의 순서보다 값이 높으면 순서 배열에 +1
                }
            }
            answer[i]++; // 순서 배열의 모든값에 1추가 순서를 0이아닌 1부터하기위해 1을 더 더해줌
        }
    }
}

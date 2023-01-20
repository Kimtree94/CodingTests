import java.util.ArrayList;
import java.util.List;

public class 약수구하기_프로그래머스 {
    public static void main(String[] args) {
        /*
정수 n이 매개변수로 주어질 때,
n의 약수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.
        */
        int n = 29;
        int[] answer = {};
        List<Integer> list = new ArrayList<>(); // 약수 담을 list tjsdjs
        for (int i = 1; i <= n; i++) { // n까지 반복문돌리기
            if (n % i == 0) { // 주어진 n을 i로 나웠을때 0이면 약수라는 뜻이라 조건 걸기
                list.add(i);//그 i값 list에 추가
            }
        }
        answer = new int[list.size()]; // answer을 list의 길이까지 길이선언
        for(int i=0;i<list.size();i++){ // list만큼 반복문 돌리기
            answer[i]=list.get(i);  //  answer에 list의 값 대입
        }

    }
}

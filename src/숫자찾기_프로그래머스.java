import java.util.stream.Stream;

public class 숫자찾기_프로그래머스 {
    public static void main(String[] args) {
        /*
        정수 num과 k가 매개변수로 주어질 때, num을 이루는 숫자 중에 k가 있으면 num의
         그 숫자가 있는 자리 수를 return하고 없으면 -1을 return 하도록 solution 함수를 완성해보세요.
        */
        int num=123456;
        int k=7;
        int answer=0;
        int[] Num = Stream.of(String.valueOf(num).split("")).mapToInt(Integer::parseInt).toArray(); // num을 Stream 을 사용해서 한자리수로 자른다.

        for(int i=0;i<Num.length;i++){ // 반복문을 돌려서
            if(Num[i]==k){// 조건을 설정하고
                answer=i+1; // 배열은 0번째부터니까 +1을 해준다
                break;//그리고 break를 건다
            }
            else{
                answer=-1; //아니면 -1을 대입한다.
            }
        }
        System.out.println(answer);
    }
}

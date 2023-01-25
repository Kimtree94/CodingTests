public class 합성수찾기_프로그래머스 {
    public static void main(String[] args) {
        /*
        약수의 개수가 세 개 이상인 수를 합성수라고 합니다.
        자연수 n이 매개변수로 주어질 때 n이하의
        합성수의 개수를 return하도록 solution 함수를 완성해주세요.
        */
        int answer = 0;
        int n = 10;
        int count = 0; // 숫자 셀수있는 카운트

        for (int i = 1; i <= n; i++) { // n까지 반복문돌리기
            count = 0; //약수 갯수 초기화 각 숫자마다 합성수 찾아야됨으로
            for (int j = 1; j <= i; j++) { //i를 다른숫자  j 로 나누기위한 반복문 돌리기
                if (i % j == 0) { // i를 j로 나누었을때 0이면 소수라는거이므로 조건으로 건다
                    count++;// 그 갯수를 센다
                }
            }
            if (count >= 3) { // 합성수는 소수가 3개이상인것이니까 조건 설정
                answer++; // 조건에 들어오면 answer추가 즉 합성수 카운트
            }
        }
        System.out.println(answer);
    }
}



public class k의개수_프로그래머스 {
    /*
    1부터 13까지의 수에서, 1은 1, 10, 11, 12, 13 이렇게 총 6번 등장합니다.
     정수 i, j, k가 매개변수로 주어질 때, i부터 j까지 k가 몇 번
      등장하는지 return 하도록 solution 함수를 완성해주세요.
    */
    public static void main(String[] args) {

        int i = 10;
        int j = 50;
        int k = 5;

        int answer = 0;



        for (int s = i; s <= j; s++) {
               StringBuilder sb =new StringBuilder(); // 스트링빌더 선언  스트링 빌더는 수정이 가능한  String의 상위버전??..
               sb.append(s); // 빌더에 10부터 50까지 대입

            for(int d=0;d<sb.length();d++){ // 그 길이까지 반복문
                if((sb.charAt(d)-'0')==k){//하나씩 자르고'0'을 빼야만 숫자 1부터 비교 가능하기에 빼준다 k랑 같으면
                    answer++; //answer추가
                }
            }
        }
        System.out.println(answer);

    }
}

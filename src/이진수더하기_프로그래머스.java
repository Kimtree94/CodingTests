public class 이진수더하기_프로그래머스 {
    public static void main(String[] args) {
        /*
         이진수를 의미하는 두 개의 문자열 bin1과 bin2가 매개변수로 주어질 때,
          두 이진수의 합을 return하도록 solution 함수를 완성해주세요.
        */
        String bin1="10";
        String bin2="1 1";

        int A = Integer.parseInt(bin1,2); // 주어진 숫자를 10진수로 변환
        int B = Integer.parseInt(bin2,2); // 주어진 숫자를 10진수로 변환
        int C = A+B;    // 10진수 2개를 더한다

        String answer= Integer.toBinaryString(C); // answer에 더한값을 2진수로 바꿔서 대입
        System.out.println(answer);

    }
}

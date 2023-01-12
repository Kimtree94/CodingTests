import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class 가위바위보_프로그래머스 {
    public static void main(String[] args) throws IOException {
        /*가위는 2 바위는 0 보는 5로 표현합니다. 가위 바위 보를 내는 순서대로 나타낸 문자열 rsp가 매개변수로 주어질 때,
        rsp에 저장된 가위 바위 보를 모두 이기는 경우를 순서대로 나타낸 문자열을 return하도록 solution 함수를 완성해보세요.*/
//    205
//    052
        //가위 ==2
        //바위 ==0
        //보 ==5
        Scanner sc = new Scanner(System.in);
        String answer = "";
        String rsp = sc.nextLine();
        for (int i = 0; i < rsp.length(); i++) {    // rsp의 길이까지 반복문
            answer+=(rsp.split("")[i].equals("0")?"5"   // answer에 누적으로 넣어줄건데 rsp의 i번째가 0이면 5
                    :rsp.split("")[i].equals("2")?"0"   // rsp의 i번째가 2면 0
                    :rsp.split("")[i].equals("5")?"2":"1");// rsp의 i번째가 5면 2 마지막 1 은 삼항연산자 완성시키려 넣은 숫자
        }//삼항연산자 (조건)? 참이면 : 거짓이면
        System.out.println(answer);
    }
}

import java.util.stream.Stream;

public class 숨어있는숫자의덧셈2_프로그래머스 {
    public static void main(String[] args) {
        /*
문자열 my_string이 매개변수로 주어집니다. my_string은 소문자,대문자, 자연수로만 구성되어있습니다.
  my_string안의 자연수들의 합을 return하도록 solution 함수를 완성해주세요.
        */

        String my_string ="1a2b3c4d123Z";
        int answer=0;               // 답을 리턴
        int current = 0;            //
        boolean found = false;      //found
        for(char a : my_string.toCharArray()){ // 문자열을 하나씩 자르고
           if(Character.isDigit(a)){ // Character.isDigit을 사용해 해당 문자가 숫자인지를 확인
               found=true; // 숫자가 맞으면 found를 true로 변경
               current=current*10+Character.getNumericValue(a); // 연속된 숫자를 확인하기 위한 공식
           }else{
               if(found){
                   answer+=current; //그외 found가 true이면 answer에 추가
                   current=0; // current를 0으로 초기화
                   found=false; // false로 변경
               }
           }
        }
        if(found){ // 만약 found가 true이면
            answer+=current; // answer에 current추가
        }
        System.out.println(answer);
    }
}

import java.util.Arrays;

public class 한번만등장한문자_프로그래머스 {
    public static void main(String[] args) {
        /*
         문자열 s가 매개변수로 주어집니다.
          s에서 한 번만 등장하는 문자를 사전 순으로 정렬한 문자열을
           return 하도록 solution 함수를 완성해보세요.
           한 번만 등장하는 문자가 없을 경우 빈 문자열을 return 합니다.
        */
        String s = "abdc"; //존재하면 answer에 아니면 temp에?
        String answer = "";

        int [] count = new int[26];  // 각 문자의 수를 저장하는데 사용되는 26개의 요소가 있는 정수배열 만들기
                                    // 알파벳이 26자이기때문에 사이즈를 26으로 지정
        for (char c : s.toCharArray()){ //입력받은 문자열을 char배열로 변환하고 각 문자에 대해 해당문자의 수가 배열
            count[c-'a']++; //c에서 1씩 증가한다
        }
        StringBuilder sb = new StringBuilder(); // 스트링 빌더를 생성하고
        for(char a: s.toCharArray()){ // 같은 과정을 한번더 반복
            if(count[a-'a']==1){ // 카운트가 1이면 추가
                sb.append(a);//char a를
            }
        }
        char[] resultChars =sb.toString().toCharArray(); // sb에 추가된 문자를 char배열로 다시 만들고
        Arrays.sort(resultChars); // 정렬한후
        answer= new String(resultChars); // 스트링으로 변환해서 answer에대입한다.
    }
}

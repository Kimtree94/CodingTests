public class            암호해독_프로그래머스 {
    public static void main(String[] args) {
        /*
        군 전략가 머쓱이는 전쟁 중 적군이 다음과 같은 암호 체계를 사용한다는 것을 알아냈습니다.
        암호화된 문자열 cipher를 주고받습니다.
        그 문자열에서 code의 배수 번째 글자만 진짜 암호입니다.
        문자열 cipher와 정수 code가 매개변수로 주어질 때 해독된 암호 문자열을 return하도록 solution 함수를 완성해주세요.*/

       /* String cipher ="pfqallllabwaoclk"; // 0부터 시작하기 때문에 code-1 한 자리가 원하는 문자열의 자리값
        int code = 2;
        String answer ="";
        for(int i=code-1;i<cipher.length();i+=code){
           answer+=cipher.charAt(i);
        }
        System.out.println(answer);*/
        String answer="";
        String cipher ="pfqallllabwaoclk"; // 0부터 시작하기 때문에 code-1 한 자리가 원하는 문자열의 자리값
        int code = 2;
        for(int i=code ; i<=cipher.length();i=i+code){ // i 가 code  부터이면 원하는 자리수 i+code 는 배수를 표현
            answer+=cipher.substring(i-1,i);    //i는 code니까 0부터 시작하는 배열을 생각해서 -1을 해준 자리에서 code값 빼오기
        }
        System.out.println(answer);

    }
}

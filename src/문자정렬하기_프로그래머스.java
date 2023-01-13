public class 문자정렬하기_프로그래머스 {
    public static void main(String[] args) {
        /*
         문자열 my_string이 매개변수로 주어질 때,
         my_string 안에 있는 숫자만 골라 오름차순
          정렬한 리스트를 return 하도록 solution 함수를 작성해보세요.
        */
        String A = "hi12392";
        int[] answer = {};
        String pattern = "^[0-9]*$";

        for (char a : A.toCharArray()) {
            if (pattern.matches(String.valueOf(a))) {
                System.out.println(a);
            }
        }
    }
}

public class flag에_따라_다른_값_반환하기 {
    public static void main(String[] args) {
        int answer = 0;
        int a = -4;
        int b = 7;
        boolean flag = false;

        answer = flag ? a + b : a - b;
      /*  if (flag){
            answer = a + b;
        }else {
            answer = a - b;
        }*/
        System.out.println("answer = " + answer);
    }
}

import java.util.List;

public class 문자_리스트를_문자열로_변환하기 {
    public static void main(String[] args) {
        String[] arr = {"a", "b", "c"};

        System.out.println("arr = " + arr);
//        String answer = "";
        String result = "";
        for(String ch:arr){
            result += ch;
        }
        System.out.println("result = " + result);


        System.out.println("문자_리스트를_문자열로_변환하기.main = "+String.join("", arr));
    }
}

import java.util.Arrays;

public class 문자열의_뒤의_n글자 {
    public static void main(String[] args) {
        String answer = "";
        String my_string = "ProgrammerS123";
        int n =11 ;
        answer = my_string.substring(my_string.length() - n);
        System.out.println("answer = " + answer);
    }
}

import java.util.Arrays;

public class 영어가싫어요_프로그래머스 {

    /*
    영어가 싫은 머쓱이는 영어로 표기되어있는 숫자를 수로 바꾸려고 합니다.
    문자열 numbers가 매개변수로 주어질 때, numbers를 정수로 바꿔 return 하도록 solution 함수를 완성해 주세요.
    */
    public static void main(String[] args) {
        String numbers ="onefourzerosixseven";
        long answer = 0;

        String [] correct = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for(int i=0;i<correct.length;i++){
            numbers = numbers.replaceAll(correct[i],String.valueOf(i));
        }
        System.out.println(Long.parseLong(numbers));
    }
}
/*

public static long convertStringToNumber(String numbers) {
    String[] words = numbers.split("(?<=\\G.{3})"); // Split the string into groups of three characters
    Map<String, Integer> map = Map.of("zero", 0, "one", 1, "two", 2, "three", 3, "four", 4, "five", 5, "six", 6, "seven", 7, "eight", 8, "nine", 9);
    return Arrays.stream(words)
            .map(word -> map.get(word)) // Convert each word to its corresponding integer value
            .reduce((a, b) -> a * 10 + b) // Convert the array of integers to a single long integer
            .orElse(0L);
}


*/
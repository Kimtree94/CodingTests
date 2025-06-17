public class 원하는_문자열_찾기 {
    public static void main(String[] args) {
        String myString = "aaAA";
        String pat = "aaaaa";
        int answer = 0;
        answer = myString.toLowerCase().contains(pat.toLowerCase()) ? 1 :0;
        System.out.println("answer = " + answer);
    }
}

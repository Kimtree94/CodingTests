import java.util.Arrays;

public class 배열의_길이에_따라_다른_연산하기 {
    public static void main(String[] args) {
        int[] arr = {49, 12, 100, 276, 33};
        int n = 27;
        int[] answer = new int[arr.length];

        if(arr.length % 2 != 0){
            for(int i = 0 ;i<arr.length;i+=2){
                answer[i] = arr[i]+n;
            }
            for(int i = 1 ;i<arr.length;i+=2){
                answer[i] = arr[i];
            }
        }else {
            for(int i = 0 ;i<arr.length;i+=2){
                answer[i] = arr[i];
            }
            for(int i =1;i<arr.length;i+=2){
                answer[i] = arr[i]+n;
            }
        }
        System.out.println("Arrays.toString(answer) = " + Arrays.toString(answer));
    }
}
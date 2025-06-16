import java.util.Arrays;

public class 배열_비교하기 {
    public static void main(String[] args) {
        int answer = 0;
        int a = 0;
        int b = 0;
        int[] arr1 = {49, 13};
        int[] arr2 = {70, 11, 2};
        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                a += arr1[i];
            }
            for (int i = 0; i < arr2.length; i++) {
                b += arr2[i];
            }
            if(a!=b){
                if(a<b){
                    answer=-1;
                }else {
                    answer=1;
                }
            }
        } else {
            if(arr1.length<arr2.length){
                answer = -1;
            }else {
                answer = 1;
            }
        }
        System.out.println("answer = " + answer);
    }
}
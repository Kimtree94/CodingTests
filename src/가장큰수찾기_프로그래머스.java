public class 가장큰수찾기_프로그래머스 {
    public static void main(String[] args) {
        /*
        정수 배열 array가 매개변수로 주어질 때,
        가장 큰 수와 그 수의 인덱스를 담은 배열을
         return 하도록 solution 함수를 완성해보세요.
        */

        int[] array = {1, 8, 3}; // 주어진 배열
        int Max = 0;    // 최대값 대입을 위한 Max선언
        int A =0;       // 인덱스값 대입을 위한 A선언
        int [] answer = new int[2]; // 원하는 결과값은 2자리수 이니까 그 에 맞게 answer의 길이 선언
        for(int i =0 ;i<array.length;i++){ // array의 length까지 반복문을 돌린다
                if(array[i]>Max){   // 만약에 array의 i값이 선언한 최대값 보다 크면 대입  // 이렇게 하면 처음 2가 대입되어도 돌면서 조건에 의해 8이 대입되고 3은 걸러진다.
                    Max=array[i];   // 조건에 의해 가장 큰값을 Max에 대입
                    A=i;            // 조건에 의해 설정된 자리수 A에 대입
                }
        }
        answer[0]=Max;  // 가장 큰 값을 대입
        answer[1]=A;    // 그에 맞는 자리수 대입
        System.out.println(answer[0]+""+answer[1]);

    }
}

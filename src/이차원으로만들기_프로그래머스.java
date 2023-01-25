public class     이차원으로만들기_프로그래머스 {
    public static void main(String[] args) {
        /*
        정수 배열 num_list와 정수 n이 매개변수로 주어집니다. num_list를 다음 설명과 같이 2차원 배열로 바꿔 return하도록 solution 함수를 완성해주세요.
        num_list가 [1, 2, 3, 4, 5, 6, 7, 8] 로 길이가 8이고 n이 2이므로 num_list를 2 * 4 배열로 다음과 같이 변경합니다.
        2차원으로 바꿀 때에는 num_list의 원소들을 앞에서부터 n개씩 나눠 2차원 배열로 변경합니다.
        */

        int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8};
        int n=2;

        int[][] answer = new int[num_list.length/n][n];
        // 행은 n개씩 나누어서 만들기위해서 list 에서 n나눈값 열은 n 으로 선언
        int count=0; // numlist 값을 가져올때 사용할 index

        //행의 길이만큼 담아야하니 그 길이만큼의 반복문 돌리기
        for(int i=0;i<num_list.length/n;i++){
            for (int j=0;j<n;j++){ // 반복문을 하나더 선언
                answer[i][j]=num_list[count++];//한개씩 대입 0번째 1번째를 나누기위한 count
            }
        }
        System.out.println(answer);
    }
}

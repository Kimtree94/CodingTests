public class 가까운수_프로그래머스 {
    public static void main(String[] args) {
        int [] array = {3, 10, 28};
        int n = 20;
        int answer= 0;

       /* for(int i=0;i<array.length;i++){
            answer = (array[i]-1) - n;
        }*/

        answer=array[3]-n;
        System.out.println(answer);
    }
}

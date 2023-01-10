import java.util.Scanner;

public class 직삼각형_출력하기_프로그래머스 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int s=1;s<=i;s++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

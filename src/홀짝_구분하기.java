import java.util.Scanner;

public class 홀짝_구분하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2 ==0){
            System.out.println("is enven");
        } else if (n%2>=0) {
            System.out.println("is odd");
        }
    }
}
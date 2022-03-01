import java.util.Scanner;

public class BAEKJOON10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();

        for(int i=0;i<T;i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            
            int result = A+B;
            System.out.println(result);
        }
        sc.close();

    }
}

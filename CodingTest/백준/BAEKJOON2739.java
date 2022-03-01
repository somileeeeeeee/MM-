import java.util.Scanner;

public class BAEKJOON2739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();

        for(int i=1;i<10;i++) {
            System.out.println(n + " * " + i +" = "+n*i);
        }
    }
    
}

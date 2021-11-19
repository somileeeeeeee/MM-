import java.util.Scanner;

public class BAEKJOON1008 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        // Double 형이 아닌 int일 경우, int의 반올림때문에 틀린답이 됨.
        Double A = sc.nextDouble();
        Double B = sc.nextDouble();

        System.out.println(A/B);
        sc.close();
    }
}

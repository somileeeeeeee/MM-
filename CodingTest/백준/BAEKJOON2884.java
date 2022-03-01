import java.util.Scanner;

public class BAEKJOON2884 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();

        sc.close();

        if(M<45) {
            H=H-1;
            M=M+15;

            if(H<0) {
                H = 23;
            }
            System.out.println(H+" "+M);
        }
        else {
            M=M-45;
            System.out.print(H+" "+M);
        }
    }   
}

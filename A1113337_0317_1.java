import java.util.*;

public class A1113337_0317_1{
    public static void main(String[] argv){

        Scanner sc = new Scanner(System.in);

        int [][] a;

        System.out.println("請輸入第一次數字");
        int n = sc.nextInt();
        System.out.println("請輸入第二位數字");
        int m = sc.nextInt();

        a = new int[n][m];

        for(int b = 0; b < a.length; b++){
            for(int c = 0; c < a[b].length; c++){
                a[b][c] = (b+1)*(c+1);
                System.out.println((b + 1) +" * "+ (c + 1) + " = " + a[b][c]);
            }
        }

    }
}
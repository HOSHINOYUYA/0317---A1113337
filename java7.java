import java.util.*;
public class java7 {
    public static void main(String[] argv){

        Scanner sc = new Scanner(System.in);

        double [] students;
        students = new double[5];

        int sum = 0;
        for (int a = 0; a < students.length; a++){
            System.out.println("請輸入第" + a + "位學生的成績");
            students[a] = sc.nextInt();
            sum += students[a];
        }
    
        int ave = sum / students.length;
        System.out.println("學生們的成績平均是" + ave);

        int [][] b = new int [3][4];
        
        for(int A = 0; A < b.length; A++){
            for(int B = 0; B < b[A].length; B++){

                System.out.println("請輸入第"+ (A+1) + "組的第"+(B+1)+"次要素" );
                b[A][B] = sc.nextInt();
            }
        }
        for(int C = 0; C < b.length; C++){
            for(int D = 0; D < b[C].length; D++){
                System.out.println("[" + C + "]的" + "[" + D + "]次是"+ b[C][D]);
            }
        }

    }
}
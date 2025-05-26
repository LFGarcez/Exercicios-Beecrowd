import java.util.Scanner;
public class Ex1074 {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i = 0; i < N; i++){
            int X = sc.nextInt();

            if (X % 2 == 0 && X > 0){
                System.out.println("EVEN POSITIVE");
            }else if(X % 2 == 0 && X < 0){
                System.out.println("EVEN NEGATIVE");
            }
            if (X % 2 != 0 && X > 0){
                System.out.println("ODD POSITIVE");
                
            } else if (X % 2 != 0 && X < 0){
                System.out.println("ODD NEGATIVE");
            }
            if(X == 0){
                System.out.println("NULL");
            }
        }

        sc.close();
    }
}

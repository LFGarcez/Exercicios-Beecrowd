import java.util.Scanner;
public class Ex1073 {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double quadrado = 0;

        for(int i = 1; i <= N; i++){
            if(i % 2 == 0){
                quadrado = Math.pow(i,2);

                System.out.printf("%d^2 = %.0f%n", i, quadrado);
            }
        }
        sc.close();
    }    
}

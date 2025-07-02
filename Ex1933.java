import java.util.Scanner;

public class Ex1933 {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();        
        int resultado;
        
        if (A == B) {
            resultado = A;

        } else if (A > B) {
            resultado = A; 

        } else {
            resultado = B; 
        }

        System.out.println(resultado);

        sc.close();
    }
}

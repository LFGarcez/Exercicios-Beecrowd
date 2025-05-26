import java.util.Scanner;
public class Ex1065{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);

        int cont = 0;
        int n;

        for(int i = 0; i < 5; i++){
            n = sc.nextInt();
            if(n % 2 == 0){
                cont++;
            }
        }
        System.out.println(cont + " valores pares");

        sc.close();
    }
}
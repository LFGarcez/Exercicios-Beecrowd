import java.util.Scanner;
public class Ex1066 {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);

        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;

        for(int i = 0; i < 5; i++){
            int n = sc.nextInt();
            if(n % 2 == 0){
                cont1 ++;

            } else if (n % 2 != 0){
                cont2 ++;
            }
            if (n > 0){
                cont3 ++;

            } else if(n < 0){
                cont4 ++;
            }
        }

        System.out.println(cont1 + " valor(es) par(es)");
        System.out.println(cont2 + " valor(es) impar(es)");
        System.out.println(cont3 + " valor(es) positivo(s)");
        System.out.println(cont4 + " valor(es) negativo(s)");

        sc.close();
    }    
}

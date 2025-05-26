import java.util.Scanner;
import java.util.Locale;

public class Ex1051 {
    public static void main(String args []){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double renda = sc.nextDouble();
        double imposto;

        if(renda <= 2000.00){
            System.out.println("Isento");

        } else if (renda > 2000.00 && renda <= 3000.00 ){
            imposto = (renda - 2000) * 0.08;
            System.out.printf("R$ %.2f%n", imposto);

        } else if (renda > 3000 && renda <= 4500){
            imposto = (1000 * 0.08) + ((renda - 3000) * 0.18);
            System.out.printf("R$ %.2f%n", imposto);

        } else{
            imposto = (1000 * 0.08) + (1500 * 0.18) + ((renda - 4500) * 0.28);
            System.out.printf("R$ %.2f%n", imposto);
        }


        sc.close();
    }    
}

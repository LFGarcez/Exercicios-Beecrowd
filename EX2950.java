import java.util.Locale;
import java.util.Scanner;

public class EX2950 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double N = sc.nextInt();
        double X = sc.nextInt();
        double Y = sc.nextInt();
        double Result1;

        Result1 = N / (X + Y);
        

        System.out.printf("%.2f%n", Result1);


        sc.close();
    }    
}

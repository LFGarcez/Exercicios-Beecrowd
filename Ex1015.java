import java.util.Scanner;
import java.util.Locale; 

public class Ex1015 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Locale.setDefault(Locale.US);

        float x1 = sc.nextFloat();
        float y1 = sc.nextFloat();
        float x2 = sc.nextFloat();
        float y2 = sc.nextFloat();

        double Distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.printf("%.4f%n", Distancia);
        sc.close();
    }
    
}

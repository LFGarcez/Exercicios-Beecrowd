import java.util.Scanner;

public class Ex2551 {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        
        int n; //numero de treinos 
        double t; //tempo
        double dist; //distancia 
        double vm; //velocidade media
        double recorde;
        
        try {
            while (true){
                n = sc.nextInt();
                recorde = 0;
                
                for(int i = 1; i <= n; i++) {
                    t = sc.nextDouble();
                    dist = sc.nextDouble();
                
                    vm = dist / t;

                    if (vm > recorde) {
                        System.out.println(i);     
                        recorde = vm;
                    }
                }
            }

        } catch (Exception e) {
            
        }

        sc.close();
    }
}

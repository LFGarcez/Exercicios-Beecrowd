import java.util.Scanner;

public class Ex2782 {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int esc = 1; //escadinha
        int num[] = new int[n];
        int difant;
        int difnow;

        for(int i = 0; i < n; i++){
            num[i] = sc.nextInt();
        }

        

        for(int i = 2; i < n; i++){
            difant = num[i-1] - num[i-2];
            difnow = num[i] - num[i-1];
            
            if(difant != difnow){
                esc ++;
            }
        }

        System.out.println(esc);

        sc.close();
    }    
}

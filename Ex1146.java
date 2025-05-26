import java.util.Scanner;
public class Ex1146{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        
        while(true){
            int n = sc.nextInt();
            
            if(n == 0){
                break;
            }

             String resultado = "";
        
        for(int i = 1; i <= n; i++){
            resultado += i;
            if (i < n) { 
                resultado += " ";
            }
        }

        System.out.println(resultado);
    }
            
        sc.close();
    
    }
}
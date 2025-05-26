import java.util.Scanner;
public class Ex1071 {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();
        int soma = 0;

        if(X > Y){
            for(int i = Y + 1; i < X; i++){
                if(i % 2 != 0){
                    soma += i;
                }
            }
            System.out.println(soma);

        } else if (X < Y){
            for(int i = X + 1; i < Y; i++){
                if(i % 2 != 0){
                    soma += i;
                }
            }
            System.out.println(soma);
        }
        if(X == Y){
            System.out.println("0");
        }

        sc.close();  
    }
}

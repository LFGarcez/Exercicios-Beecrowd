import java.util.Scanner;
public class Ex1070 {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();

        for(int i = X; i <= X + 11; i ++){
            if( i % 2 != 0){
                System.out.println(i);
            }
        }

        sc.close();
    }
}

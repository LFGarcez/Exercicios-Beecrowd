import java.util.Scanner;

public class Ex2003 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String horario;
        int hora, min;
        int chegada, atraso;    

        try {
            while (true) {
                horario = sc.nextLine();
                
                String[] partes = horario.split(":");
                hora = Integer.parseInt(partes[0]);
                min = Integer.parseInt(partes[1]);

                chegada = (hora * 60 + min) + 60;
                atraso = chegada - 480;

                if(atraso < 0){
                    atraso = 0;
                }

                System.out.println("Atraso maximo: " + atraso);
            }
            
        } catch (Exception e) {
            
        }    



        sc.close();
    }    
}

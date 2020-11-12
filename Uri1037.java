import java.util.Scanner;
public class Uri1037{
    public static void main (String args[]){
       Scanner teclado = new Scanner(System.in);

       double num;

       // entrada

       num = teclado.nextDouble();

       // processamento e saída

       if (num >= 0 && num <= 25.000){
           System.out.println ("Intervalo [0,25]");
       }
       else if (num > 25.000 && num <= 50.000){
           System.out.println ("Intervalo (25,50]");
       }
       else if (num > 50.000 && num <= 75.000){
           System.out.println ("Intervalo (50,75]");
       }
       else if (num > 75.000 && num <= 100.000){
           System.out.println ("Intervalo (75,100]");
       }
       else {
           System.out.println("Fora de intervalo");
       }
    }
}


import java.util.Scanner;
public class Uri1006{
    public static void main (String args[]){
       Scanner teclado = new Scanner(System.in);

      Double A, B, C, X, MEDIA;

      // ENTRADA

      A = teclado.nextDouble(); 
      B = teclado.nextDouble();
      C = teclado.nextDouble();

      // PROCESSAMENTO

      MEDIA = A*0.2 + B*0.3 + C*0.5;
      X = MEDIA/100;

      // SAIDA

      System.out.printf("MEDIA = %.1f\n",MEDIA);


    }

}
import java.util.Scanner;
public class Uri1003{
    public static void main (String args[]){
       Scanner teclado = new Scanner(System.in);
       int A, B, SOMA;

       // entrada

       //System.out.println("Digite um numero inteiro = ");
       A = teclado.nextInt();

       //System.out.println("Digite mais um numero inteiro = ");
       B = teclado.nextInt();

       //processamento

       SOMA = A + B;

       // Saída

       System.out.println("x = "+SOMA);


    }
}

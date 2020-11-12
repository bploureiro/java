import java.util.Scanner;
public class Uri1010{
    public static void main (String args[]){
       Scanner teclado = new Scanner(System.in);

     int codPeca1, numPeca1; 
     Double valorPeca1;
     int codPeca2, numPeca2;
     Double valorPeca2;
     Double resultado;

     // entrada

     codPeca1 = teclado.nextInt();
     numPeca1 = teclado.nextInt();
     valorPeca1 = teclado.nextDouble();

     codPeca2 = teclado.nextInt();
     numPeca2 = teclado.nextInt();
     valorPeca2 = teclado.nextDouble();

     // processamento

     resultado = numPeca1*valorPeca1 + numPeca2*valorPeca2;

     // saída

     System.out.printf ("VALOR A PAGAR: R$ %.2f\n ",resultado);
     




    }

}

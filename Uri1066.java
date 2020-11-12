import java.util.Scanner;
public class Uri1066{
    public static void main (String args[]){
       Scanner teclado = new Scanner(System.in);

       Float numero;
       int qtePosi = 0;
       int qteNeg = 0;
       int qtePares = 0;
       int qteImpares = 0;

       for (int cont=1; cont <= 5; cont++ ){
           numero = teclado.nextFloat();
           if (numero > 0){
               qtePosi++;
           }
           else if (numero < 0){
               qteNeg++;
           }
           
           if (numero % 2 == 0){
               qtePares++;
           }
           else if (numero % 2 != 0){
               qteImpares++;
           }

       }

       System.out.println(qtePares+" valor(es) par(es)");
       System.out.println(qteImpares+" valor(es) impar(es)");
       System.out.println(qtePosi+" valor(es) positivo(s)");
       System.out.println(qteNeg+" valor(es) negativo(s)");


    }
}

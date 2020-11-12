import java.util.Scanner;
public class Uri1065{
    public static void main (String args[]){
       Scanner teclado = new Scanner(System.in);

       float numero;
       int qtdePares = 0;

       for (int cont=1; cont <=5; cont++){
           numero = teclado.nextFloat();
           if (numero % 2 == 0){
               qtdePares++;
           }

       }
         System.out.println (qtdePares+" valores pares");

    }

}



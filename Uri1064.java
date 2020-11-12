import java.util.Scanner;
public class Uri1064{
    public static void main (String args[]){
       Scanner teclado = new Scanner(System.in);

       float numero;
       float somatoria = 0; // somatória dos valores positivos
       float media;         // media dos valores positivos
       int qtdePositivos = 0; // variavel pque vai contar quantos poisitivos

       // sei contar até 6?
       for (int cont=1; cont<=6; cont++){
           numero = teclado.nextFloat();
           if (numero >0){
               qtdePositivos++;
               somatoria =  somatoria + numero;
           }
       }

       media =  somatoria / qtdePositivos;

       System.out.println(qtdePositivos+" valores positivos");
       System.out.println(media);


    }
}


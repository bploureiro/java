import java.util.Scanner;
public class Uri1050{
    public static void main (String args[]){
       Scanner teclado = new Scanner(System.in);

       int codDDD;

       codDDD = teclado.nextInt();

       if (codDDD == 61){
           System.out.println("Brasilia");
       }
       else if (codDDD == 71){
           System.out.println("Salvador");
       }
       else if (codDDD == 11){
           System.out.println("Sao Paulo");
       }
       else if (codDDD == 21){
           System.out.println("Rio de Janeiro");
       }
       else if (codDDD == 32){
           System.out.println("Juiz de Fora");
       }
       else if  (codDDD == 19){
           System.out.println("Campinas");
       }
       else if (codDDD == 27){
           System.out.println("Vitoria");
       }
       else if (codDDD == 31){
           System.out.println("Belo Horizonte");
       }
       else {

            System.out.println("DDD nao cadastrado");

       }      

    }
}



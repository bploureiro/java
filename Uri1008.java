import java.util.Scanner;
public class Uri1008{
    public static void main (String args[]){
       Scanner teclado = new Scanner(System.in);

       int NumFunc, HorasTr;
       Double Salario, resultado;

       // entrada

       NumFunc = teclado.nextInt();
       HorasTr = teclado.nextInt();
       Salario = teclado.nextDouble();

       // processamento

       resultado = (HorasTr * Salario);

       // saída

       System.out.println ("NUMBER = "+NumFunc);
       System.out.printf ("SALARY = U$ %.2f\n",resultado);

    }

}
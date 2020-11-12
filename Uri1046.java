import java.util.Scanner;
public class Uri1046{
    public static void main (String args[]){
       Scanner teclado = new Scanner(System.in);

       int horaInicial, horaFinal;
       int resultado, rNeg; 

       // entrada

       horaInicial = teclado.nextInt();
       horaFinal = teclado.nextInt();

       // processamento e saída

       resultado = horaFinal - horaInicial;

       if (resultado > 0){

           System.out.println ("O JOGO DUROU "+resultado+" HORA(S)");
        
       }
       else if (resultado == 0){
           System.out.println ("O JOGO DUROU 24 HORA(S)");
       }
       else if (resultado < 0){

           rNeg = 24 + resultado;
           System.out.println ("O JOGO DUROU "+rNeg+" HORA(S)");

       }
    }
}


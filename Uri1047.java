import java.util.Scanner;
public class Uri1047{
    public static void main (String args[]){
       Scanner teclado = new Scanner(System.in);

       int HI,MI,HF,MF;
       int HR, MR, Duracao;

       // entrada

       HI = teclado.nextInt();
       MI = teclado.nextInt();
       HF = teclado.nextInt();
       MF = teclado.nextInt();

       // processamento e saída

       Duracao = (HF*60 + MF) - (HI*60 + MI);

       if (Duracao <= 0){
           Duracao = Duracao + 24*60;
       } 
       
       HR = Duracao / 60;
       MR = Duracao % 60;

       System.out.println ("O JOGO DUROU "+HR+" HORA(S) E "+MR+" MINUTO(S)");
    }
}
       


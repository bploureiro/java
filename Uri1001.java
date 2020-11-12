import java.util.Scanner;
public class Uri1001{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int A, B, X;

        // entrada

        //System.out.println("Digite um numero inteiro = ");
        A = teclado.nextInt();
       
        //System.out.println("Digite mais um numero inteiro = ");
        B = teclado.nextInt();
        

        // processamento
        
        
        X = A + B;

        // saída
        System.out.println("X = "+X);
    }
}
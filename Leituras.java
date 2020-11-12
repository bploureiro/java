import java.util.Scanner; // declaro a importação da biblioteca

/*
Exemplo de leitura de dados via teclado
DETALHE: O Scanner utiliza como idioma padrão, o idioma da máquina. Isto significa que, por exemplo, ao usuário digitar
um número real (double ou float), o separados de casas decimais é o do idioma padrão (no nosso caso, português do Brasil,
é a vírgula -,).
*/

public class Leituras {
    public static void main(String args[]){

        // Preciso criar o componente
        Scanner teclado;
        teclado = new Scanner(System.in); // crio o componente apontando-o para 
                                          // o dispositivo de entrada padrão (teclado)

         
    int valorInteiro;
    float valorReal;
    System.out.println("Por favor, digite um numero inteiro");
    valorInteiro = teclado.nextInt();
    System.out.println("O valor inteiro : "+ valorInteiro +" foi digitado ");

    System.out.println("Agora digite um valor real:");
    valorReal = teclado.nextFloat();
    System.out.println("O valor real digitado vale "+valorReal);
    System.out.printf("O valor com 2 casas decimais: %.2f\n ", valorReal);
    



    }
}
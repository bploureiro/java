import java.util.Scanner;
public class Uri1134{
    public static void main (String args[]){
       Scanner teclado = new Scanner(System.in);

int item;
int alcool = 0;
int gasolina = 0;
int diesel = 0;

do{

    item = teclado.nextInt();

    if (item == 1){
        alcool = alcool + 1;
    }
    else if (item == 2){
        gasolina = gasolina + 1;
    }
    else if (item == 3){
        diesel = diesel + 1;
    }

}while (item != 4);

System.out.println("MUITO OBRIGADO");
System.out.println("Alcool: "+alcool);
System.out.println("Gasolina: "+gasolina);
System.out.println("Diesel: "+diesel);

    }
}

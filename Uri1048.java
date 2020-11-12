import java.util.Scanner;
public class Uri1048{
    public static void main (String args[]){
       Scanner teclado = new Scanner(System.in);

       Double salario;
       Double novoSalario, reajuste, percentual;

       // entrada

       salario = teclado.nextDouble();

       // processamento e saída

       if (salario >= 0 && salario <= 400){
           
           novoSalario = salario + salario * 0.15;
           reajuste = novoSalario - salario;
           
           System.out.printf ("Novo salario: %.2f\n",novoSalario);
           System.out.printf ("Reajuste ganho: %.2f\n ",reajuste);
           System.out.printf ("Em percentual: 15 %%\n");
       }
       else if(salario > 400 && salario <= 800){

           novoSalario = salario + salario * 0.12;
           reajuste = novoSalario - salario;
           
           System.out.printf ("Novo salario: %.2f\n",novoSalario);
           System.out.printf ("Reajuste ganho: %.2f\n ",reajuste);
           System.out.printf ("em percentual: 12 %%\n");
       }
       else if(salario > 800 && salario <= 1200){

           novoSalario = salario + salario * 0.10;
           reajuste = novoSalario - salario;
           
           System.out.printf ("Novo salario: %.2f\n",novoSalario);
           System.out.printf ("Reajuste ganho: %.2f\n ",reajuste);
           System.out.printf ("em percentual: 10 %%\n");

       }
       else if(salario > 1200 && salario <= 2000){

           novoSalario = salario + salario * 0.07;
           reajuste = novoSalario - salario;
           
           System.out.printf ("Novo salario: %.2f\n",novoSalario);
           System.out.printf ("Reajuste ganho: %.2f\n ",reajuste);
           System.out.printf ("em percentual: 7 %%\n");
       }
       else if(salario > 2000){

           novoSalario = salario + salario * 0.04;
           reajuste = novoSalario - salario;
           
           System.out.printf ("Novo salario: %.2f\n",novoSalario);
           System.out.printf ("Reajuste ganho: %.2f\n ",reajuste);
           System.out.printf ("em percentual: 4 %%\n");
       }

    }
}


import java.util.Scanner;
public class Uri1142{
    public static void main (String args[]){
       Scanner teclado = new Scanner(System.in);

       int n;
       int cont = 1;
      
      n = teclado.nextInt();

       do{


           if (cont % 4 != 0){

               System.out.print(cont+" ");
               
           }else {
               System.out.println("PUM");
           }
           cont = cont + 1;
           }while (cont <= 4*n);        

       }
    }



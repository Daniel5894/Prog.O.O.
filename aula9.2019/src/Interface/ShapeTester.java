package Interface;

import java.util.InputMismatchException;
import java.util.Scanner;
public class ShapeTester 
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
   boolean aux = true;
   do
   {
     try
     {	
    System.out.println("Ret�ngulo");

    System.out.println("Altura:");
	float altura = input.nextFloat();
	System.out.println("Base:");
	float base = input.nextFloat();
	Retangulo retangulo = new Retangulo(altura,base);
	retangulo.getPerimetro();
	retangulo.Imprimir();
	aux = false;
     }
   catch(InputMismatchException e1)
    {
    System.out.println("Digite apenas n�mero!");
    }
     finally
     {
    	 input.nextLine(); 
     }
   } while(aux == true);
  }
}

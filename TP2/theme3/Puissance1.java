
/*Puissance1.java, ce programme calcule un nombre (x) à la puissance n
 * 
 * les valeurs de x et n etant donner par l'utilisateur
 * 
 *   Author:     MBE TENE PROSPER
 */
import java.util.Scanner;
public class Puissance1 {
	public static void main(String[] args)
    {
      int n;
      double x;
      double res;
   Scanner sc = new Scanner(System.in);
      

      System.out.print("x = ");
      x = sc.nextFloat();
      System.out.print("n = ");
      
      n = sc.nextInt();

      System.out.print( "X^n = ");
    
      if (n == 0)
       	if (x >= 0)
	          System.out.println("1");
       	else
	          System.out.println("Pas défini");
      else // n != 0
       	if (n > 0) {
	           res = 1;
	           for (int i = 0; i < n; i++)
	              res = res * x;
	           System.out.printf("%.10f",res);
       	}
       	else // n < 0
	          if (x == 0) 
	             System.out.println("Pas défini");
	          else {
	             res = 1;
	             for (int i = n; i < 0; i++)
	               res = res * x;
	             System.out.printf("%.10f",1/res);
	          }
    }
}

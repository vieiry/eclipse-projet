
/*Puissance2.java , ce programme calcule un nombre (x) à la puissance n
 * 
 * les valeurs de x et n etant donner par l'utilisateur , il offre aussi
 * 
 *  la possiblitée de faire une autre partie
 * 
 *  Author:     MBE TENE PROSPER
 */
import java.util.Scanner;
public class Puissance2 {
	public static void main(String[] args)
    {
      int n;
      double x;
      double res;
   Scanner sc = new Scanner(System.in);
   String ch ="o";
      
   do {
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
	           System.out.printf("%f",res);
       	}
       	else // n < 0
	          if (x == 0) 
	             System.out.println("Pas défini");
	          else {
	             res = 1;
	             for (int i = n; i < 0; i++)
	               res = res * x;
	             System.out.println(1/res);
	          }
      System.out.println();
      System.out.print("voulez-vous faire un autre calcul O/N :");
      ch = sc.next();
    }while(!ch.equalsIgnoreCase("n"));
    }
}

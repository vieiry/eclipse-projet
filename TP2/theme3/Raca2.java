
/*Raca2.java , ce programme calcule la valeur approch�e de la  racine carree
 * 
 *  d'un reel A saisit au clavier a l'aide de la suite definit par :Un = U(n-1)+A/U(n-1).Il
 *  
 *  veriffie egalement que le reel saisit soit positif et < � 100
 * 
 * Author:     MBE TENE PROSPER
 * 
 */
import java.util.Scanner;
public class Raca2 {

	  public static final double EPS = 1E-5;

	  public static void main(String[] args)
	    {
		  Scanner sc = new Scanner(System.in);
	    
	      double A;

	      System.out.print("entrez un r�el (>= 1 et <= 100): ");
	      A = sc.nextDouble();
	      while ( (A < 1) || ( A > 100) ) {
	        System.out.println("ERREUR! valeur incorrecte ");
	        System.out.print("entrez un r�el (>= 1 et <= 100): ");
	        A = sc.nextDouble();
	      }

	      double UiMoins1 = A / 2;                      // u0
	      System.out.println("u0 " + UiMoins1);

	      int i = 1;
	      double Ui = 0.5 * (UiMoins1 + A / UiMoins1);  // u1

	      while ( Math.abs(Ui*Ui - A) >= EPS) {
		      System.out.println("u" + i + " " + Ui);
		      i++;
		      UiMoins1 = Ui;
	         Ui = 0.5 * (UiMoins1 + A / UiMoins1);
	      }
	      System.out.println("Valeur approch�e de la racine carr�e de " + A + 
	                 " : u" + i + " " + Ui);  
	    }
	  }

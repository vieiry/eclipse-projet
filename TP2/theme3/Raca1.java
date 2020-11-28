
/*Rac1.java, ce programme calcule la valeur approchée de la  racine carree
 * 
 *  d'un reel A saisit au clavier a l'aide de la suite definit par :Un = U(n-1)+A/U(n-1)
 * 
 * Author:     MBE TENE PROSPER
 */
import java.util.Scanner;
public class Raca1 {

	  public static final double EPS = 1E-5;

	  public static void main(String[] args)
	    {
		  Scanner sc = new Scanner(System.in);
	      double A;

	      System.out.println("entrez un réel : ");
	      A = sc.nextDouble();


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

	      System.out.println("Valeur approchée de la racine carrée de " + A + 
	                 " : u" + i + " " + Ui);
		  
	  }
	  
	}
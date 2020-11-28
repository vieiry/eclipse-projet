/** 
 *   programme de demonstration de la classe Scanner qui fournit
 *   des méthodes de lecture au clavier simples pour les
 *   types de données de base les plus courants.
 *
 *   @author Philippe.Genoud@imag.fr
 */

import java.util.Scanner;

public class ScannerDemo {
  
   public static void main(String[] args){
      
       Scanner sc = new Scanner(System.in);

	   System.out.print("entrez une chaine de caractères : ");
           String s = sc.next();
	   System.out.println("chaine lue : " + s);
	   
	   System.out.print("entrez un entier : ");
           int i = sc.nextInt();
	   System.out.println("entier lu : " + i);
	   
	   System.out.print("entrez un réel (float) : ");
           float f = sc.nextFloat();
	   System.out.println("réel (float) lu : " + f);
	   
	   System.out.print("entrez une réel (double) : ");
           double d = sc.nextDouble();
	   System.out.println("réel (double) lu : " + d);

	   System.out.print("entrez un booléen : ");
           boolean b = sc.nextBoolean();
	   System.out.println("booleen lu : " + b);

           System.out.print("entrez deux coordonnées x et y séparées par un espace : ");
           float x = sc.nextFloat();
           float y = sc.nextFloat();
	   System.out.println("x : " + x  + " y : " + y);

   }
}
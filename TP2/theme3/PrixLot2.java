
/*Prixlot2.java ,ce programe consiste pour l'utilisateur à découvrir par essais successifs le prix d'un lot 
 * 
 *en tirant un entier aléatoire entre 1 et 1000 avec la possibilite de rejouer une autre partie
 * 
 * Author:     MBE TENE PROSPER
 */
import java.util.Scanner;
public class PrixLot2 {
	public static void main(String[] args) {
		System.out.println("Le but est de chercher un prix entre 0 et 1000");
		long x = (long)(Math.random()*1000),ve;
		int i=0,j=1;
		String ch="o";
		Scanner sc = new Scanner(System.in);
		System.out.print("1ère partie. Nombre maximum d'essais : ");
		int nbe = sc.nextInt();
		
		while(ch.equalsIgnoreCase("o")) {
		j++;
		
		
		do {
			i++;
			System.out.print("Tapez un prix : ");
			ve = sc.nextLong();
			if(ve>x) {
				System.out.println("Trop grand");
			}else if(ve<x){
				System.out.println("Trop petit");
			}
			
		}while((ve!=x)&&(i<nbe));
		if((ve==x)) {
		System.out.println("BRAVO! vous avez gagné en "+i+" essais");
		}else {
			System.out.println("PERDU ! Vous avez épuisé le nombre d'essais autorisés");
			System.out.println("Le prix était : "+x);
		}
		System.out.println("Voulez-vous rejouer O/N ? ");
		ch = sc.next();
		if(ch.equalsIgnoreCase("o")) {
		System.out.print(j+"ieme partie. Nombre maximum d'essais : ");
		x = (long)(Math.random()*1000);
		nbe = sc.nextInt();
		i=0;}
	}
		if(ch.equalsIgnoreCase("n")) {
			System.out.println("Au revoir");
		}
		}
	

}


/*Prixlot1.java ,ce programe consiste à découvrir par essais successifs le prix d'un lot 
 * 
 * en tirant un entier aléatoire entre 1 et 1000
 * 
 * Author:     MBE TENE PROSPER
 */
import java.util.Scanner;
public class PrixLot1 {
	public static void main(String[] args) {
		System.out.println("Le but est de chercher un prix entre 0 et 1000");
		long x = (long)(Math.random()*1000),ve;
		int i=0;
		Scanner sc = new Scanner(System.in);
		do {
			i++;
			System.out.println("Tapez un prix : ");
			ve = sc.nextLong();
			if(ve>x) {
				System.out.println("Trop grand");
			}else if(ve<x){
				System.out.println("Trop petit");
			}
			
		}while(ve!=x);
		System.out.println("BRAVO! vous avez gagné en "+i+" essais");
	}
	

}

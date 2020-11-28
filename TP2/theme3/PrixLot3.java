
/*PrixLot3.java , ce programme est un jeux qui s'effectue en 20 parties .IL  tire au Hazard 
 * 
 *un prix entre 1 et 1000 dont le joueur doit trouver ,les roles de meneur 
 * 
 *et de joueur sont remplis par la machine ,Il affiche a la fin de chaque partie ,le prix tirée
 *
 *au sort et le nombre d'essais necessaire . A la fin , le programme calcule et affiche
 *
 *la moyenne des 20 nombres d'essais obtenus pour les 20 parties.
 *
 *  Author:     MBE TENE PROSPER
 */
import java.util.Scanner;
public class PrixLot3 {
	public static void main(String[] args) {
		System.out.println("Le but est de chercher un prix entre 0 et 1000");
		long x ;
		double moy,som=0;
		int i,j=1,vs=1000,vi=1,centre=500;
		Scanner sc = new Scanner(System.in);
	
		System.out.println("premiere partie ");
		for(j=2;j<=21;j++) {
			i=0;
			vs=1000;vi=1;centre=500;
		x = (long)(Math.random()*1000);
		do{
			if(centre>x) {
				vs=centre;
			
			}else if(centre<x) {
				vi=centre;
				
			}
			centre=(vs+vi)/2;
			i++;
		}while(centre!=x);
		System.out.println("le prix tiré au sort est : "+x);
		System.out.println("Nombre d'essais necessaires : "+i);
		som+=i;
		if(j!=21) {
			System.out.println();
		System.out.println(j+"ieme partie ");
		}}
	     moy=som/20;
	     System.out.println(" la moyenne des 20 nombres d'essais obtenus pour les 20 parties est : "+moy);
			System.out.println("Au revoir");}
		
		}
	



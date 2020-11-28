
/*MoyenneOlympique.java ,
 * lit au clavier une suite de nombres réels positifs ou nuls (correspondant à des notes),
 * 
 * terminée par la valeur -1, et calcule la moyenne olympique de ces valeurs, c'est à dire 
 * 
 * la moyenne des notes sans prendre en compte la note la plus élevée ni la note la moins élevée
 * 
 * Author:     MBE TENE PROSPER
 */
import java.util.Scanner;
public class MoyenneOlympique {
	public static double[] Aug_Tableau(double t[],int taille,double note) {
		double k[]=new double[taille+1];
		for(int i=1;i<taille;i++) {
			k[i]=t[i];
		}
		k[taille]=note;
		
		return k;
	}
	 public static void main(String[] args)
	    {
	Scanner sc = new Scanner(System.in);
	double note=1,moy=0,pp,pg,som=0;
	
	int i =0;
	double t[]= {0};
	while((note!=-1)&&(note>=0)) {
	 System.out.print("donnez une note (>=0 ou -1 pour arreter): ");
	 note = sc.nextDouble();
	 i++;
		 t = Aug_Tableau(t,i,note);
	
	 if((note==-1)||(note<=0)) {
		 pp=t[1];
		 pg=t[1];
			for(int j=1;j<i;j++) {
			if(t[j]<pp) {
				pp=t[j];
			}
			if(t[j]>pg) {
				pg=t[j];
			}
			}
			System.out.println("La note la plus élevée ("+pg+")et la note plus basse ("+pp+") ont été retirées"); 
			int j;
			for( j=1;j<i;j++) {
				if((t[j]!=pg)&&(t[j]!=pp)) {
					som += t[j];
				}
			}
			moy=som/(j-3);
			System.out.println("La moyenne olympique est :"+moy);
	 }
	
	 
	     }
	
	
	
}}
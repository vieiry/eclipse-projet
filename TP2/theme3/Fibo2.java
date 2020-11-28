
/*Fibo2.java , determine et affiche  le rang et la premiere valeur  de la suite superieure 
 * 
 *à une valeur entiere saisit au clavier 
 * 
 * 	Author:     MBE TENE PROSPER
 */
import java.util.Scanner;

public class Fibo2 {
	public static long Aug_tableau(int taille) {
		long t[]=new long[taille];
		t[0]=1;
		 t[1]=2;
		for(int i=2;i<taille;i++) {
			 t[i]=t[i-1]+t[i-2];
		 }
		return t[taille-1];
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("Salut je suis un proogramme qui implemente la suite de Fibonacie");
		 System.out.print(" veuillez entrez une valeur : ");
		 int v= sc.nextInt(),i=3;
		 if(v==1) {
			 System.out.println("La premiere valeur superieur a "+v+" est : 2 de rang "+2);
		 }else if(v==2) {
			 System.out.println("La premiere valeur superieur a "+v+" est : 3 de rang "+3);
		 }else {
		 long t[] = new long[2];
		 t[0]=1;
		 t[1]=2;
		 long vc=t[0];
		 while(v>=vc) {
			 vc=Aug_tableau(i);
			 i++;
			 
		 }
		
		 System.out.println("La premiere valeur superieur a "+v+" est : "+vc+" de rang "+(i-1));
	}}
}


/*Triangle.java , ce programme affiche un triangle a l'aide d'un motif (*)
 * 
 * et dont la base est determinnée par la taille qui  est fixée au depart par l'utilisateur 
 * 
 *  Author:     MBE TENE PROSPER
 */
import java.util.Scanner;
public class Triangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
String ch="*";
int taille,i=0;
System.out.print("Entrez la taille du motif : ");
taille = sc.nextInt();
do {
	
	System.out.println(ch);
	ch +="*";
	i++;
}while(i<taille);
}}

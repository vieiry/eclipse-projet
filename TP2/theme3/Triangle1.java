
/*Triangle.java , ce programme affiche un triangle a l'aide d'un motif (*)
 * 
 * et dont la base est determinnée par la taille qui  est fixée au depart par l'utilisateur.
 * 
 *  Author:     MBE TENE PROSPER
 */
import java.util.Scanner;
public class Triangle1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
String ch="*";
int taille;
System.out.print("Entrez la taille du motif : ");
taille = sc.nextInt();
int i=0;
while(i<taille) {
	System.out.println(ch);
	ch +="*";
	i++;
}
}}

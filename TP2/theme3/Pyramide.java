
/*Pyramide.java , ce programme lit au clavier la taille du motif
 * 
 * et affiche une  pyramide a l'aide du motif dont la base est 2 foix la taille du motif moins 1 
 * 
 */
import java.util.Scanner;
public class Pyramide {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
String ch="*",str=" ";
int taille;
System.out.print("Entrez la taille du motif : ");
taille = sc.nextInt();

for(int li=1;li<=taille;li++) {
	
	for(int k =1;k<=taille-li;k++) {
		System.out.print(str);
	}
	for(int j=0;j<2*li-1;j++) {
		System.out.print(ch);
		
	}
	
	System.out.println();
}
}}

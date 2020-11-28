
/*Hjms.java . Ce programme lit une
 * 
 * duree exprimée en seconde  et le 
 * 
 * convertit en nombre de jour,heure,minutes,secondes.
 * 
 * 	Author:     MBE TENE PROSPER
 */
import java.util.Scanner;
public class Hjms {
	public static void convertir(long s) {
		long jour = s/86400;
		s = s%86400;
		long heure = s/3600;
		s = s%3600;
		long min = s/60;
		s =( s%60);
		System.out.println("cette durre équivaut a  "+jour+" jours  "+heure+"  heures  "+min+" minutes "+s+" secondes");
		
	}
	public static void main(String[] args) {
System.out.println("donnez une durrée en secondes :");
Scanner sc = new Scanner(System.in);
long s = sc.nextLong();
convertir(s);

}}

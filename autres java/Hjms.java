import java.util.Scanner;
public class Hjms {
	public static void convertir(long s) {
		long jour = s/86400;
		s = s%86400;
		long heure = s/3600;
		s = s%3600;
		long min = s/60;
		s =( s%60);
		System.out.println("cette durée équivaut à "+jour+" jours  "+heure+"  heures  "+min+" minutes "+s+" secondes");
		
	}
	public static void main(String[] args) {
System.out.println("donnez une durée en secondes :");
Scanner sc = new Scanner(System.in);
long s = sc.nextLong();
convertir(s);

}}

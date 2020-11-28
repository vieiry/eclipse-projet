
/*Premier.java , teste si un nombre introduit par l'utilisateur est premier ou non.
 * 
 * Author:     MBE TENE PROSPER
 */
import java.util.Scanner;
public class Premier {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int i=0;
	int divs=2,div=2;
	String ch="o";
	while(ch.equalsIgnoreCase("o")) {
		System.out.println("donnez un entier positif : ");
		int nb = sc.nextInt();
		i=0;
		divs=2;div=2;
		while((divs<nb)) {
			
			if(nb % divs ==0) {
				i++;
				div=divs;
			}
			divs++;
		}
		
		if(i==0) {
			System.out.println(nb+" est un nombre premier");
		}else {
			System.out.println(nb+" n'est pas un nombre premier , il est divisible par : "+div);
		}
		
		 System.out.println("Voulez-vous essayer un autre nombre O/N ? : ");
		 ch=sc.next();
	if(ch.equalsIgnoreCase("n")) {
		System.out.println("Au revoir");
	}	 
	}
	
	
}
}

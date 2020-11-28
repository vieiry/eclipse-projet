
/*FIbo1.java , calcule le nieme terme de la suite de Fibonacie
 * 
 * n etant un entier saisit au clavier. la suite de Fibonacie est definit par 
 *
 * U1=1 , U2=2 ,Un=U(n-1) + U(n-2)
 * 
 *  Author:     MBE TENE PROSPER
 */

import java.util.Scanner;

public class Fibo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("Salut je suis un proogramme qui implemente la suite de Fibonacie");
		 System.out.print(" veuillez entrez le nieme terme (n est un enier superieur a 2) a calculer :");
		 int n= sc.nextInt();
		 if(n==1) {
			 System.out.println("Le 1er terme de la suite est 1");
		 }else if(n==2) {
			 System.out.println("Le  2iéme de la suite est 2");
		 }else if(n>=3) {
			 long t[] = new long[n];
			 t[0]=1;
			 t[1]=2;
			 for(int i=2;i<n;i++) {
				 t[i]=t[i-1]+t[i-2];
			 }
			 System.out.println("Le "+n+" ieme terme de la suite est "+t[n-1]);
		 }
		
	}
}


/*TroisNombres.java , ce programme demande trois nombres a l'utilisateur
 *
 * et les classe par ordre croissant 
 *
 *	Author:     MBE TENE PROSPER
 */
import java.util.Scanner;
import java.lang.*;

public class TroisNombres {
	public static void classement(int n1,int n2,int n3) {
		
		if((n1<=n2)&&(n2<=n3)) {
			int[]  t= {n1,n2,n3};
			for(int i=0;i<3;i++) {
				System.out.printf("%d \t",t[i]);
				}
				}
		else if((n2<=n1)&&(n1<=n3))	{
			int[]  t= {n2,n1,n3};
			for(int i=0;i<3;i++) {
				System.out.printf("%d \t",t[i]);
				}
		}
		else if((n3<=n1)&&(n1<=n2))	{
			int[]  t= {n3,n1,n2};
		}
		else if((n1<=n3)&&(n3<=n2))	{
			int[]  t= {n1,n3,n2};
			for(int i=0;i<3;i++) {
				System.out.printf("%d \t",t[i]);
				}
		}
		else if((n3<=n2)&&(n2<=n1))	{
			int[]  t= {n3,n2,n1};
			for(int i=0;i<3;i++) {
				System.out.printf("%d \t",t[i]);
				}
		}
		else if((n2<=n3)&&(n3<=n1))	{
			int[]  t= {n2,n3,n1};
			for(int i=0;i<3;i++) {
				System.out.printf("%d \t",t[i]);
				}
		}
		
		
	}
public static void main(String[] args) {
	System.out.println("1er nombre :");
	Scanner sc = new Scanner(System.in);
	int nb1 = sc.nextInt();
	System.out.println("2eme nombre :");
	int nb2 = sc.nextInt();
	System.out.println("3eme nombre :");
	int nb3 = sc.nextInt();
	System.out.println("les nombre dans l'ordre croissant :");
	classement(nb1,nb2,nb3);
}
}

import java.util.Scanner;
import java.lang.*;

	
	
public class Couronne {
	public static boolean appartient(double rI, double rE, double x,double y) {
		double d = Math.sqrt((x*x+y*y));
		if((rI<=d)&&(rE>=d)) {
			return true;
		}else {
			return false;
		}}
	
public static void main(String[] args) { 
	System.out.println("rayon exterieur : ");
	Scanner sc = new Scanner(System.in);
	float rE= sc.nextFloat();
	System.out.println("rayon interieur : ");
	float rI= sc.nextFloat();
	System.out.println("donnez un point x :  ");
	float x= sc.nextFloat();
	System.out.println(" y : ");
	float y= sc.nextFloat();
	boolean appartient = appartient(rI,rE,x,y);
	if(appartient) {
		System.out.println("ce point est dans la couronne ");
	}else {
		System.out.println("ce point n'est pas dans la couronne ");
	}
}
}

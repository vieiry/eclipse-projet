import java.util.Scanner;
public class Degres {
	public static float degreF(float F) {
		return (5*(F-32)/9);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	System.out .println("donnez une temperature en Fahrenheit :");
    float F = scanner.nextFloat();
    float C = 0;
    System.out .printf("\n %f\n ",F);
    	C =  degreF(F);
    System.out .printf("cette temperature equivaut a %.1f degres Celsius",C);
}}

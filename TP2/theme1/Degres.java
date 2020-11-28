
/* Degre.java .ce programme lit une
 *  
 * temperature en degre Fahrenheit et le
 * 
 * convertit en degre celcius
 * 
 * 	Author:     MBE TENE PROSPER
 */

import java.util.Scanner;
public class Degres {
	public static double degreF(float F) {
		return (5.0/9.0)*(F-32);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	System.out .println("donnez une temperature en Fahrenheit :");
    float F = scanner.nextFloat();
    double C = 0;
    System.out .printf("\n %f\n ",F);
    	C =  degreF(F);
    System.out .printf("cette temperature equivaut a %.1f degres Celsius",C);
}}

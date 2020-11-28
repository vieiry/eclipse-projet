/**
 * 
 */
package com;

/**
 * @author PROSPER
 *
 */
class Complex{
	
	private double imz;
	private double rez;

	public Complex(){
		this.imz = 0;
		this.rez = 0;
	}
	public Complex(double rez,double imz){
		this.setRez(rez);
		this.setImz(imz);
	}

	public double getImz() {
		return imz;
	}

	public void setImz(double imz) {
		this.imz = imz;
	}

	public double getRez() {
		return rez;
	}

	public void setRez(double rez) {
		this.rez = rez;
	}	
    public String toString(){
	    	
    	String result ;
	    	
    	if (imz > 0){
    		 result = getRez() + " + i" + getImz() ;
    	}else if(imz < 0){
    		 imz = -1*imz; //changement de signe pour une bonne affichage
    		 result = getRez() + " - i" + getImz() ;
    	}else{
    		 result = getRez()+"" ;
	    	}
    	return result;
    }
}

public class OpComplex {
	public Complex cpl3 ;// le complex qui recevra le resultat
	public double rez=0,imz=0, rez1,imz1,rez2,imz2,a,b;
	public String affichage="" ;


    public void addition(Complex cpl1,Complex cpl2){
    	rez1 = cpl1.getRez();
		imz1 = cpl1.getImz();
		rez2= cpl2.getRez();
		imz2 = cpl2.getImz();
		cpl3 = new Complex(0,0);
		a = imz1;
		b = imz2;
    	rez = rez1 + rez2;
    	cpl3.setRez(rez);
    	imz = imz1 + imz2;
    	cpl3.setImz(imz);
           //affichage
        if((a < 0)&&(b < 0)){
    		imz1 = -1*imz1; 															//changement de signe pour une bonne affichage
    		imz2 = -1*imz2; 															//changement de signe pour une bonne affichage
    		affichage = "("+rez1+ " - i" +imz1+ ") + (" +rez2+ " - i" +imz2+") = "+cpl3 ;
    	}else if(b < 0){
    		imz2 = -1*imz2; 															//changement de signe pour une bonne affichage
    		affichage = "("+rez1+ " + i" +imz1+ ") + (" +rez2+ " - i" +imz2+") = "+cpl3 ;
    	}else if(a < 0){
    		imz1 = -1*imz1; 															//changement de signe pour une bonne affichage
    		affichage = "("+rez1+ " - i" +imz1+ ") + (" +rez2+ " + i" +imz2+") = "+cpl3 ;
    	}else{
    	affichage = "("+rez1+ " + i" +imz1+ ") + (" +rez2+ " + i" +imz2+") = "+cpl3 ;
    	}
    	System.out.println(affichage);
    }
    
    public void soustraction(Complex cpl1,Complex cpl2){
    	rez1 = cpl1.getRez();
		imz1 = cpl1.getImz();
		rez2= cpl2.getRez();
		imz2 = cpl2.getImz();
		cpl3 = new Complex(0,0);
		a = imz1;
		b = imz2;
    	rez = rez1 - rez2;
    	cpl3.setRez(rez);
    	imz = imz1 - imz2;
    	cpl3.setImz(imz);
    	
    	//affichage
    	if((a < 0)&&(b < 0)){
    		imz1 = -1*imz1; 															//changement de signe pour une bonne affichage
    		imz2 = -1*imz2; 															//changement de signe pour une bonne affichage
      		affichage = "("+rez1+ " - i" +imz1+ ") - (" +rez2+ " - i" +imz2+") = "+cpl3 ;
      	}else if(b < 0){
      		imz2 = -1*imz2; 															//changement de signe pour une bonne affichage
      		affichage = "("+rez1+ " + i" +imz1+ ") - (" +rez2+ " - i" +imz2+") = "+cpl3 ;
      	}else if(a < 0){
      		imz1 = -1*imz1; 															//changement de signe pour une bonne affichage
      		affichage = "("+rez1+ " - i" +imz1+ ") - (" +rez2+ " + i" +imz2+") = "+cpl3 ;
      	}else{
      	affichage = "("+rez1+ " + i" +imz1+ ") - (" +rez2+ " + i" +imz2+") = "+cpl3 ;
      	}
      	System.out.println(affichage);
    	
    }
    
    public void multiplication(Complex cpl1,Complex cpl2){
    	rez1 = cpl1.getRez();
		imz1 = cpl1.getImz();
		rez2= cpl2.getRez();
		imz2 = cpl2.getImz();
		cpl3 = new Complex(0,0);
		a = imz1;
		b = imz2;
    	imz = imz1 * imz2;
    	imz = -1*imz;                          //pour changer son signe car i au caré c'est -1
    	rez = rez1 * rez2 + imz ;
    	cpl3.setRez(rez);
    	imz = rez1 * imz2 + imz1 * rez2;
    	cpl3.setImz(imz);
    	//affichage
    	if((a < 0)&&(b < 0)){
      		imz1 = -1*imz1; 															//changement de signe pour une bonne affichage
      		imz2 = -1*imz2; 															//changement de signe pour une bonne affichage
      		affichage = "("+rez1+ " - i" +imz1+ ") * (" +rez2+ " - i" +imz2+") = "+cpl3 ;
      	}else if(b < 0){
      		imz2 = -1*imz2; 															//changement de signe pour une bonne affichage
      		affichage = "("+rez1+ " + i" +imz1+ ") * (" +rez2+ " - i" +imz2+") = "+cpl3 ;
      	}else if(a < 0){
      		imz1 = -1*imz1; 															//changement de signe pour une bonne affichage
      		affichage = "("+rez1+ " - i" +imz1+ ") * (" +rez2+ " + i" +imz2+") = "+cpl3 ;
      	}else{
      	affichage = "("+rez1+ " + i" +imz1+ ") * (" +rez2+ " + i" +imz2+") = "+cpl3 ;
      	}
      	System.out.println(affichage);
    }
    
    public void division(Complex cpl1,Complex cpl2){
    	rez1 = cpl1.getRez();
		imz1 = cpl1.getImz();
		rez2= cpl2.getRez();
		imz2 = cpl2.getImz();
		cpl3 = new Complex(0,0);
		a = imz1;
		b = imz2;
    	double s = 1;
    	imz = imz1 * imz2;
    	rez = rez1 * rez2 + imz ;
    	s = rez2*rez2 + imz2*imz2 ;
    	rez = rez/s ;
    	cpl3.setRez(rez);
    	imz2 = -1*imz2;                        //pour changer son signe car on a conjugué et donc changer le signe de imz2
    	imz = rez1 * imz2 + imz1 * rez2;
    	imz = imz/s;
    	cpl3.setImz(imz);
        //affichages
    	imz2 = b;
        if((a < 0)&&(b < 0)){
      		imz1 = -1*imz1; 															//changement de signe pour une bonne affichage
      		imz2 = -1*imz2; 															//changement de signe pour une bonne affichage
      		affichage = "("+rez1+ " - i" +imz1+ ") / (" +rez2+ " - i" +imz2+") = "+cpl3 ;
      	}else if(b < 0){
      		imz2 = -1*imz2; 															//changement de signe pour une bonne affichage
      		affichage = "("+rez1+ " + i" +imz1+ ") / (" +rez2+ " - i" +imz2+") = "+cpl3 ;
      	}else if(a < 0){
      		imz1 = -1*imz1; 															//changement de signe pour une bonne affichage
      		affichage = "("+rez1+ " - i" +imz1+ ") / (" +rez2+ " + i" +imz2+") = "+cpl3 ;
      	}else{
      	affichage = "("+rez1+ " + i" +imz1+ ") / (" +rez2+ " + i" +imz2+") = "+cpl3 ;
      	}
      	System.out.println(affichage);
    }
   
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Complex c1 = new Complex(2,1);          // initialisation d'un nbre complexe avec pour reel 2 et pour imaginaire pure -1
     Complex c2 = new Complex(1,-2);          // initialisation d'un nbre complexe avec pour reel 1 et pour imaginaire pure -2
     OpComplex op = new OpComplex();          //initialisation de la classe qui realise les differents operations
     op.addition(c1,c2);                           //addition
     op.soustraction(c1,c2);                       //soustraction
     op.multiplication(c1,c2);                     //multiplication
     op.division(c1,c2);                           //division
	}

}

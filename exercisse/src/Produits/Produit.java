package Produits;
import java.util.ArrayList;

//================================================
abstract class Produit {

	private final double valeur;
	
	public Produit(double uneValeur){ valeur = uneValeur; }
	
	public Produit(){ valeur = 0.0; }
	
	public double prix(){ return valeur; }
	
	public String toString(){ return Double.toString(prix()); }
} 

//================================================
abstract class Accessoire extends Produit {
	private final String nom;
	
	public Accessoire(String unNom, double valeurDeBase){
	
		super(valeurDeBase);
		nom = unNom;
	}
	
	@Override
	public String toString(){
		String result = nom + " coutant ";
		result+=super.toString();
		return result;
	}

}

//================================================
class Bracelet extends Accessoire{
	
	public Bracelet(String unNom, double valeurDeBase){
		super("bracelet " + unNom, valeurDeBase);
	}
}

//================================================
class Fermoir extends Accessoire{
	public Fermoir(String unNom, double valeurDeBase){
		super("fermoir " + unNom, valeurDeBase);
	}
	
}


//================================================
class Boitier extends Accessoire{
	public Boitier(String unNom, double valeurDeBase){
		super("Boitier " + unNom, valeurDeBase);
	}
	
}


//================================================
class Vitre extends Accessoire{
	public Vitre(String unNom, double valeurDeBase){
		super("Vitre " + unNom, valeurDeBase);
	}
	
}


//================================================

class Mecanisme extends Produit{
	
}

//================================================
class MecanismeAnalogique extends Mecanisme{
	
}

//================================================
class MecanismeDigital extends Mecanisme{
	
}

//================================================
class MecanismeDouble extends Mecanisme{
	
}

//================================================
class Montre extends Produit{
	private Mecanisme coeur;
	private ArrayList<Accessoire> accessoires;
	
	public Montre(){
		accessoires = new ArrayList<Accessoire>();
	}
	
	public void ajouter(Accessoire accessoire){
		accessoires.add(accessoire);//on va revenir la
	}
	
	@Override
	public double prix(){
	//Au depart, le prix est le prix de base
		double prixFinal = super.prix();
		
		for(Accessoire acc : accessoires){
			prixFinal += acc.prix();
		}
		return prixFinal;
	}
	
	public void afficher (){
		System.out.print("Une montre ");
		System.out.println("composée de :");
		
		for (Accessoire acc : accessoires){
			System.out.println(" * " + acc);
		}
		System.out.print("===> Prix total : ");
		System.out.println(prix());
	}
}

//================================================
class Montres{
	public static void main(String args[]){
		Montre m = new Montre();
		
		m.ajouter(new Bracelet("cuir" , 54.0));
		m.ajouter(new Fermoir ("acier" , 12.5));
		m.ajouter(new Boitier ("acier" , 36.6));
		m.ajouter(new Vitre ("quartz" , 44.8));
		
		System.out.println('\n' + "Montre m :");
		
		m.afficher();
	}
}

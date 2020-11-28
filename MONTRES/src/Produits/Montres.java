package Produits;
import java.util.ArrayList;

//================================================
abstract class Produit {

	private final double valeur;
	
	public Produit(double uneValeur){ valeur = uneValeur; }
	
	public Produit(){ valeur = 0.0; }
	//a revoir certainnement
	public Produit(Produit autre){
		valeur = autre.valeur;
	}
	
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
	//
	public Accessoire(Accessoire autre){
		super(autre);
		nom = autre.nom;
		
	}
	
	// copie polymorphique d'accessoire
	public abstract Accessoire copie();
	
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
	public Bracelet(Bracelet autre){ super(autre); }
	//copie polymorphique de Bracelet
	@Override
	public Bracelet copie(){
		return new Bracelet(this);
	}
}

//================================================
class Fermoir extends Accessoire{
	public Fermoir(String unNom, double valeurDeBase){
		super("fermoir " + unNom, valeurDeBase);
	}
	public Fermoir(Fermoir autre){ super(autre); }
	//copie polymorphique de Bracelet
	@Override
	public Fermoir copie(){
		return new Fermoir(this);
	}
	
}


//================================================
class Boitier extends Accessoire{
	public Boitier(String unNom, double valeurDeBase){
		super("Boitier " + unNom, valeurDeBase);
	}
	public Boitier(Boitier autre){ super(autre); }
	//copie polymorphique de Bracelet
	@Override
	public Boitier copie(){
		return new Boitier(this);
	}
	
}


//================================================
class Vitre extends Accessoire{
	public Vitre(String unNom, double valeurDeBase){
		super("Vitre " + unNom, valeurDeBase);
	}
	public Vitre(Vitre autre){ super(autre); }
	//copie polymorphique de Bracelet
	@Override
	public Vitre copie(){
		return new Vitre(this);
	}
}


//================================================

abstract class Mecanisme extends Produit{
	private String heure;
	
	public Mecanisme(double valeurDeBase, String uneHeure){
		super(valeurDeBase);
		heure = uneHeure;
	}
	public Mecanisme(double valeurDeBase){
		super(valeurDeBase);
		heure = "12:00";
	}
	public Mecanisme(Mecanisme autre){
		super(autre);
		heure = autre.heure;
	}
	public final String toString(){
		String result = "mécanisme ";
		result += toStringType();
		result += "(affichage : ";
		result += toStringCadran();
		result += "), prix : ";
		result += super.toString();
		return result;
	}
//on veut offrir la version par défaut aux sous-classes et aux classes
//du meme paquetage, par défaut, on affiche juste l'heure,
	protected String toStringCadran(){
		return heure;
	}
//Un mécanisme, ici a ce niveau, est abstrait (=classe abstraite)
	protected abstract String toStringType();
	protected abstract Mecanisme copie();
}

//================================================
class MecanismeAnalogique extends Mecanisme{
	private int date;
	
	//constructeurs
	public MecanismeAnalogique(double valeurDeBase, String uneHeure, int uneDate){
		super(valeurDeBase, uneHeure);
		date = uneDate;
	}
	public MecanismeAnalogique(double valeurDeBase, int uneDate){
		super(valeurDeBase);
		date = uneDate;
	}
	public MecanismeAnalogique(MecanismeAnalogique autre) {
		super(autre);
		date = autre.date;
	}
	// Methodes
	@Override
	protected String toStringType(){
		return "Analogique";
	}
	
	@Override
	protected String toStringCadran(){
	//On affiche l'heure (facon de base)...
	//...et en plus la date.
		return super.toStringCadran() + ", " + this.date;
	}
	protected  MecanismeAnalogique copie(){
		return new MecanismeAnalogique(this);
	}
	
}

//================================================
interface ReveilDigital
{
	String toStringReveil();
}

//================================================
class MecanismeDigital extends Mecanisme implements ReveilDigital{
	private String reveil;
	
	public MecanismeDigital(double valeurDeBase, String uneHeure, String heureRev){
		super(valeurDeBase, uneHeure);
		reveil = heureRev;
	}
	public MecanismeDigital(MecanismeDigital autre) {
		super(autre);
		reveil = autre.reveil;
	}
	
	@Override
	protected String toStringType(){
		return "digital";
	}
	
	@Override
	protected String toStringCadran(){
	//On affiche l'heure (facon de base)...
	//...et en plus l'heure de reveil.
		return super.toStringCadran() + ", " + toStringReveil();
	}
	
	public String toStringReveil(){
		return "réveil " + reveil;
	}
	protected  MecanismeDigital copie(){
		return new MecanismeDigital(this);
	}
	
}

//Un mécanisme double est avant tout un mécanisme
//analogique auquel on ajoute des caractéristiques
//d'un mécanisme digital
//================================================
class MecanismeDouble extends MecanismeAnalogique implements ReveilDigital{
	
	//duplication incontournable ici
	private String reveil;
	
	public MecanismeDouble(double valeurDeBase, String uneHeure, int uneDate, String heureReveil){
		super(valeurDeBase, uneHeure, uneDate);
		reveil = heureReveil;
	}
	//gestion propre de la valeur par défaut de l'heure(super-classe)
	public MecanismeDouble(double valeurDeBase, int uneDate, String heureReveil){
	
		super(valeurDeBase, uneDate);
		reveil = heureReveil;
	}
	public MecanismeDouble(MecanismeDouble autre){
		super(autre);
		reveil = autre.reveil;
	}
	@Override
	protected String toStringType(){
		return "double";
	}
	
	@Override
	protected String toStringCadran(){
	//Par exemple...
		String result = "sur l'écran : ";
		result += super.toStringCadran();
		result += ", sous les aiguilles : ";
		result += toStringReveil();
		return result;
	}
	//propres aux mécanismes digitaux
	public String toStringReveil(){
		return "réveil " + reveil;
	}
	public MecanismeDouble copie(){
		return new MecanismeDouble(this);
	}
	
}

//================================================
class Montre extends Produit{
	private Mecanisme coeur;
	private ArrayList<Accessoire> accessoires;
	
	public Montre(){
		accessoires = new ArrayList<Accessoire>();
	}
	public Montre(Mecanisme depart){
		coeur = depart.copie();
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
		// test de l'affichage des mécanismes
		MecanismeAnalogique v1 = new MecanismeAnalogique(312.00, 20141212);
		MecanismeDigital    v2 = new MecanismeDigital(32.00, "11:45", "7:00");
		MecanismeDouble      v3 = new MecanismeDouble(543.00, "8:20", 20140328, "6:30");
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		
		// Test des montres
		Montre m = new Montre(new MecanismeDouble(468.00, "9:15", 20140401, "7:00"));
		
		m.ajouter(new Bracelet("cuir" , 54.0));
		m.ajouter(new Fermoir ("acier" , 12.5));
		m.ajouter(new Boitier ("acier" , 36.60));
		m.ajouter(new Vitre ("quartz" , 44.80));
		
		System.out.println('\n' + "Montre m :");
		
		m.afficher();
	}
}

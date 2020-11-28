import java.util.Scanner;



public class Gestion_Banque{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String choix ="1",nom,prenom;
		int adr,i=0 ;
		float solde;
		Banque banque = new Banque();
		while(!choix.equalsIgnoreCase("o")) {

		System.out.printf("\n\n\nPROGAMME DE GESTION DE COMPTE \n\n ACION A EFFECTUER\n\n");

		System.out.printf("1) creation d'un nouveau compte\n");
		System.out.printf(" \n2) crediter un compte\n");
		System.out.printf(" \n3) debiter un compte\n");
		System.out.printf(" \n4) calculer le revenu d'une personne\n");
		System.out.printf(" \n5) consulté tout les info d'un copte\n");
		System.out.printf(" \n6) Verifié le decouvert d'un compte\n");
		System.out.printf(" \n7) Effectuer un virement\n");
		System.out.printf(" \nAPPUYER SUR (o) pour quitter \n");
		choix = sc.next();
		
		switch(choix) {
		case("1"):{
			i++;
			System.out.printf("\n Nom du titulaire : ");
			nom = sc.next();
			System.out.printf("\n Prenom : ");
			prenom= sc.next();
			System.out.printf("\n Addresse : ");
			adr = sc.nextInt();
			System.out.printf("\n Solde Initial : ");
			solde = sc.nextFloat();
		    Personne pers = new Personne(nom,prenom,adr);
		    Compte cpt = new Compte(pers,solde);
            banque.ajouter(cpt,i);
		} break;
		case("2"):{
			System.out.printf("\n Numeros du compte : ");
			adr = sc.nextInt();
			adr=adr-1;
			System.out.printf("\n Valeur a crediter : ");
			solde =  sc.nextFloat();
			banque.Crediter(adr, solde);
		}break;
		case("3"):{
			System.out.printf("\n Numeros du compte : ");
			adr = sc.nextInt();
			adr=adr-1;
			System.out.printf("\n Valeur a debiter : ");
			solde =  sc.nextFloat();
			banque.Debiter(adr, solde);
			
		}break;
		case("4"):{
			System.out.printf("\n Nom du titulaire : ");
			nom = sc.next();
			System.out.printf("\n Prenom : ");
			prenom= sc.next();
			System.out.printf("\n Addresse : ");
			adr = sc.nextInt();
		    Personne pers = new Personne(nom,prenom,adr);
		    banque.revenu(pers);
			
		}break;
		case("5"):{
			System.out.printf("\n Numeros du compte : ");
			adr = sc.nextInt();
			adr=adr-1;
			banque.Debiter(adr, 0);
			banque.afficher(adr);
		}break;
		case("6"):{
			System.out.printf("\n Numeros du compte : ");
			adr = sc.nextInt();
			adr=adr-1;
			banque.decouvert(adr);
		}break;
		case("7"):{
			System.out.printf("\n Valeur du virement : ");
			float vv =  sc.nextFloat();
			System.out.printf("\n Numeros du compte a debiter : ");
			int num2 = sc.nextInt();
			num2=num2-1;
			System.out.printf("\n Numeros du compte a crediter : ");
			int num1 = sc.nextInt();
			num1=num1-1;	
			
		 banque.Virement(vv, num1, num2);
		 
		
		}break;
		case("o"):{
			System.out.printf("Fin du programme aurevoir!!");
		}break;
		case("O"):{
			System.out.printf("Fin du programme aurevoir!!");
		}break;
		default:
			{System.out.printf("\n Mauvais choix !!, veuillez reprendre: ");
			break;}
		}
		}
	}
}




class Banque{

	private static boolean fv;
	private Compte[] cpt;
public Banque(){//initialise un tableau de compte  traduisant le fait qu'une personne peut avoir plusieur compte
	}

// cette methode me permet d'augmenter manuellement la taille du taleau de compte 
public void ajouter(Compte cpte,int n_cpt) {
	Compte[] tc = new Compte[n_cpt];

	if(cpt!=null) {
	for(int i =0;i<cpt.length;i++) {
		tc[i] = cpt[i];
	}}
	
	tc[n_cpt-1] = cpte;
	
	cpt = new Compte[n_cpt];
	cpt = tc ;
}


public void Crediter(int numC,float vc) {
   if(cpt.length>numC) {
	   cpt[numC].Crediter_cpt(vc);
   }else {
	   System.out.printf("\n ce numero n'est pas affecté a un compte \n");
   }
}


public void Debiter(int numC,float vd) {
	   if(cpt.length>numC) {
		 fv = cpt[numC].Debiter_cpt(vd);
	   }else {
		   System.out.printf("\n ce numero n'est pas affecté a un compte \n");
		   fv = false;
	   }
	}

public void getSolde(int num) {
	if(cpt.length>num) {
		  System.out.println(cpt[num]);
	   }else {
		   System.out.printf("\n ce numero n'est pas affecté a un compte \n");
	   }
}


public void afficher(int num) {
	if(cpt.length>num) {
		   cpt[num].affiche();
	   }else {
		   System.out.printf("\n ce numero n'est pas affecté a un compte \n");
	   }	
}
public void decouvert(int num) {
	System.out.printf("votre decouvert est de : %f",cpt[num].adecouvert());
}

public void Virement(float vv , int num1,int num2) {
	
	Debiter(num2, vv);
	
	if(fv) {
		Crediter(num1, vv);
		System.out.printf("\n operation terminé ");
	}else {
		System.out.printf(" \n Impossible d'effectuer le virement \n");
	}
}
//calcule le revenu d'une personne
public void revenu(Personne pers) {
	float rev=0;
	
		for(int j = 0;j<cpt.length;j++) {
		if(cpt[j].pers.equals(pers)) {
			rev += cpt[j].getSolde();
		}
	}
		if(rev==0)
			System.out.printf(" \n cette personne n'existe pas dans la banque\n ");
		else
			System.out.printf("\n votre revenu est  de : %f FCFA \n",rev);
	
	
}
}



class Compte {
public static int num_cpt=0;
protected Personne pers;
private float solde,decouvert_cpt, debit_maxi,debit_autorisé,decouvert_maxi;

//constructeur ,cree un nouveau compte d'une personne en y mettant un solde
public Compte(Personne pers,float solde) {
	this.pers = pers;
	this.solde = solde;
	num_cpt++;
	decouvert_maxi = 50000;
	debit_maxi = 100000;
}
public Compte() {
	decouvert_maxi = 50000;
	debit_maxi = 100000; 
}

//affecte un numero a un compte
public void setNum_cpt(int i) {//
	num_cpt = i;
}

//Ajoute une valeur a un compte
public void Crediter_cpt(float vc) {
	if(vc>0)
	{solde+=vc;
	System.out.printf(" le compte N°: %d a bien ete credité ,le solde de ce compte vaut a present : %f FCFA \n",num_cpt,solde);}
	else {
		System.out.printf(" \n erreur!! la valeur saisit est negative !\n ");
	}
}

//retirer une valeur au compte
public boolean Debiter_cpt(float vd) {
	if((solde>=debit_maxi)||((decouvert_maxi+solde)>=debit_maxi)) {
		debit_autorisé = debit_maxi;
	}else {
		debit_autorisé = decouvert_maxi+solde;
	}
	if(vd<=debit_autorisé) {
		solde = solde-vd;
		
	System.out.printf(" \n le compte N°: %d a bien ete debité ,le solde de ce compte vaut a present : %f FCFA \n ",num_cpt,vd);
	return true;}
	else {
		System.out.printf(" \n impossible de debité le compte car cette valeur est superieur au debit autorisé :\n ");
		return false;
	}
}

//modifie le decouvert maximale autorise
public void setDecouvert_maxi(float d_m) {//
	
	decouvert_maxi = d_m;
}

//renvoit le debit maximale autorise
public void setDebit_maxi(float d_m) {//
	debit_maxi = d_m;
}

//verifie si le copte est a decouvert et renvoit sa valeur
public float adecouvert() {//
	
	if(solde>=0) {
		decouvert_cpt=0;
		return 0;}
	else{
		decouvert_cpt = Math.abs(solde);
	return decouvert_cpt;}
}

//affiche les informationsconcernant un compte
public void affiche() {
	pers.affiche();
	System.out.printf("\n NUMERO DU COMPTE : %d \n SOLDE : %f FCFA \n Decouvert maximale  : %f FCFA \n debit maximale : %f FCFA \n debit autorisé : %f FCFA  ",num_cpt,solde,decouvert_maxi, debit_maxi,debit_autorisé);
}

//affiche le solde du compte exprimé en FCFA
public double getSolde() {
	return solde;
}
public String toString(){
	return (+solde+" FCFA");
}
}
 


class Personne{
private String nom;
private String prenom;
private int adresse; 
public Personne(String nom,String prenom,int adresse) {//cree une nouvelle personne ,identifié par son nom , prenom ,addresse
	this.nom = nom; this.prenom = prenom; this.adresse = adresse;
}

public boolean equals(Personne pers) {
	return (nom.equalsIgnoreCase(pers.nom) && prenom.equalsIgnoreCase(pers.prenom) && adresse==pers.adresse);
}
//affiche les informations sur une personne specifique
public void affiche() {
	System.out.printf(" \n NOM : %s \n PRENOM : %s \n ADRESSE : %d\n",nom,prenom,adresse);
}
}
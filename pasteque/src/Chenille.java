
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;


public class Chenille {

protected Tete tete ;
protected ArrayList<Anneau> anneau = new ArrayList<Anneau>() ; 
private int x,y,r;

private int xhg = 0;
private int yhg = 0;
private Color couleur;



public Chenille(int x,int y,int r,int cap,Color couleur) {
	this.x = x;
	this.y = y;
	this.r=r;
	this.couleur=couleur;
	xhg=x/2;yhg=y/2;
	tete = new Tete(xhg,yhg,r,cap);
	
	for(int i=0;i<8;i++) {
		xhg-=r;
		anneau.add(new Anneau(xhg,yhg,r));
	}
}
	
   public void setR(int r) {
	   this.r=r;
	   tete.setR(r);
	   for (int i = 0; i < anneau.size(); i++)
		   anneau.get(i).setR(r);
		 
   }
   
   public int getR() {
	   return r;
   }
public void dessiner(Graphics g)
{
  g.setColor(couleur);
  tete.dessine(g);  
  for (int i = 0; i < anneau.size(); i++)
anneau.get(i).dessiner(g);
}


/**
* fait effectuer à la chenille un déplacement élémentaire en avant dans la direction indiquée
* par son cap. Le cap subit une déviation alétoire d'un angle de plus ou moins 30 degrés. Si 
* la tête de la chenille atteint un des bords , son cap est alors dévié de 90°.
*/
public void deplacer() {

if (tete.atteintBord(x,y))
  {tete.devierCap(25.0);
 // anneau.add(new Anneau(xhg,yhg,15));
  }
else 
	 tete.devierCap(-30.0 + Math.random()*60.0);

// fait avancer les anneaux.
// le ième anneau prends la place du (i-1)ème anneau, l'anneau 0 prenant la place
// de la tête

for (int i = anneau.size()-1; i > 0; i--) 
	anneau.get(i).placerA(anneau.get(i-1).getX(), anneau.get(i-1).getY());

anneau.get(0).placerA(tete.getX(),tete.getY());

// fait avancer la tête
tete.deplacerSelonCap();
}



}



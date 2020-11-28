
import java.awt.Graphics;

/**
 *
 * @author <a href="mailto: "Philippe Genoud</a>
 * @version
 */

public class Chenille  {

  //------- variables d'instance (attributs) --------------------------

  /**
   * tableau stockant les r�f�rences des anneaux de la chenille
   */
  private Anneau[] lesAnneaux;

  /**
   * la t�te de la chenille
   */
  private Tete laTete;

  /**
   * largeur de la z�ne de de dessin o� se d�place la chenille
   */
  private int largeur;

  /**
   * hauteur de la z�ne de de dessin o� se d�place la chenille
   */
  private int hauteur;

  //-------- Constructeurs ---------------------------------------------

  /**
   * cr�e une chenille en sp�cifiant la taille de la fen�tre dans laquelle
   * elle se d�place, le rayon et le nombre de ces anneaux.
   * @param largeur largeur de la fen�tre de dessin
   * @param hauteur hauteur de la fen�tre de dessin
   * @param r rayon des anneaux de la chenille
   * @param nbAnneaux nombre d'anneaux de la chenille
   */
  public Chenille(int largeur,int hauteur,  int r, int nbAnneaux)
    {
      this.largeur = largeur;
      this.hauteur = hauteur;
	
      // cr�e une t�te au centre de la fen�tre et de cap 0
      laTete = new Tete(largeur / 2,hauteur / 2, r ,  0.0);

      // cr�� les anneaux, � gauche les uns des autres. Le premier
      // (Anneau n� 0) �tant � gauche de la t�te

      int xTete = laTete.getX();
      int yTete = laTete.getY();
      // 1) cr�er le tableau
      lesAnneaux = new Anneau[nbAnneaux];
      // 2) remplir le tableau en cr�eant les anneau et en stockant
      //    leur r�f�rence dans les �l�ments du tableau.
      for (int i = 0; i < lesAnneaux.length; i++)
	lesAnneaux[i] = new Anneau(xTete - (i+1) * r, yTete, r);

    }

  /**
   * affiche la chenille.
   * @param g cet objet de classe Graphics pass� en param�tre est l'objet qui
   *  prend en charge la gestion de l'affichage dans la fen�tre de dessin. 
   * C'est cet objet qui g�re le "contexte graphique" pour cette fen�tre.
   */
  public void dessiner(Graphics g)
    {
      // dessiner la t�te
      laTete.dessiner(g);
      // puis dessiner chacun des anneaux
      for (int i = 0; i < lesAnneaux.length; i++)
	lesAnneaux[i].dessiner(g);
    }


  /**
   * fait effectuer � la chenille un d�placement �l�mentaire en avant dans la direction indiqu�e
   * par son cap. Le cap subit une d�viation al�toire d'un angle de plus ou moins 30 degr�s. Si 
   * la t�te de la chenille atteint un des bords , son cap est alors d�vi� de 90�.
   */
  public void deplacer() {
 
    if (laTete.atteintBord(largeur,hauteur))
      laTete.devierCap(90.0);
    else
      laTete.devierCap(-30.0 + Math.random()*60.0);

    // fait avancer les anneaux.
    // le i�me anneau prends la place du (i-1)�me anneau, l'anneau 0 prenant la place
    // de la t�te
    for (int i = lesAnneaux.length -1; i > 0; i--)
      lesAnneaux[i].placerA(lesAnneaux[i-1].getX(), lesAnneaux[i-1].getY());

    lesAnneaux[0].placerA(laTete.getX(),laTete.getY());

    // fait avancer la t�te
    laTete.deplacerSelonCap();
  }		

}// Chenille

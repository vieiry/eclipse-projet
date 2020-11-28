
import java.awt.Graphics;

/**
 *
 * @author <a href="mailto: "Philippe Genoud</a>
 * @version
 */

public class Chenille  {

  //------- variables d'instance (attributs) --------------------------

  /**
   * tableau stockant les références des anneaux de la chenille
   */
  private Anneau[] lesAnneaux;

  /**
   * la tête de la chenille
   */
  private Tete laTete;

  /**
   * largeur de la zône de de dessin où se déplace la chenille
   */
  private int largeur;

  /**
   * hauteur de la zône de de dessin où se déplace la chenille
   */
  private int hauteur;

  //-------- Constructeurs ---------------------------------------------

  /**
   * crée une chenille en spécifiant la taille de la fenêtre dans laquelle
   * elle se déplace, le rayon et le nombre de ces anneaux.
   * @param largeur largeur de la fenêtre de dessin
   * @param hauteur hauteur de la fenêtre de dessin
   * @param r rayon des anneaux de la chenille
   * @param nbAnneaux nombre d'anneaux de la chenille
   */
  public Chenille(int largeur,int hauteur,  int r, int nbAnneaux)
    {
      this.largeur = largeur;
      this.hauteur = hauteur;
	
      // crée une tête au centre de la fenêtre et de cap 0
      laTete = new Tete(largeur / 2,hauteur / 2, r ,  0.0);

      // créé les anneaux, à gauche les uns des autres. Le premier
      // (Anneau n° 0) étant à gauche de la tête

      int xTete = laTete.getX();
      int yTete = laTete.getY();
      // 1) créer le tableau
      lesAnneaux = new Anneau[nbAnneaux];
      // 2) remplir le tableau en créeant les anneau et en stockant
      //    leur référence dans les éléments du tableau.
      for (int i = 0; i < lesAnneaux.length; i++)
	lesAnneaux[i] = new Anneau(xTete - (i+1) * r, yTete, r);

    }

  /**
   * affiche la chenille.
   * @param g cet objet de classe Graphics passé en paramètre est l'objet qui
   *  prend en charge la gestion de l'affichage dans la fenêtre de dessin. 
   * C'est cet objet qui gère le "contexte graphique" pour cette fenêtre.
   */
  public void dessiner(Graphics g)
    {
      // dessiner la tête
      laTete.dessiner(g);
      // puis dessiner chacun des anneaux
      for (int i = 0; i < lesAnneaux.length; i++)
	lesAnneaux[i].dessiner(g);
    }


  /**
   * fait effectuer à la chenille un déplacement élémentaire en avant dans la direction indiquée
   * par son cap. Le cap subit une déviation alétoire d'un angle de plus ou moins 30 degrés. Si 
   * la tête de la chenille atteint un des bords , son cap est alors dévié de 90°.
   */
  public void deplacer() {
 
    if (laTete.atteintBord(largeur,hauteur))
      laTete.devierCap(90.0);
    else
      laTete.devierCap(-30.0 + Math.random()*60.0);

    // fait avancer les anneaux.
    // le ième anneau prends la place du (i-1)ème anneau, l'anneau 0 prenant la place
    // de la tête
    for (int i = lesAnneaux.length -1; i > 0; i--)
      lesAnneaux[i].placerA(lesAnneaux[i-1].getX(), lesAnneaux[i-1].getY());

    lesAnneaux[0].placerA(laTete.getX(),laTete.getY());

    // fait avancer la tête
    laTete.deplacerSelonCap();
  }		

}// Chenille

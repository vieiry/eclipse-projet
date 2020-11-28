
import java.awt.Graphics;
import java.awt.Color;

/**
 * Une esp�ce particuli�re de chenilles. Les chenilles color�es.
 *
 * @author <a href="mailto: "Philippe Genoud</a>
 * @version
 */

public class ChenilleCouleur extends Chenille  {

  /**
   * La couleur de la chenille
   */
  private Color couleur;

  //-------- Constructeurs ---------------------------------------------

  /**
   * cr�e une chenille en sp�cifiant la taille de la fen�tre dans laquelle
   * elle se d�place, le rayon et le nombre de ces anneaux.
   * @param largeur largeur de la fen�tre de dessin
   * @param hauteur hauteur de la fen�tre de dessin
   * @param r rayon des anneaux de la chenille
   * @param nbAnneaux nombre d'anneaux de la chenille
   * @param coul la couleur de la chenille
   */
  public ChenilleCouleur(int largeur,int hauteur,  int r, int nbAnneaux, Color coul)
    {
      super(largeur,hauteur,r,nbAnneaux);
      couleur = coul;
    }

  /**
   * affiche la chenille.
   * @param g cet objet de classe Graphics pass� en param�tre est l'objet qui
   *  prend en charge la gestion de l'affichage dans la fen�tre de dessin. 
   * C'est cet objet qui g�re le "contexte graphique" pour cette fen�tre.
   */
  public void dessiner(Graphics g)
    {
      // sauvegarde de la couleur courante du contexte graphique
      Color c = g.getColor();

      // change la couleur de trac� avec la couleur de cette chenille
      g.setColor(couleur);
      
      // dessine la chenille
      super.dessiner(g);

      // restitue la couleur initiale du contexte graphique
      g.setColor(c);
    }

}// ChenilleCouleur

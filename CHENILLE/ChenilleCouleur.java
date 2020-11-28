
import java.awt.Graphics;
import java.awt.Color;

/**
 * Une espèce particulière de chenilles. Les chenilles colorées.
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
   * crée une chenille en spécifiant la taille de la fenêtre dans laquelle
   * elle se déplace, le rayon et le nombre de ces anneaux.
   * @param largeur largeur de la fenêtre de dessin
   * @param hauteur hauteur de la fenêtre de dessin
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
   * @param g cet objet de classe Graphics passé en paramètre est l'objet qui
   *  prend en charge la gestion de l'affichage dans la fenêtre de dessin. 
   * C'est cet objet qui gère le "contexte graphique" pour cette fenêtre.
   */
  public void dessiner(Graphics g)
    {
      // sauvegarde de la couleur courante du contexte graphique
      Color c = g.getColor();

      // change la couleur de tracé avec la couleur de cette chenille
      g.setColor(couleur);
      
      // dessine la chenille
      super.dessiner(g);

      // restitue la couleur initiale du contexte graphique
      g.setColor(c);
    }

}// ChenilleCouleur

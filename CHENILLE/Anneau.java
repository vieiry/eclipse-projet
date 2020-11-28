import java.awt.Graphics;
import java.awt.Color;

/**
 *
 * La classe Anneau permet de d�finir les anneaux d'une chenille.
 * Un anneau est d�fini par :<BR>
 * <UL>
 *   <LI>les coordonn�es x et y  de son centre</LI>
 *   <LI>son rayon</LI>
 * </UL>
 * <BR>
 * @author <a href="mailto: "Philippe Genoud</a>
 */

public class Anneau {

  //-------------- constantes ----------------------------------------

  /**
   *  rayon par d�faut des anneau
   */
  public final static int R = 5; 

  //-------------- variables d'instance (attributs)--------------------

  /**
   * abscisse du centre de l'anneau
   */
  protected int x; 

  /**
   * ordonn�e du centre de l'anneau
   */
  protected int y;

  /**
   * rayon de l'anneau
   */
  protected int r;

  // ------ Constructeurs ---------------------------------------------

  /**
   * cr�e un Anneau en fixant la position initiale de son centre et son rayon.
   * @param xInit abscisse du centre de l'anneau
   * @param yInit ordonn�e du centre de l'anneau
   * @param rInit rayon de l'anneau
   */
  public Anneau(int xInit, int yInit, int rInit) {
    this.x = xInit;
    this.y = yInit;
    this.r = rInit;
      }

  /**
   * cr�e un Anneau en fixant la position initiale de son centre et avec la
   * valeur par d�faut pour son rayon.
   * @param xInit abscisse du centre de l'anneau
   * @param yInit ordonn�e du centre de l'anneau
   */
  public Anneau(int xInit, int yInit) {
    this(xInit,yInit,R);
  }

  // ------ M�thodes -------------------------------------------------

  /**
   * retourne abscisse du centre de l'anneau
   * @return abscisse du centre
   */
  public int getX() {
    return x;
  }
  /**
   * retourne ordonn�e du centre de l'anneau
   * @return ordonn�e du centre
   */
  public int getY() {
    return y;
  }

  /**
   * positionne le centre de l'anneau en un point donn�
   * @param  px nouvelle abscisse du centre 
   * @param  py nouvelle ordonn�e du centre
   */
  public void placerA(int px, int py){
      x = px;
      y = py;
  }

  /**
   * affiche l'anneau en le mat�rialisant par un cercle.
   * @param g cet objet de classe Graphics pass� en param�tre est l'objet qui
   *  prend en charge la gestion de l'affichage dans la fen�tre de dessin. 
   * C'est cet objet qui g�re le "contexte graphique" pour cette fen�tre.
   */
  public void dessiner(Graphics g){
      g.drawOval(x-r, y-r, 2*r, 2*r);
  }

}


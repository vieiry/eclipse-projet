import java.awt.Graphics;
/**
 * La classe Tete permet de définir la tête d'une chenille.
 * Une Tete est est un anneau particulier qui en plus des attributs d'un anneau
 * possède un cap (direction de déplacement).<BR>
 * L'affichage d'une tête est différent de celui d'un anneau. Il s'effectue en
 * traçant un disque noir au lieu d'un simple cercle.
 * <BR>
 *
 * @author <a href="mailto: "Philippe Genoud</a>
 */
public class Tete extends Anneau {

  //------- variables d'instance (attributs) --------------------------

  /**
   * cap de la tête; Exprimé en degrés
   */
  protected double cap; 

  //-------- Constructeurs ---------------------------------------------

  /**
   * crée une tête en fixant sa position initiale, son rayon et son cap
   * @param xInit abscisse du centre de l'anneau 
   * @param yInit ordonnée du centre de l'anneau 
   * @param rInit rayon de l'anneau
   * @param cInit le cap intial (en degrés)
   */
  public Tete(int xInit, int yInit, int rInit, double cInit)
  {
      super(xInit,yInit,rInit);
      cap = cInit;
  }


  /**
   * crée une tête en fixant sa position initiale. Son rayon et son cap
   * sont fixés avec les valeurs par défaut.
   * @param xInit abscisse du centre de l'anneau 
   * @param yInit ordonnée du centre de l'anneau 
   */
  public Tete(int xInit, int yInit)
  {
      this(xInit,yInit,R,0.0);
  }

  //-------- Méthodes ---------------------------------------------  

  /**
   * affiche la tête en la matérialisant par un disque noir
   * @param g cet objet de classe Graphics passé en paramètre est l'objet qui
   *  prend en charge la gestion de l'affichage dans la fenêtre de dessin. 
   * C'est cet objet qui gère le "contexte graphique" pour cette fenêtre.
   */
  public void dessiner(Graphics g)
  {
    	g.fillOval(x-r, y-r, 2*r, 2*r);
  }

  /**
   * Modifie le cap de la chenille. Le cap courant de la chenille est modifié
   * en lui ajoutant une variation de cap passée en paramètre.
   * @param deltaC la variation à appliquer au cap de la chenille (en degrés).
   */
  public void devierCap(double deltaC)
  {
      cap += deltaC;
  }


  /**
   * deplace le centre de la chenille de manière à ce que le déplacement 
   * effectué corresponde à un déplacement d'une distance egale au rayon de 
   * de la tête dans la direction indiquée par le cap.
   */
  public void deplacerSelonCap()
  {
       x = (int) (x + r * Math.cos(Math.PI*cap /180));
       y = (int) (y + r * Math.sin(Math.PI*cap /180));
  }

  /**
   * teste si la tête atteint le bord de la zône de dessin
   * @param xMax la taille en x de la zône de dessin
   * @param yMAx la taille en y de la zône de dessin
   * @return true si la distance entre le  centre de la tête et l'un
   *         des bord de la fenpêtre est inférieure au rayon de la tête.
   */
   public boolean atteintBord(int xMax, int yMax)
   {
       return ((x < r) || (x > xMax - r) || (y < r) || (y > yMax - r));
   }
}





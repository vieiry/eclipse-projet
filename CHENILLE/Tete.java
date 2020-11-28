import java.awt.Graphics;
/**
 * La classe Tete permet de d�finir la t�te d'une chenille.
 * Une Tete est est un anneau particulier qui en plus des attributs d'un anneau
 * poss�de un cap (direction de d�placement).<BR>
 * L'affichage d'une t�te est diff�rent de celui d'un anneau. Il s'effectue en
 * tra�ant un disque noir au lieu d'un simple cercle.
 * <BR>
 *
 * @author <a href="mailto: "Philippe Genoud</a>
 */
public class Tete extends Anneau {

  //------- variables d'instance (attributs) --------------------------

  /**
   * cap de la t�te; Exprim� en degr�s
   */
  protected double cap; 

  //-------- Constructeurs ---------------------------------------------

  /**
   * cr�e une t�te en fixant sa position initiale, son rayon et son cap
   * @param xInit abscisse du centre de l'anneau 
   * @param yInit ordonn�e du centre de l'anneau 
   * @param rInit rayon de l'anneau
   * @param cInit le cap intial (en degr�s)
   */
  public Tete(int xInit, int yInit, int rInit, double cInit)
  {
      super(xInit,yInit,rInit);
      cap = cInit;
  }


  /**
   * cr�e une t�te en fixant sa position initiale. Son rayon et son cap
   * sont fix�s avec les valeurs par d�faut.
   * @param xInit abscisse du centre de l'anneau 
   * @param yInit ordonn�e du centre de l'anneau 
   */
  public Tete(int xInit, int yInit)
  {
      this(xInit,yInit,R,0.0);
  }

  //-------- M�thodes ---------------------------------------------  

  /**
   * affiche la t�te en la mat�rialisant par un disque noir
   * @param g cet objet de classe Graphics pass� en param�tre est l'objet qui
   *  prend en charge la gestion de l'affichage dans la fen�tre de dessin. 
   * C'est cet objet qui g�re le "contexte graphique" pour cette fen�tre.
   */
  public void dessiner(Graphics g)
  {
    	g.fillOval(x-r, y-r, 2*r, 2*r);
  }

  /**
   * Modifie le cap de la chenille. Le cap courant de la chenille est modifi�
   * en lui ajoutant une variation de cap pass�e en param�tre.
   * @param deltaC la variation � appliquer au cap de la chenille (en degr�s).
   */
  public void devierCap(double deltaC)
  {
      cap += deltaC;
  }


  /**
   * deplace le centre de la chenille de mani�re � ce que le d�placement 
   * effectu� corresponde � un d�placement d'une distance egale au rayon de 
   * de la t�te dans la direction indiqu�e par le cap.
   */
  public void deplacerSelonCap()
  {
       x = (int) (x + r * Math.cos(Math.PI*cap /180));
       y = (int) (y + r * Math.sin(Math.PI*cap /180));
  }

  /**
   * teste si la t�te atteint le bord de la z�ne de dessin
   * @param xMax la taille en x de la z�ne de dessin
   * @param yMAx la taille en y de la z�ne de dessin
   * @return true si la distance entre le  centre de la t�te et l'un
   *         des bord de la fenp�tre est inf�rieure au rayon de la t�te.
   */
   public boolean atteintBord(int xMax, int yMax)
   {
       return ((x < r) || (x > xMax - r) || (y < r) || (y > yMax - r));
   }
}





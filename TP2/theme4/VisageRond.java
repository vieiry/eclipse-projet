

import java.awt.Graphics;

/**
 * Cette classe permet de mod�liser un visage de forme ovale.
 * <p>Le rep�re graphique est d�fini avec son origine en haut
 * � gauche de la z�ne de dessin, l'axe des x horizontal et l'axe
 * des y vertical vers le bas.
 * <p>Un visage est d�fini par :
 * <ul>
 * <li>
 * les coordonn�es xhg, yhg du coin sup�rieur gauche du rectangle
 * englobant,</li>
 * <li>
 * une largeur et une hauteur,</li>
 * <li>
 * un d�placement �l�mentaire horizontal (dx) et un d�placement
 * �l�mentaire vertical (dy).</li>
 * </ul>
 *
 * <center><img SRC="figurevisage.gif" NOSAVE height=266 width=300 align=ABSCENTER></center>
 *
 * @author Philippe Genoud
 * @version derni�re modification 27/09/99
 *
 */

public class VisageRond  {

   //---------------------------------------------------------
   // Les constantes de la classe VisageRond
   //---------------------------------------------------------

   /**
    * Largeur minimale pour un VisageRond.
    */
   public static final int LARGEUR_MIN = 15;

   /**
    * Hauteur minimale pour un VisageRond.
    */
   public static final int HAUTEUR_MIN = 15;

   //-------------------------------------------------------------
   // Les attributs (variables d'instance) de la classe VisageRond
   //-------------------------------------------------------------

   /**
    * La z�ne de dessin dans laquelle se trouve le VisageRond.
    */
   private Dessin d;

   /**
    * abscisse coin sup�rieur gauche du rectangle englobant le visage.
    */
   private int xhg = 0;

   /**
    * ordonn�e coin sup�rieur gauche du rectangle englobant le visage.
    */
   private int yhg = 0;

   /**
    * largeur du visage.
    * Par d�faut 50 pixels.
    */
   private int largeur = 50;

   /**
    * hauteur du visage.
    * Par d�faut 50 pixels.
    */
   private int hauteur = 50;

   /**
    * d�placement �l�mentaire horizontal du visage.
    * Par d�faut 5 pixels.
    */
   private int dx = 5;

   /**
    * deplacement �l�mentaire vertical du visage.
    * Par d�faut 5 pixels.
    */
   private int dy = 5;
   
   /**
    * indique l'�tat du visage (impassible ou souriant). Si true le visage est
    * impassible, si false le visage est souriant. 
    */
   private boolean impassible = true;

   //---------------------------------------------------------
   // Les constructeurs de la classe VisageRond
   //---------------------------------------------------------

   /**
    * Constructeur avec valeurs par d�faut.
    * Cr�e un visage de taille 50x50 dont le coin sup�rieur gauche du rectangle
    * englobant est situ� au point (0,0) de la z�ne de dessin. Ce visage est 
    * �galement dot� d'un d�placement �l�mentaire horizontal et vertical de
    * +5 pixels.
    */
   public VisageRond()
      {
      }

   /**
    * Constructeur avec positionnement du visage.
    * Cr�e un visage de taille 50x50 mais dont la position du
    * coin sup�rieur
    * gauche du rectangle englobant est fix�e � la cr�ation. 
    * Ce visage est dot� d'un d�placement �l�mentaire horizontal et 
    * vertical de +5 pixels.
    *
    * @param xg abscisse du coin sup�rieur gauche du rectangle englobant.
    * @param yg ordonn�e du coin sup�rieur gauche du rectangle englobant.
    */
   public VisageRond(int xg, int yg)
      {
         xhg = xg;
         yhg = yg;

      }

   /**
    * Constructeur avec positionnement du visage et d�finition de sa taille.
    * Cr�e un visage dont les diemensions et la position du coin sup�rieur
    * gauche du rectangle englobant sont fix�es � la cr�ation. 
    * Ce visage est dot� d'un d�placement �l�mentaire horizontal et vertical de
    * +5 pixels.
    *
    * @param xg abscisse du coin sup�rieur gauche du rectangle englobant.
    * @param yg abscisse du coin sup�rieur gauche du rectangle englobant.
    * @param larg largeur du visage. La largeur doit �tre sup�rieure � LARGEUR_MIN
    * @param haut hauteur du visage. La hauteur doit �tre sup�rieure � HAUTEUR_MIN
    *
    * @see VisageRond#LARGEUR_MIN
    * @see VisageRond#HAUTEUR_MIN
    */
   public VisageRond(int xg, int yg, int larg, int haut)
      {
         xhg = xg;
         yhg = yg;

         largeur = Math.max(larg,LARGEUR_MIN);
         hauteur = Math.max(haut,HAUTEUR_MIN);
      }
   
   /**
    * Donne la valeur du d�placement �l�mentaire horizontal.
    * @return valeur de dx, d�placement �l�mentaire horizontal.
    */
   public int  getDx() {
     return dx;
   }
   
   /**
      * Fixe  d�placement �l�mentaire horizontal.
      * @param v  Valeur � affecter � dx, d�placement �l�mentaire horizontal.
      */
   public void setDx(int  v) {
     this.dx = v;
   }

   public int getDy() {
      return dy;
   }
   
   public void setDy(int  v) {
      this.dy = v;
   }

   /**
    * Inverse sens du d�placement horizontal.
    */
   public void inverserDx()
      {
         dx = -dx;
      }
   
   /**
    * Inverse sens du d�placement vertical.
    */
   public void inverserDy()
      {
         dy = -dy;
      }
   
   /**
    * Inverse sens des d�placements horizontal et vertical.
    */
   public void inverserDxEtDy()
      {
         dx = -dx;
         dy = -dy;
      }


   /**
    * Fait effectuer au visage un d�placement �lementaire.
    * La position du coin sup�rieur gauche du visage est modifi�e en lui ajoutant
    * le d�placement �l�mentaire d�fini par dx et dy.
    */
   public void deplacer()
      {
         xhg += dx;
         yhg += dy;
      }

   /** 
    * Evalue si le visage atteint le bord gauche de la z�ne de dessin.
    * @return <code>true</code> si le rectangle englobant le visage 
    *         intersecte le cot� gauche de la z�ne de dessin, <code>
    *         false</code> sinon.
    */
   public boolean bordGaucheAtteint()
      {
         return (xhg < 0);
      }

  /** 
    * Evalue si le visage atteint le bord droit de la z�ne de dessin.
    * @return <code>true</code> si le rectangle englobant le visage 
    *         intersecte le cot� droit de la z�ne de dessin, <code>
    *         false</code> sinon.
    */
   public boolean bordDroitAtteint()
      {
         return ((xhg + largeur) > d.getLargeur());
      }

  /** 
    * Evalue si le visage atteint le bord haut de la z�ne de dessin.
    * @return <code>true</code> si le rectangle englobant le visage 
    *         intersecte le cot� haut de la z�ne de dessin, <code>
    *         false</code> sinon.
    */
   public boolean bordHautAtteint()
      {
         return (yhg < 0);
      }

  /** 
    * Evalue si le visage atteint le bord bas de la z�ne de dessin.
    * @return <code>true</code> si le rectangle englobant le visage 
    *         intersecte le cot� bas de la z�ne de dessin, <code>
    *         false</code> sinon.
    */
   public boolean bordBasAtteint()
      {
         return ((yhg + hauteur) >= d.getHauteur());
      }
   
  /** 
    * Evalue si le visage atteint l'un des bords  de la z�ne de dessin.
    * @return <code>true</code> si le rectangle englobant le visage 
    *         intersecte l'un des cot�s de la z�ne de dessin, <code>
    *         false</code> sinon.
    */
   public boolean bordAtteint()
      {
         return  bordDroitAtteint() || bordGaucheAtteint() || bordHautAtteint() || bordBasAtteint();
      }


   /**
    * fixe la z�ne de dessin dans laquelle le visage est affich�.
    * @param d r�f�rence de la^z�ne de dessin associ�e au Visage
    * 
    * @see Dessin
    * @see Dessinable
    */
   public void setDessin(Dessin d)
      {
         this.d = d;
      }


    /**
     * change l'expression du visage. Si il �tait impassible, il devient souriant,
     * si il �tait souriant il devient impassible.
     */    
    public void changeExpression() {
        impassible = !impassible;
    }
   
    /**
     * effectue un d�placement �l�mentaire, si le visage atteint un des bords il change 
     * d'expression et de direction de d�placement.
     */
    public void deplacerAvecRebond() {
        if (this.bordDroitAtteint() || this.bordGaucheAtteint()) {
           this.inverserDx();
           
        }
        if (this.bordHautAtteint() || this.bordBasAtteint()) {
           this.inverserDy();
           
        } 
        
        this.deplacer();
    }
  /**
    * affiche le visage.
    * @param g le contexte graphique de la z�ne de dessin en charge de l'affichage.
    * 
    * @see java.awt.Graphics
    * @see Dessinable
    */
   public void dessiner(Graphics g)
      {
         // dessiner le contour du visage
         g.drawOval(xhg , yhg, largeur ,hauteur);

         // dessiner la bouche
         if (impassible)
             g.drawLine(xhg + largeur / 4, yhg + (2*hauteur)/3, xhg + (3*largeur)/4, yhg + (2*hauteur)/3);
         else
             g.drawArc(xhg + largeur / 4, yhg + (2*hauteur)/3, largeur/2, hauteur/5,-45,-90);
         
         // dessiner les yeux
         int largeurOeil = largeur /5;
         int hauteurOeil =hauteur/5;
         g.drawOval(xhg + largeurOeil, yhg + hauteurOeil, largeurOeil, hauteurOeil);
         g.drawOval(xhg + 3 * largeurOeil, yhg + hauteurOeil, largeurOeil, hauteurOeil);
         
      }  


} // VisageRond



















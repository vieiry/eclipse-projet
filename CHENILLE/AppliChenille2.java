import java.awt.Frame;

/**
 * Ouvre une fen�tre et affiche plusieurs chenilles, intialement toutes positionn�es au centre
 * de la fen�tre et qui ensuite se d�placent de mani�re al�atoire. Le nombre de chenille peut
 * �tre fix� par la ligne de commande; par exemple pour avoir 6 chenilles :<BR>
 * <code>java AppliChenille2 6</code>
 *
 * @author Philippe Genoud
 */
public class AppliChenille2  {

  public static final int NBCH = 5;
   
   public static void main(String[] args) {

     int nbChenilles; // nombre de chenille a afficher

     if (args.length == 0) 
       nbChenilles = NBCH;
     else
       nbChenilles = Integer.parseInt(args[0]); 

     // cr�ation de la fen�tre de l'application
      Frame laFenetre = new Frame("Chenilles");
      laFenetre.setSize(512,512);

      // cr�ation de la z�ne de dessin dans la fen�tre
      Dessin d = new Dessin();
      laFenetre.add(d);

      // affiche la fen�tre
      laFenetre.show();

      // creation des chenilles. elles sont stock�es dans un tableau et ajout�es
      // � la z�ne de dessin
      Chenille[]  chen = new Chenille[nbChenilles];
      for (int i = 0; i < nbChenilles; i++) {
         chen[i] = new Chenille(d.getLargeur(),d.getHauteur(),15,10);
         d.ajouterObjet(chen[i]);
      }

      // la boucle d'animation
      while (true)
         {
 
	   // fait r�aliser aux chenilles un d�placement �l�mentaire
           for (int i = 0; i < nbChenilles; i++)
               chen[i].deplacer();

            // la zone de dessin se r�affiche
            d.repaint();
            
             // un temps de pause pour avoir le temps de voir le nouveau dessin
            d.pause(50);

         }
      
      
      
   }
   
} // AppliChenille2


import java.awt.Frame;
/**
 * Ouvre une fen�tre et affiche une chenille, intialement positionn�e au centre
 * de la fen�tre et qui ensuite se d�place de mani�re al�atoire.
 *
 *
 * @author Philippe Genoud
 */
public class AppliChenille1  {
   
   public static void main(String[] args) {

     // cr�ation de la fen�tre de l'application
      Frame laFenetre = new Frame("Chenilles");
      laFenetre.setSize(512,512);

      // cr�ation de la z�ne de dessin dans la fen�tre
      Dessin d = new Dessin();
      laFenetre.add(d);

      // affiche la fen�tre
      laFenetre.show();

      // creation d'un objet Chenille
      Chenille  c1 = new Chenille(d.getLargeur(),d.getHauteur(),15,10);

      // on rajoute cet objet la z�ne de dessin
      d.ajouterObjet(c1);

      // la boucle d'animation
      while (true)
         {
 
	   // fait r�aliser � la chenille un d�placement �l�mentaire
            c1.deplacer();

            // la zone de dessin se r�affiche
            d.repaint();
            
             // un temps de pause pour avoir le temps de voir le nouveau dessin
            d.pause(50);

         }
      
      
      
   }
   
} // AppliChenille1


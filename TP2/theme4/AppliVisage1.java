

import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 * AppliVisage1.java , ce programme affiche deux visages qui circulent sur 
 * 
 * les diagonales de la fenetre 
 *
 */

public class AppliVisage1  {
   
   public static void main(String[] args) {

      JFrame laFenetre = new JFrame("VISAGE ANIME");
      laFenetre.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      laFenetre.setSize(512,512);

      
      Dessin d = new Dessin();
      laFenetre.add(d);
      
      laFenetre.setVisible(true);

      // creation d'un objet VisageRond
      VisageRond  v1 = new VisageRond();
      VisageRond  v2 = new VisageRond((d.getLargeur()/2),(d.getHauteur()/2));
      v2.setDy((int) -5.0);
      

      // on rajoute cet objet la zone de dessin
      d.ajouterObjet(v1);
      d.ajouterObjet(v2);

      // la boucle d'animation
      while (true)
         {
            // le visage a atteint un des bords, il change de direction
            if (v1.bordAtteint())
               v1.inverserDxEtDy();
            
            if (v2.bordAtteint())
               v2.inverserDxEtDy();
            // le visage effectue un déplacement elementaire
            v1.deplacer();
            v2.deplacer();

            // la zone de dessin se réaffiche
            d.repaint();
            
             // un temps de pause pour avoir le temps de voir le nouveau dessin
            d.pause(50);

         }
      
      
      
   }
   
} // AppliVisage1

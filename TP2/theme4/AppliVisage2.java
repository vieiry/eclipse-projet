

/**
 * Applivisage2,ce programme affiche deux visages qui circulent et changent de direction
 * 
 * à chaque fois qu'ils atteignent un bord
 */
import java.awt.Frame;
public class AppliVisage2  {
   
   public static void main(String[] args) {

      Frame laFenetre = new Frame("VISAGE ANIME");
      laFenetre.setSize(512,512);

      Dessin d = new Dessin();
      laFenetre.add(d);

      laFenetre.show();

      // creation d'un objet VisageRond
      VisageRond  v1 = new VisageRond();
      VisageRond  v2 = new VisageRond(d.getLargeur()/2,d.getHauteur()/2);
      v2.setDy(-5);

      // on rajoute cet objet la zône de dessin
//      try {
      d.ajouterObjet(v1);
      d.ajouterObjet(v2);


      // la boucle d'animation
      while (true)
         {

            // les visages effectuent un déplacement élémentaire
            // en rebondissant sur les bords et en changeant d'expression
            v1.deplacerAvecRebond();
            v2.deplacerAvecRebond();
            
            // la zone de dessin se réaffiche
            d.repaint();
            
             // un temps de pause pour avoir le temps de voir le nouveau dessin
            d.pause(50);

         } 
   }
   
} // AppliVisage3
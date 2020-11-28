import java.awt.Frame;
import java.awt.Color;

/**
 * Ouvre une fenêtre et affiche plusieurs chenilles intialement toutes positionnées au centre
 * de la fenêtre et qui ensuite se déplacent de manière aléatoire. Une chenille sur deux est
 * une chenille "normale", l'autre étant une chenille colorée dont la couleur est fixée au
 * hasard.<BR>
 * Le nombre de chenille peut être fixé par la ligne de commande;
 *  par exemple pour avoir 6 chenilles :<BR>
 * <code>java AppliChenille2 6</code>
 *
 * @author Philippe Genoud
 */
public class AppliChenille3  {
    
    public static final int NBCH = 50;
    
    public static void main(String[] args) {
        
        int nbChenilles; // nombre de chenille a afficher
        
        if (args.length == 0)
            nbChenilles = NBCH;
        else
            nbChenilles = Integer.parseInt(args[0]);
        
        // création de la fenêtre de l'application
        Frame laFenetre = new Frame("Chenilles");
        laFenetre.setSize(512,512);
        
        // création de la zône de dessin dans la fenêtre
        Dessin d = new Dessin();
        laFenetre.add(d);
        
        // affiche la fenêtre
        laFenetre.show();
        
        // creation des chenilles. elles sont stockées dans un tableau et ajoutées
        // à la zône de dessin. Les chenilles d'indice impair sont des chenilles "normales"
        // les chenilles d'indice pair sont des chenilles colorées
        Chenille[]  chen = new Chenille[nbChenilles];
        for (int i = 0; i < nbChenilles; i++) {
            if ( i % 2 != 0)
                chen[i] = new Chenille(d.getLargeur(),d.getHauteur(),10,10);
            else
                chen[i] = new ChenilleCouleur(d.getLargeur(),d.getHauteur(),10,10,
                new Color((float) Math.random(),
                (float) Math.random(), (float) Math.random()));
            d.ajouterObjet(chen[i]);
        }
        
        // la boucle d'animation
        while (true) {
            
            // fait réaliser aux chenilles un déplacement élémentaire
            for (int i = 0; i < nbChenilles; i++)
                chen[i].deplacer();
            
            // la zone de dessin se réaffiche
            d.repaint();
            
            // un temps de pause pour avoir le temps de voir le nouveau dessin
            d.pause(50);
            
        }
        
    }
    
} // AppliChenille3


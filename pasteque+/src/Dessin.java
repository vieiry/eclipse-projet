

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 * Defini le contenu de la fenêtre de l'application d'animation des VisageRond. Une zone
 * de dessin est un JPanel qui gère un liste d'objets VisageRond. Lorsqu'il se réaffiche
 * l'objet Dessin redessinne les différents objets VisageRond contenus dans cette liste.
 *
 * @author Philippe Genoud
 * @version
 */
public class Dessin extends JPanel {
 /**
     * stocke la liste des VisageRond ayant été ajoutées à cette zone de
     * dessin.
     */
    private List<Chenille> listeDesChenille = new ArrayList<Chenille>();
    private List<pastek> Past = new ArrayList<pastek>();
 /**
     * retourne la largeur de la zone de dessin.
     * @return la largeur.
     */
    public int getLargeur() {
        return getWidth();
    }
    
    /**
     * retourne la hauteur de la zone de dessin.
     * @return la hauteur.
     */
    public int getHauteur() {
        return getHeight();
    }
    
    /**
     * ajoute un VisageRond à la zone de dessin.
     * @param c la VisageRond à ajouter au Dessin
     * @see VisageRond
     */
    public void ajouterObjet(Chenille v1) {
        
        if (! listeDesChenille.contains(v1)) {
            // l'objet n'est pas déjà dans la liste
            // on le rajoute a la liste des objets du dessin
            listeDesChenille.add(v1);
			// fixe le dessin associé au visage rond v : c'est CE dessin
            
            // le dessin se réaffiche
            repaint();
        }
    }
 public void ajouterP(pastek p1) {
        
        if (! Past.contains(p1)) {
            // l'objet n'est pas déjà dans la liste
            // on le rajoute a la liste des objets du dessin
        	Past.add(p1);
			// fixe le dessin associé au visage rond v : c'est CE dessin
            
            // le dessin se réaffiche
            repaint();
        }
    }
 public void retirerP(pastek p1) {
     
     if (Past.contains(p1)) {
         // l'objet n'est pas déjà dans la liste
         // on le rajoute a la liste des objets du dessin
     	Past.remove(p1);
			// fixe le dessin associé au visage rond v : c'est CE dessin
         
         // le dessin se réaffiche
         repaint();
     }
 }
    
    /**
     * temporisation de l'animation.
     * @param durée delai de temporisation en ms.
     */
    public void pause(int duree) {
        try {
            Thread.sleep(duree);
        } catch (Exception e) {}
    }
    
    /**
     * affiche la zone de dessin et son contenu
     * @param g le contexte graphique
     */
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
		// on dessine chacun des visages contenus dans la zone de dessin
		for (Chenille v : listeDesChenille)
            v.dessiner(g);
		
    for (pastek p : Past)
        p.dessinee(g);
}   
    
} // Dessin

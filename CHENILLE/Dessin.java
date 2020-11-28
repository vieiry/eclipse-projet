/**
 * Dessin.java
 *
 * Created: Sun Sep 26 13:02:15 1999
 */

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Iterator;
import java.util.Vector;


/**
 * Defini le contenu de la fenêtre de l'application d'animation des Chenille. Une zone
 * de dessin est un Canvas qui gère un liste d'objets Chenille. Lorsqu'il se réaffiche
 * l'objet Dessin redessinne les différents objets Chenille contenu dans cette liste.
 *
 * @author Philippe Genoud
 * @version
 */
public class Dessin extends Canvas {
    
    private Dimension offDimension;
    private Image offImage;
    private Graphics offGraphics = null;
    
    /**
     * stocke la liste des Chenilles ayant été ajoutées à cette zone de
     * dessin.
     */
    private Vector listeDesChenilles = new Vector();
    
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
     * ajoute un Chenille à la zone de dessin.
     * @param c la Chenille à ajouter au Dessin
     * @see Chenille
     */
    public void ajouterObjet(Chenille c) {
        
        if (! listeDesChenilles.contains(c)) {
            // l'objet n'est pas déjà dans la liste
            // on le rajoute a la liste des objets du dessin
            listeDesChenilles.add(c);
            // on enlève l'appel setDessin , cette méthode ne fait pas partie de
            // la classe Chenille
            // c.setDessin(this);
            // le dessin se réaffiche
            repaint();
        }
    }
    
    /**
     * temporisation de l'animation.
     * @param durée delai de temporisation en ms.
     */
    public void pause(int durée) {
        try {
            Thread.currentThread().sleep(durée);
        } catch (Exception e) {}
    }
    
    /**
     * rafraichissement de la zone de dessin. Lorsque cette méthode est
     * invoquée, la zone de dessin se réaffiche.
     * @param g le contexte graphique
     */
    public void update(Graphics g) {
        Dimension d = getSize();
        if ((offGraphics == null) || (d.width != offDimension.width)
        || (d.height != offDimension.height)) {
            offDimension = d;
            offImage = createImage(d.width, d.height);
            offGraphics = offImage.getGraphics();
        }
        offGraphics.setColor(getBackground());
        offGraphics.fillRect(0, 0, d.width, d.height);
        offGraphics.setColor(getForeground());
        dessinerLesChenilles(offGraphics);
        g.drawImage(offImage, 0, 0, this);
    }
    
    /**
     * Parcourt la liste des Chenilles pour afficher chacune d'elle.
     * @param g le contexte graphique
     */
    private void dessinerLesChenilles(Graphics g) {
        Iterator lesObjets = listeDesChenilles.iterator();
        
        while (lesObjets.hasNext()) {
            Chenille objCour = (Chenille)(lesObjets.next());
            objCour.dessiner(g);
        }
    }
    
} // Dessin

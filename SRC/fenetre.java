import java.awt.*;
import javax.swing.*;
class MaFenetre extends JFrame{
private JButton MonBouton ;
public MaFenetre () {
super() ;
//appel du constructeur par défaut de la classe JFrame
//qui peut être omis
setTitle("Ma premiere fenetre avec un bouton") ;
//initialisation du titre de la fenêtre
setBounds(10,40,300,200) ;
//le coin supérieur gauche de la fenêtre est placé au pixel
//de coordonnées 10, 40 et ses dimensions seront de 300 *
//200 pixels
MonBouton = new JButton("Un bouton") ;
//création d’un bouton de référence MonBouton portant
//l’étiquette Un bouton
getContentPane().add(MonBouton) ;
//Pour ajouter un bouton à une fenêtre, il faut incorporer
//le bouton dans le contenu de la fenêtre. La méthode
//getContentPane de la classe JFrame fournit une
//référence à ce contenu, de type Container.
//La méthode add de la classe Container permet
//d’ajouter le bouton au contenu de la fenêtre.
}
}
public class fenetre{
public static void main(String args[]) {
JFrame fen = new MaFenetre() ;
fen.setVisible(true) ;
//rend visible la fenêtre de référence fen
}
}
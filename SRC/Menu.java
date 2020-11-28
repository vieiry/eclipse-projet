import java.awt.*;
import javax.swing.*;
class MaFenetre extends JFrame {
private JMenuBar barreMenus ;
private JMenu couleur, dimensions ;
private JMenuItem rouge, vert, hauteur, largeur ;
public MaFenetre () {
super("Une fenetre avec un menu") ;
setSize(300, 200) ;
JMenuBar barreMenus = new JMenuBar() ;
setJMenuBar(barreMenus) ;
//création d'un menu Couleur et de son groupe de deux options Rouge et Vert
JMenu couleur = new JMenu("Couleur") ;
barreMenus.add(couleur) ;
JRadioButtonMenuItem rouge = new
JRadioButtonMenuItem("Rouge") ;
JRadioButtonMenuItem vert = new
JRadioButtonMenuItem("Vert") ;
couleur.add(rouge) ; couleur.add(vert) ;
ButtonGroup groupe = new ButtonGroup() ;
groupe.add(rouge) ; groupe.add(vert) ;
//les options boutons radio sont placées dans un groupe de type ButtonGroup afin d'assurer l'unicité de la sélection à l'intérieur du groupe (cf paragraphe I.5.2.)
//création d'un menu Formes et de ses cases à cocher Rectangle et Ovale
JMenu formes = new JMenu("Formes") ;
barreMenus.add(formes) ;
JCheckBoxMenuItem rectangle = new
JCheckBoxMenuItem("Rectangle") ;
JCheckBoxMenuItem ovale = new
JCheckBoxMenuItem("Ovale") ;
formes.add(rectangle) ; formes.add(ovale) ;
}
public class Menu {
public static void main(String args[]) {
JFrame fen = new MaFenetre() ;
fen.setVisible(true) ;
}
}
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
JMenu couleur = new JMenu("Couleur") ;
barreMenus.add(couleur) ;
JRadioButtonMenuItem rouge = new
JRadioButtonMenuItem("Rouge") ;
JRadioButtonMenuItem vert = new
JRadioButtonMenuItem("Vert") ;
couleur.add(rouge) ; couleur.add(vert) ;
ButtonGroup groupe = new ButtonGroup() ;
groupe.add(rouge) ; groupe.add(vert) ;
JMenu formes = new JMenu("Formes") ;
barreMenus.add(formes) ;
JCheckBoxMenuItem rectangle = new
JCheckBoxMenuItem("Rectangle") ;
JCheckBoxMenuItem ovale = new
JCheckBoxMenuItem("Ovale") ;
formes.add(rectangle) ; formes.add(ovale) ;
}
}
public class Exempledemenu {
public static void main(String args[]) {
JFrame fen = new MaFenetre() ;
fen.setVisible(true) ;
}
}
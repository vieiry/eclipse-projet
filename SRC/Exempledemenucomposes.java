import java.awt.*;
import javax.swing.*;
class MaFenetre extends JFrame{
private JButton MonBouton ;
public MaFenetre () {

public MaFenetre () {
super("Une fenetre avec un menu") ;
setSize(300, 200) ;
JMenuBar barreMenus = new JMenuBar() ;
setJMenuBar(barreMenus) ;
//création d'un menu Formes composé d'une option Arrondi composée elle //même de deux options Cercle et Ovale, et,
//d'une option Rectangle
JMenu formes = new JMenu("Formes") ;
barreMenus.add(formes) ;
JMenu arrondi = new JMenu("Arrondi") ;
formes.add(arrondi) ;
JMenuItem cercle = new JMenuItem("Cercle") ;
arrondi.add(cercle) ;
JMenuItem ovale = new JMenuItem("Ovale") ;
arrondi.add(ovale) ;
JMenuItem rectangle = new JMenuItem("Rectangle") ;
formes.add(rectangle) ;
}
}
public class Exempledemenucomposes {
public static void main(String args[]) {
JFrame fen = new MaFenetre() ;
fen.setVisible(true) ;
}
}
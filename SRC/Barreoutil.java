import java.awt.*;
import javax.swing.*;
class MaFenetre extends JFrame {
JToolBar barreOutils ;
JButton boutonRouge, boutonVert ;

public MaFenetre () {
super("Une fenetre avec une barre d'outils") ;
setSize(300, 200) ;
//création d'une barre d'outils composée de deux
//boutons: un bouton Rouge et un bouton Vert
barreOutils = new JToolBar() ;
boutonRouge = new JButton("Rouge") ;
barreOutils.add(boutonRouge) ;
boutonVert = new JButton("Vert") ;
barreOutils.add(boutonVert) ;
getContentPane().add(barreOutils) ; }
}
public class Barreoutil {
public static void main(String args[]) {
JFrame fen = new MaFenetre() ;
fen.setVisible(true) ;
}
}
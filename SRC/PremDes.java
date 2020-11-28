import java.awt.* ; 
import javax.swing.* ;

class MaFenetre extends JFrame {
private JPanel pan ;
public MaFenetre () {
super("Une fenetre avec un panneau jaune") ;
setSize(300, 200) ;
pan = new Panneau();
pan.setBackground(Color.yellow) ;
getContentPane().add(pan) ;
}
}
class Panneau extends JPanel {
public void paintComponent(Graphics g) {
super.paintComponent(g) ;
//appel explicite de la méthode paintComponent de la
//classe de base JPanel , qui réalise le dessin du
//panneau.
g.drawLine(15, 10, 100, 50) ;
//méthode de la classe Graphics qui trace un trait du
//point de coordonnées (15, 10) au point de coordonnées
//(100, 50)
}
}
public class PremDes {
public static void main(String args[]) {
JFrame fen = new MaFenetre() ;
fen.setVisible(true) ;
}
}
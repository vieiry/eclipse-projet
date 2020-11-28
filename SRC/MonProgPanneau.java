import java.awt.* ;
import javax.swing.* ;
class MaFenetre extends JFrame {
private JPanel panneau ;
public MaFenetre () {
super("Une fenetre avec un panneau jaune") ;
setSize(300, 200) ;
panneau = new JPanel();
panneau.setBackground(Color.green) ;
//Color.yellow est une constante de la classe Color
//(classe du paquetage java.awt dérivée de la classe
//Object) correspondant à la couleur jaune
getContentPane().add(panneau) ;
//le panneau de couleur jaune occupe toute la fenêtre
}
}
public class MonProgPanneau {
public static void main(String args[]) {
JFrame fen = new MaFenetre() ;
fen.setVisible(true) ; }
}
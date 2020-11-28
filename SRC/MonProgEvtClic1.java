import java.awt.* ; 
import java.awt.event.* ;
import javax.swing.* ; 
import javax.swing.event.* ;
class MaFenetre extends JFrame {
public MaFenetre () {
super("Une fenetre qui traite les clics souris") ;
setSize(300, 200) ;
addMouseListener(new EcouteurSouris());
//la fenêtre fait appel à un écouteur d’événements souris
//pour traiter les clics souris
}
}
//L’écouteur d’événements souris doit implémenter l’interface
//MouseListener qui correspond à une catégorie
//d’événements souris.
class EcouteurSouris implements MouseListener {
//redéfinition de la méthode appelée lors d’un clic souris
public void mouseClicked(MouseEvent e) {
System.out.println("clic dans la fenetre"); }
//la redéfinition des autres méthodes est "vide"
public void mousePressed(MouseEvent e) { }
public void mouseReleased(MouseEvent e) { }
public void mouseEntered(MouseEvent e) { }
public void mouseExited(MouseEvent e) { }
}
public class MonProgEvtClic1 {
public static void main(String args[]) {
JFrame fen = new MaFenetre() ;
fen.setVisible(true) ; }
}
import java.awt.* ; 
import java.awt.event.* ;
import javax.swing.* ; 
import javax.swing.event.* ;
class MaFenetre extends JFrame implements
MouseListener {
public MaFenetre () {
super("Une fenetre qui traite les clics souris") ;
setSize(300, 200) ;
addMouseListener(this);
//la fenêtre est son propre écouteur d’événements souris
}
//L’argument e de type MouseEvent correspond à l’objet
//événement généré dans la fenêtre lors d’un clic souris. On
//peut utiliser les informations qui lui sont associées.
public void mouseClicked(MouseEvent e) {
int x = e.getX() ;
int y = e.getY() ;
//coordonnées du curseur de la souris au moment du clic
System.out.println("clic dans la fenetre au point de coordonnees " + x + ", " + y);
}
public void mousePressed(MouseEvent e) { }
public void mouseReleased(MouseEvent e) { }
public void mouseEntered(MouseEvent e) { }
public void mouseExited(MouseEvent e) { }
}
public class MonProgEvtClic2 {
public static void main(String args[]) {
JFrame fen = new MaFenetre() ;
fen.setVisible(true) ;
}
}
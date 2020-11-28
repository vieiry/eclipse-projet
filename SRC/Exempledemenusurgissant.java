import java.awt.*;
import javax.swing.*;
class MaFenetre extends JFrame {
private JMenuBar barreMenus ;
private JMenu couleur ;
private JMenuItem rouge, vert, x, y ;

public MaFenetre () {
super("Exemple de menu surgissant") ;
setSize(300, 200) ;
JMenuBar barreMenus = new JMenuBar() ;
setJMenuBar(barreMenus) ;
//création d'un menu surgissant comportant deux options Rouge et Vert
JPopupMenu couleur = new JPopupMenu() ;
rouge = new JMenuItem("Rouge") ;
couleur.add(rouge) ;
vert = new JMenuItem("Vert") ;
couleur.add(vert) ;
JFrame fen = new JFrame() ;
fen.setVisible(false) ;
couleur.show(fen, rouge, vert) ;
}
}
public class Exempledemenusurgissant {
public static void main(String args[]) {
JFrame fen = new MaFenetre() ;
fen.setVisible(true) ;
}
}
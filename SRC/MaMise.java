import java.awt.*;
import javax.swing.*;
class MaFenetre extends JFrame{
private JMenuBar barreMenus;
public MaFenetre(){
JMenuBar barreMenus = new JMenuBar();
setJMenuBar(barreMenus);
//cr�ation d'un menu Formes compos� d'une option Arrondi
//compos�e elle m�me de deux options Cercle et Ovale, et,
//d'une option Rectangle
JMenu formes = new JMenu("Formes");
barreMenus.add(formes);
JMenu arrondi = new JMenu("Arrondi");
formes.add(arrondi);
JMenuItem cercle = new JMenuItem("Cercle");
arrondi.add(cercle);
JMenuItem ovale = new JMenuItem("Ovale");
arrondi.add(ovale);
JMenuItem rectangle = new JMenuItem("Rectangle");
formes.add(rectangle);
}
}
public class MaMise{
public static void main(String args[]){
JFrame fen = new MaFenetre();
fen.setVisible(true);
}
}

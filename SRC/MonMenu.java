import java.awt.*;
import javax.swing.*;
class MaFenetre extends JFrame{
private JMenuBar barreMenus;
private JMenu couleur,dimensions;
private JMenuItem rouge, vert, hauteur, largeur;
public MaFenetre(){
super("Une fenetre avec un menu");
setSize(300,200);
//creation d'une barre de menu
barreMenus = new JMenuBar();
setJMenuBar(barreMenus);
//ajout de la barre de menu dans la fenetre
//creation d'un menu Couleur et de ses options Rouge et Vert
couleur = new JMenu("Couleur");
barreMenus.add(couleur);
rouge = new JMenuItem("Rouge");
couleur.add(rouge);
couleur.addSeparator();;
//ajout d'une barre separatrice avant l'option suivante 
vert = new JMenuItem("Vert");
couleur.add(vert);
//creation d'un menu Dimensions et de ses options
//Hauteur et Largeur
dimensions = new JMenu("Dimensions");
barreMenus.add(dimensions);
hauteur = new JMenuItem("Hauteur");
dimensions.add(hauteur);
dimensions.addSeparator();
largeur = new JMenuItem("Largeur");
dimensions.add(largeur);
}
}
public class MonMenu{
public static void main(String args[]){
JFrame fen = new MaFenetre();
fen.setVisible(true);
}
}
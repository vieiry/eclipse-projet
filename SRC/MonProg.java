import java.awt.*;
import javax.swing.*;
class MaFenetre extends JFrame{
private JButton MonBouton;
public MaFenetre(){
super();
//appel du constructeur par defaut de la classe JFrame qui peut etre omis
setTitle("Ma premiere fenetre avec un bouton");
//initialisation du titre de la fenetre
setBounds(10,40,300,200);
//le coin superieur gauche de la fenetre  pixelest plac� au pixel de coordonn�es 10,40 et ses dimensions seront de 300*200 pixels
MonBouton = new JButton("Un bouton");
//creation d'un bouton de reference MonBouton portant l'etiquette Un bouton
getContentPane().add(MonBouton);
//pour ajouter un bouton � une fenetre,il faut incorporer le bouton dans le contenu de la fenetre.la methode getcontentpane de la classe JFrame fournit une reference � ce contenu,de type container permet d'ajouter le bouton au contenu de la fenetre.
}
}
public class Monprog{
public static void main(String args[]){
JFrame fen = new MaFenetre();
fen.setVisible(true);
//rend visible la fenetre de reference fen
}
}
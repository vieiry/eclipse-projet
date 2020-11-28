import java.awt.*;
import javax.swing.*;

class MaFenetre extends JFrame {
private jtextfield;
private JTextField MonChamp1 ;
private JTextField MonChamp2 ;

public MaFenetre () {
super("Une fenetre avec deux champs de texte") ;
setBounds(10,40,300,200) ;
MonChamp1 = new JtextField(20) ;
//champ de taille 20 (la taille est exprimée en nombre
//de caractères standard affichés dans le champ)
Monchamp2 = new JtextField("texte initial", 10) ;
//champ de taille 10 contenant au départ le texte texte
//initial
getContentPane().add(MonChamp1) ;
getContentPane().add(MonChamp2) ;
}
}
public class texteinitial {
public static void main(String args[]) {
JFrame fen = new MaFenetre() ;
fen.setVisible(true) ;
}
}
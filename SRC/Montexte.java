import java.awt.*;
import javax.swing.*;
class MaFenetre extends JFrame{
private Jlabel Mon Texte;
public MaFenetre () {
super("Une fenetre avec une etiquette");
setBounds(10,40,300,200);
Mon Texte = new Jlabel ("texte initial");
getContentPane().add(Mon Texte);
MonTexte.setText("nouveau texte");
}
}
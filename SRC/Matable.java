import java.awt.*;
import javax.swing.*;
class MaFenetre extends JFrame{
private JTextField MonChamp1;
private JTextField MonChamp2;
public MaFenetre (){
super("Une fenetre avec deux champs de texte");
setBounds(10,40,300,200);
MonChamp1 = new JtextField(20);
MonChamp2 = new JtextField("texte initial",10);
getContentPane().add(MonChamp1);
getContentPane().add(MonChamp2);
}
}
public class Matable{
public static void main(String args[]){
JFrame fen = new MaFenetre();
fen.setVisible(true);
//rend visible la fenetre de reference fen
}
}
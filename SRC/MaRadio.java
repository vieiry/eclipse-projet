import java.awt.*;
import javax.swing.*;
class MaFenetre extends JFrame {
private JRadioButton bRouge;
private JRadioButton bVert;
public MaFenetre () {
super("Une fenetre avec des boutons radio");
setBounds(10,40,300,200);
bRouge = new JRadioButton("Rouge");
bVert = new JRadioButton("Vert");
ButtonGroup groupe = new ButtonGroup();
groupe.add(bRouge);groupe.add(bVert);
Container contenu = getContentPane();
contenu.setLayout(new FlowLayout());
contenu.add(bRouge);
contenu.add(bVert);
}
}
public class MaRadio{
public static void main(String args[]){
JFrame fen = new MaFenetre();
fen.setVisible(true);
//rend visible la fenetre de reference fen
}
}
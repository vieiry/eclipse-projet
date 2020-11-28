import java.awt.*;
import javax.swing.*;
class MaFenetre extends JFrame{
private JCheckBox MaCase;
public MaFenetre(){
super("Une fenetre avec une case");
setBounds(10,40,300,200);
MaCase = new JCheckBox("Une case");
//creation d'une case à cocher de reference MaCase portant l,etiquette Une case
getContentPane().add(MaCase);
}
}
public class Moncheck{
public static void main(String args[]){
JFrame fen = new MaFenetre();
fen.setVisible(true);
//rend visible la fenetre de reference fen
}}
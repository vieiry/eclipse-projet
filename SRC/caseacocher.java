import java.awt.*;
import javax.swing.*;
class MaFenetre extends JFrame{
private JCheckBox MaCase;
public MaFenetre () {
super("Une fenetre avec une case") ;
setBounds(10,40,300,200) ;
MaCase = new JCheckBox("Une case") ;
getContentPane().add(MaCase) ;
}
}
public class caseacocher{
public static void main(String args[]) {
JFrame fen = new MaFenetre() ;
fen.setVisible(true) ;
}
}
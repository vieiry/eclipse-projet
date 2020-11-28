import java.awt.*;
import javax.swing.*;

class MaFenetre extends JFrame{
public MaFenetre(){
super("une fenetre");setSize(300,200);
Container contenu = getContentPane();
contenu.setLayout(null);
JButton bouton1 = new JButton("UN");
contenu.add(bouton1);
JButton bouton2 = new JButton("DEUX");
contenu.add(bouton2);
bouton1.setBounds(40,40,80,30);
bouton2.setBounds(120,50,80,30);
}
}
public class MonProgsetBounds{
public static void main(String[] args){
JFrame fen = new MaFenetre();
fen.setVisible(true);
}
}

import java.awt.*;
import javax.swing.*;

class MaFenetre extends JFrame{
public MaFenetre(){
super("une fenetre");setSize(300,200);
Container contenu = getContentPane();
contenu.setLayout(new BorderLayout(10,10));
contenu.add(new JButton("UN"));
contenu.add(new JButton("DEUX"),"North");
contenu.add(new JButton("TROIX"),"South");
contenu.add(new JButton("QUATRE"),"West");
contenu.add(new JButton("CINQ"),"East");
}
}
public class MonProgBLayout{
 public static void main(String args[]){
JFrame fen = new MaFenetre();
fen.setVisible(true);
}
}
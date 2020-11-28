import java.awt.*;
import javax.swing.*;

class MaFenetre extends JFrame{
public MaFenetre(){
super("une fenetre");setSize(300,200);
Container contenu = getContentPane();
contenu.setLayout(new GridLayout(2,2,5,5));
contenu.add(new JButton("UN"));
contenu.add(new JButton("DEUX"));
contenu.add(new JButton("TROIS"));
contenu.add(new JButton("QUATRE"));
}
}
public class MonProgGridLayout{
public static void main(String[] args){
JFrame fen = new MaFenetre();
fen.setVisible(true);
}
}
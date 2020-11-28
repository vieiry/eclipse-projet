import java.awt.*;
import javax.swing.*;

class MaFenetre extends JFrame{
public MaFenetre(){
super("une fenetre");setSize(300,200);
Container contenu = getContentPane();
CardLayout pile = new CardLayout(30,20);
contenu.setLayout(pile);
contenu.add(new JButton("UN"),"bouton1");
contenu.add(new JButton("DEUX"),"bouton2");
contenu.add(new JButton("TROIS"),"bouton3");
pile.next(contenu);
}}

public class MonProgCardLayout{
public static void main(String[] args){
JFrame fen = new MaFenetre();
fen.setVisible(true);
}
}
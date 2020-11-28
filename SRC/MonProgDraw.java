import java.awt.*;
import javax.swing.*;

class MaFenetre extends JFrame{
private JPanel pan;
public MaFenetre(){
super("une fenetre avec une image");setSize(300,200);
pan = new Panneau();
getContentPane().add(pan);
}
}
class Panneau extends JPanel{
private ImageIcon rouge;
public Panneau(){
rouge = new ImageIcon("rouge.jpg");
}

public void paintComponent(Graphics g){
super.paintComponent(g);
Image imRouge = rouge.getImage();
g.drawImage(imRouge,15,10,this);
}
}

public class MonProgDraw{
 public static void main(String args[]){
JFrame fen = new MaFenetre();
fen.setVisible(true);
}
}
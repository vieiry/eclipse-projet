.
import java.awt.* ; 
import java.awt.event.* ;
import javax.swing.* ; 
import javax.swing.event.* ;

class MaFenetre extends JFrame implements
ActionListener {
private JButton MonBouton1, MonBouton2 ;
public MaFenetre () {
super("Une fenetre avec deux boutons") ;
setSize(300, 200) ;
Container contenu = getContentPane() ;
MonBouton1 = new JButton("Bouton 1") ;
contenu.add(MonBouton1) ;
MonBouton2 = new JButton("Bouton 2") ;
contenu.add(MonBouton2) ;
//un même événement peut être traité par plusieurs écouteurs : deux écouteurs sont associés à l’action de l’utilisateur sur le bouton MonBouton1
MonBouton1.addActionListener(this);
//gère l’action de l’utilisateur sur le bouton MonBouton1
MonBouton1.addActionListener(new EcouteurFermer());
//gère la fermeture de la fenêtre lors d’une action de l’utilisateur sur le bouton MonBouton1
MonBouton2.addActionListener(this);
//gère l’action de l’utilisateur sur le bouton MonBouton2
}
public void actionPerformed(ActionEvent e) {
//utilisation de la méthode getSource de la classe
//EventObject qui fournit une référence de type Object sur
//la source de l’événement concerné
//La gestion des événements Un exemple avec des boutons
//Page 72
if(e.getSource() == MonBouton1)
//conversion implicite du type JButton en un type
//ascendant Object
System.out.println("action sur le bouton 1") ;
if(e.getSource() == MonBouton2)
System.out.println("action sur le bouton 2") ;
}
}
class EcouteurFermer implements ActionListener {
public void actionPerformed(ActionEvent e) {
System.exit(0);
}
}
public class MonProgEvtBouton1 {
public static void main(String args[]) {
JFrame fen = new MaFenetre() ;
fen.setVisible(true) ; }
}
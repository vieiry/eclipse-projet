import java.awt.*;
import javax.swing.*;
class MaFenetre extends JFrame{
private JRadioButton bRouge;
private JRadioButton bVert;
public MaFenetre(){
super("Une fenetre avec des boutons radio");
setBounds(10,40,300,2OO);
bRouge = new JRadioButton("rouge");
//creation d'un bouton radio de reference bRouge portant l'etiquette Rouge
bVert = new JRadioButton("vert");
//creation d'un bouton vert radio de reference bVert portant l'etiquette vert
ButtonGroup groupe = new ButtonGroup();
groupe.add(bRouge);groupe.add(bVert);
//un objet de type ButtonGroup (classe du paquetage javax.swing,derivée de la classe Objet)sert uniquement à assurer la desactivation automatique d'un bouton lorsqu'un bouton du groupe est activé.un bouton radio qui n'est pas associé à un groupe,exception faite de son aspect,se comporte exactement comme une case à cocher.
Container contenu = getContentPane();
contenu.setLayout(new FlowLayout());
//un objet de type FlowLayout est un gestionnaire de mise en forme qui dispose les composants les uns à la suite des autres
contenu.add(bRouge);
contenu.add(bVert);
//ajout de chaque bouton radio dans la fenetre. un objet de type ButtonGroup n'est pas un composant et ne peut pas etre ajouté à un conteneur

public class MaRadio{
public static void main(String args[]){
JFrame fen=new MaFenetre();
fen.setVisible(true);
}
}
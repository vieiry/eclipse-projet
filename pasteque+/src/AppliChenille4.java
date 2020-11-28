
import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 * AppliVisage1.java , ce programme affiche deux visages qui circulent sur 
 * 
 * les diagonales de la fenetre 
 *
 */

public class AppliChenille4 {
	public static final int NBCH = 4;
   public static void main(String[] args) {
	   int nbc;
		if (args.length == 0)
        	   nbc = NBCH;
   else
       nbc = Integer.parseInt(args[0]);
      JFrame laFenetre = new JFrame(" CHENILLE");
      laFenetre.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      laFenetre.setSize(512,512);
       
      Dessin d = new Dessin();
      laFenetre.add(d);
      
      laFenetre.setVisible(true);
      

     // System.out.println("Entrez le nombre de chenille : ");
    		  //sc.nextInt();
      int a=0,b=0,r=15;
      
      // creation d'un objet chenille
      ArrayList<Chenille> CHEN = new ArrayList<Chenille>();
     ArrayList<pastek> Past = new ArrayList<pastek>();
     for(int i=0;i<25;i++) {
    	 while(true) {
			 a=(int) (Math.random()*600*Math.random());
			 b=(int) (Math.random()*600*Math.random());
			if(a<500 && b<500)
				break;
		}
    	Past.add( new pastek(a,b,Color.GREEN));
    	 d.ajouterP(Past.get(i));
     }
      //pastek past = new pastek(a,b,Color.GREEN);
      for(int i=0;i<nbc;i++) {
     CHEN.add(new Chenille(d.getLargeur(),d.getHauteur(),r,50,new Color((float) Math.random(),(float) Math.random(),(float) Math.random())));
     d.ajouterObjet(CHEN.get(i));
      }
      boolean bool=false;
      
      // la boucle d'animation
      while (true)
         {
            
            // le visage effectue un déplacement elementaire
    	  
    	  for(int i=0;i<nbc;i++) {
    		  CHEN.get(i).deplacer();
    		  for(int j=0;j<Past.size();j++) {
    		bool=  Past.get(j).efface(CHEN.get(i).tete);
           if(bool) {
        	   d.retirerP(Past.get(j));
            	r=CHEN.get(i).getR()+1;
            	CHEN.get(i).setR(r);
            	
            	}}
            	
    	  }
            
            
            // la zone de dessin se réaffiche
            d.repaint();
            
             // un temps de pause pour avoir le temps de voir le nouveau dessin
            d.pause(60);

         }
      
      
      
   }
   
} // AppliVisage1

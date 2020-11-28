import java.awt.Color;
import java.awt.Graphics;

public class Anneau {
protected int x,y,r;


/**
* crée un Anneau en fixant sa position initiale et son rayon
*/

public Anneau(int xInit,int yInit,int r) { 
	x = xInit;
	y = yInit;
	this.r = r;
}


public void setR(int r) {
	this.r=r;
}
public int getX() {
	return x;
}

public int getY() {
	return y;
}


public void placerA(int px, int py) {
	x=px;
	y=py;
}

public void dessiner(Graphics g) {
	
	g.drawOval( x,  y,  r*2,  r*2);
}
}


class Tete extends Anneau{
private double cap;

	public Tete(int xInit, int yInit, int r,double cap) {
		super(xInit, yInit, r);
	this.cap=cap;
	}
	
	public void dessine(Graphics g) {
		
		g.fillOval( getX(), getY(), r*2, r*2);
	}
	
    public void devierCap(double deltaC) {
    	cap += deltaC;
    	
    }
    
   public boolean atteintBord(int xMax, int yMAX) {
	   
	   if((x <= r) || (x >= xMax - 2*r) || (y <= r) || (y >= yMAX - 2*r)) {
		   return true;
	   }else {
		   return false;
	   }
	   
   }
   
 public void deplacerSelonCap() {

     x = (int) (x + r * Math.cos(Math.PI*cap /180));
     y = (int) (y + r * Math.sin(Math.PI*cap /180));
   }
}



class pastek{
	private int x,y;
	private Color couleur;
	public pastek(int x,int y,Color couleur) {
		this.x = x;
		this.y = y;
		this.couleur= Color.green; 
	}
	
	public void dessinee(Graphics g) {
		g.setColor(couleur);
		g.fillOval(x, y, 30, 30);
	}
	public boolean efface(Tete tete) {
		if((Math.abs((tete.x+tete.r)-x) <= 25 )&&(Math.abs((tete.y+tete.r)-y) <=25)) {
			/**int a=0,b=0;
			while(true) {
				 a=(int) (Math.random()*600*Math.random());
				 b=(int) (Math.random()*600*Math.random());
				if(a<500 && b<500)
					break;
			}
		x=a;y=b;*/
			x=-2*tete.r;y=-2*tete.r;
		return true;
		//this.couleur= new Color((float) Math.random(),(float) Math.random(),(float) Math.random());
		}	
		else 
			return false;
	}
}
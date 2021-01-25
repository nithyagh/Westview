import java.awt.Color;
import java.awt.Graphics;

public class Player { //class header
 
    //instance variables 
    private Color color;
    private int x,y; //position
    private boolean alive;
    private int vx,vy;
    private int mass;
    private int rad;

//constructor
    public void Player() {
        int red = (int)(Math.random()* 256);
        int blue = (int)(Math.random()* 256);
        int green =(int)(Math.random()* 256);
        color = new Color (red,green,blue);
        x=250;
        y=200;
        rad=100;
        alive= true;
        vx = 0;
        vy=0;
        mass=50;
    }
    public void paint(Graphics g) {
        g.fillOval(x,y,rad*2,rad*2);
    }
    
    public int getX() {
        return x;
    }
    public int getRad() {
        return rad;
    }
    
    public void setX(int x) {
        this.x=x;
    }
    public void setVX(int vx) {
        this.vx=vx;
    }
    public void setVY(int vy) {
        this.vy=vy;
    }
    
    public int getY() {
        return y;
    }
    
    public void setY(int y) {
        this.y=y;
    }
    
    
    //add a mass to radius helper method
    
    
    
}

    
    
    //add a mass to radius helper method
    
    
    


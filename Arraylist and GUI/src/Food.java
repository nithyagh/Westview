import java.awt.Color;
import java.awt.Graphics;

public class Food {

    private Color color;
    int x;
	private int y; //position
    private boolean alive;
    private int vx,vy;
    private int mass;
    private int rad;

    
    
    public Food() {
        
        // spawn the enemy randomly on 800x600 screen 
        x= (int) (Math.random()*1000);
        y=(int) (Math.random()*1000);
        //generate a random color by generating random r,b,g values
        int red = (int)(Math.random()* 256);
        int blue = (int)(Math.random()* 256);
        int green =(int)(Math.random()* 256);
        color = new Color (red,green,blue);
        rad = 10;
        vx = 0;
        vy = 0;
        alive = true;
    
    }
    public void paint(Graphics g) {
        
        g.setColor(color);
        g.fillOval(x, y, rad*2, rad*2);
        
    }
    private void setX(int d) {
        // TODO Auto-generated method stub
        this.x=d;
        
    }
    public void add(double vx2,double vy2) {
        x+=vx2;
        y+=vy2;
    }

    public int getRad() {
        // TODO Auto-generated method stub
        return rad;
    }
    public int getX() {
        // TODO Auto-generated method stub
        return x;
    }
    public int getY() {
        // TODO Auto-generated method stub
        return y;
    }
    
}



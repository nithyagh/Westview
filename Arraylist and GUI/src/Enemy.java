import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Enemy {

    private Color color;
    private int x,y; //position
    private boolean alive;
    private int vx,vy;
    private int mass;
    private int rad;
    Rectangle world = new Rectangle(-500,-500,2000,2000);

    
    
    public void Enemy() {
        //have enemy move randomly by setting vx,vy to some random Nonzero value 
        //between -3 & 3
        while (vx == 0 ) {
            vx = (int)(Math.random()*(3+3+1-3));
        }
        
        while (vy == 0) {
            vx = (int)(Math.random()*(3+3+1-3));
        }
        
        
        // spawn the enemy randomly on 800x600 screen 
        x= (int) (Math.random()*800);
        y=(int) (Math.random()*600);
        //generate a random color by generating random r,b,g values
        int red = (int)(Math.random()* 265);
        int blue = (int)(Math.random()* 265);
        int green =(int)(Math.random()* 265);
        color = new Color (red,green,blue);
        //randomize radius
        rad = (int)(Math.random()*50)+10;
        vx = 150/rad;
        vy = 150/rad;
        alive = true;
        
        
        
        
    }
    public void paint(Graphics g) {
        update();
        g.setColor(color);
        g.fillOval(x, y, rad*2, rad*2);
        
        //have the enemy object bounce off the rectangle border
        //using the helper methods(getter) for minX maxX and Y
        
        if( x >= world.getMaxX() || x <= world.getMinX() ) {
            vx*=-1;
        }
        if( y >= world.getMaxY() || y <= world.getMinY()) {
            vy*=-1;
        }
        
    }
    
    public void update() {
        x+=vx;
        y+=vy;
    }
    
    //collision code
    public boolean collide(Enemy en2) { 
        int dx= en2.x - x;
        int dy = en2.y - y;
        int distance = sqrt((dx*dx)+(dy*dy));
        if(distance <= en2.rad + rad) {
            return true;
        } else {
            return false;
        }
    
    }
    private int sqrt(int i) {
        // TODO Auto-generated method stub
        return 0;
    }
    
    
}


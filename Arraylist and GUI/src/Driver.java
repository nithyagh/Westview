import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Driver extends JPanel implements MouseListener, ActionListener{
    
    //Create ArrayList for enemies
    ArrayList<Enemy> enemies = new ArrayList<Enemy>();
    ArrayList<Food> foods = new ArrayList<Food>();
    //ArrayList<Player> players = new ArrayList<Player>();
    Player player = new Player();
  
    public void paint(Graphics g) {
        
        super.paintComponent(g); //proper redrawing of the entire screen 

        //g.fillOval(30, 30, 50, 50);
        //nested for loop for collision
                    } 
        }
        
        //call each Enemy to paint themselves
        for (Enemy e: enemies) {
            e.paint(g);
        }
        for (Food f: foods) {
            f.add(vx,vy);
            f.paint(g);
            f.setX(f.getX()+vx);
        }
            player.paint(g);
    
            //mouse movement                
    double mx= MouseInfo.getPointerInfo().getLocation().getX();
    double my= MouseInfo.getPointerInfo().getLocation().getY();
            
    double px = player.getX();
    double py = player.getY();
    
    double dx= (mx-px);
    double dy = (my-py);
    
    //tan(theta) = dx/dy;
    double theta = Math.atan(dx/dy);
    double vx = ((100/player.getRad())+1)*Math.cos(theta);
    double vy = ((100/player.getRad())+1)*Math.sin(theta);
    
    //adds a setter for the player velocity 
    
    
    
    
    //detect what quadrant you are, 
    
    
    
    
    
    public Driver(){
        JFrame frame = new JFrame("Agar.io");
        frame.setSize(800,600);
        frame.add(this);
        
        /* add 50  Enemies */
        for(int i =0 ; i < 150; i++) {
            enemies.add(new Enemy());
        }    
        for(int i =0 ; i < 150; i++) {
            foods.add(new Food());
        }    
        
        
        Timer t = new Timer(16, this); //chose swing library for import, 16 times per second
        t.start();
        
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
        
    
    
    public static void main(String[] arg) {
        Driver d = new Driver();
    }
    
    @Override
    public void mouseClicked(MouseEvent arg0) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseEntered(MouseEvent arg0) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseExited(MouseEvent arg0) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mousePressed(MouseEvent arg0) {
        // TODO Auto-generated method stub
        //System.out.println("here");
    }

    @Override
    public void mouseReleased(MouseEvent arg0) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        repaint(); //timer will invoke this method, refreshes the screen
                   //for animations
        
    }
}


package face;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;


public class Face {
    
    private int xPos,yPos, diameter;
    private Color color;
    private Graphics g;
    
    public Face(Graphics g, int x, int y){
        xPos=x;
        yPos=y;
        this.g = g;
        diameter=100;
        color=Color.red;
    }
    
    public void draw(){
        drawHead();
        drawEyes();
        drawMouth();
    }
    
    private void drawHead(){
        g.setColor(color);
        g.fillOval(xPos, yPos, diameter, diameter);
    }
    private void drawEyes(){
        g.setColor(Color.yellow);
        g.fillOval(xPos +(int)(.2 * diameter), yPos +(int)(.2 * diameter), (int)(diameter *.25), (int)(diameter * .25));
        g.fillOval(xPos +(int)(.55 * diameter), yPos +(int)(.2 * diameter), (int)(diameter *.25), (int)(diameter * .25));
    }
    private void drawMouth(){
        int mx,my;
        mx = xPos +(int)(.3 * diameter);
        my = yPos +(int)(.8 * diameter);
        g.setColor(Color.black);
        //main mouth
        g.drawLine(mx, my, mx +(int)(.4 * diameter), my);
        //left side
        g.drawLine(mx, my, mx -(int)(.1 * diameter), my-(int)(.1 * diameter));
        //right side
        g.drawLine(mx+(int)(.4 * diameter), my, mx +(int)(.5 * diameter), my-(int)(.1 * diameter));
    }
    public void erase(){
        g.setColor(Color.white);
        g.fillRect(xPos-10, yPos-10,diameter+20, diameter+20);
    }
    public void move(int newx,int newy){
        newy = yPos;
        newx = xPos;
    }
    
    public void newColor(Color c){
        color = c;
    }
}

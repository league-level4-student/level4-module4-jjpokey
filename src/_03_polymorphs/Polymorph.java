package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
    protected int x;
    protected int y;
    protected int width;
    protected int height;
    protected int mx;
    protected int my;
   
    Polymorph(int x, int y, int width, int height){
   	 this.x = x;
   	 this.y = y;
   	 this.width = width;
   	 this.height = height;
    }
    
    public void update(int mx,int my){
   	 
    }
    
    public abstract void draw(Graphics g);
}

package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener, MouseMotionListener{
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    int mx;
    int my;
    
    private JFrame window;
    private Timer timer;
    ArrayList<Polymorph> polyList = new ArrayList<Polymorph>();
    
    
    public static void main(String[] args) {
   	 new PolymorphWindow().buildWindow();
    }
    
    public void buildWindow(){
   	 window = new JFrame("IT'S MORPHIN' TIME!");
   	 window.add(this);
   	 window.getContentPane().setPreferredSize(new Dimension(500, 500));
   	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 window.pack();
   	 window.setVisible(true);
   	 window.addMouseMotionListener(this);
   	 polyList.add(new BluePolymorph(50, 100, 50, 50));
   	polyList.add(new RedPolymorph(50, 50, 50, 50));
   	polyList.add(new MovingMorph(100, 100, 50, 50));
   	polyList.add(new FollowMorph(150, 150, 50, 50));
   	 
   	 
   	 timer = new Timer(1000 / 10, this);
   	 timer.start();

   	 
   	 
   	 
   	 
   	 
    }
    
    public void paintComponent(Graphics g){
    //draw background
   	 g.setColor(Color.LIGHT_GRAY);
   	 g.fillRect(0, 0, 500, 500);
   	
   	 //draw polymorph
   	for(int i = 0; i < polyList.size(); i++) {
  		 polyList.get(i).draw(g);
  		
  	 }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
   	 repaint();

   	for(int i = 0; i < polyList.size(); i++) {
   	polyList.get(i).update(mx,my);
   	}
    }

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		mx = e.getX();
		my = e.getY();
		
		System.out.println(e.getX());
	}
}

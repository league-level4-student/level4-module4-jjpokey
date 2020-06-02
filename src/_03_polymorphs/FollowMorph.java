package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;


public class FollowMorph extends Polymorph {


	FollowMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
		
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.yellow);
		g.fillRect(x, y, width, height);
		
	}

	public void update(int mx, int my) {
		x = mx;
		y = my;
		
	}
	
	



	
}

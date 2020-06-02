package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MovingMorph extends Polymorph{
	
	MovingMorph(int x, int y, int width, int height) {
		super(x,y,width, height);
		
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.green);
		g.fillRect(x, y, width, height);
		
	}

	public void update(int mx, int my) {
			x = x + 1;
		
	}
}

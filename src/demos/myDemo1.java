package demos;

import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.providers.Microsoft;
import de.fhpotsdam.unfolding.utils.MapUtils;
import processing.core.PApplet;

public class myDemo1 extends PApplet{
	private UnfoldingMap map;
	
	public void setup() {
		size(800,600,OPENGL);
		map = new UnfoldingMap(this,50,50,700,500, new Microsoft.HybridProvider());
		MapUtils.createDefaultEventDispatcher(this, map);
		/*
		-----
		*/
	}
	
	public void draw() {
		map.draw();
		drawButtons();
	}
	
	public void keyPressed() {
		if(key == 'r') {
			background(255,0,0);
		}
		else if(key != 'r') {
			background(200,200,200);
		}
	}
	
	private void drawButtons() {
		fill(255,255,255);
		rect(200,100,25,25);
		
		fill(0,0,0);
		rect(200,150,25,25);
	}
	
	public void mouseReleased() {
		if (mouseX > 200 && mouseX < 225 
			&& mouseY > 100 && mouseY < 125) {
			background(255,255,255);
		}
		else if (mouseX > 200 && mouseX < 225 
			       && mouseY > 150 && mouseY < 175) {
			background(100,100,100);
		}
	}
}

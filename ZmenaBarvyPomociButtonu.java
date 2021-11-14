package Barvy;

import java.awt.*;
import javax.swing.*;

public class ZmenaBarvyPomociButtonu {

	public static void main(String[] args) throws InterruptedException {
		
		JFrame frame = new JFrame("Zmena barvy");
		
		final JToggleButton cervena = new JToggleButton("Cervena");
		cervena.setForeground(Color.RED);
		cervena.setBackground(Color.WHITE);
		
		frame.add(cervena);
		
		final JToggleButton zelena = new JToggleButton("Zelena");
		zelena.setForeground(Color.GREEN);
		zelena.setBackground(Color.WHITE);
		
		frame.add(zelena);
		
		final JToggleButton modra = new JToggleButton("Modra");
		modra.setForeground(Color.BLUE);
		modra.setBackground(Color.WHITE);
		
		frame.add(modra);
		
		frame.setSize(300, 200);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setLayout(new FlowLayout());	
		frame.setVisible(true);
		
		int a,b,c;
		a = 0;
		b = 0;
		c = 0;
		
		while(true) {
			Thread.sleep(10);
			if(cervena.isSelected()) {
				a = 255;
				frame.getContentPane().setBackground(new Color(a,b,c));
				
			}
			else {
				a = 0;
			}
			if(zelena.isSelected()) {
				b = 255;
				frame.getContentPane().setBackground(new Color(a,b,c));
				
			}
			else {
				b = 0;
			}
			if(modra.isSelected()) {
				c = 255;
				frame.getContentPane().setBackground(new Color(a,b,c));
				
			}
			else {
				c = 0;
			}
		}
			
	}
}
package Barvy;

import java.awt.*;
import javax.swing.*;

public class ZmenaBarvyPomociSlideru {

	public static void main(String[] args) throws InterruptedException {
		
		JFrame frame = new JFrame("Zmena barvy");
		frame.setSize(400,400);
		frame.getContentPane().setBackground(Color.WHITE);
		
		JSlider sliderCervena = new JSlider(0,255,0);
		sliderCervena.setBackground(Color.RED);
		JSlider sliderZelena = new JSlider(0,255,0);
		sliderZelena.setBackground(Color.GREEN);
		JSlider sliderModra = new JSlider(0,255,0);
		sliderModra.setBackground(Color.BLUE);
		
		JLabel red = new JLabel("R");
		red.setForeground(Color.WHITE);
		JLabel green = new JLabel("G");
		green.setForeground(Color.WHITE);
		JLabel blue = new JLabel("B");
		blue.setForeground(Color.WHITE);
		
		
		frame.add(sliderCervena);
		frame.add(red);
		frame.add(sliderZelena);
		frame.add(green);
		frame.add(sliderModra);
		frame.add(blue);
	
		frame.setLayout(new FlowLayout());	
		
		frame.setVisible(true);
		
		while(true) {
			Thread.sleep(10);
			frame.getContentPane().setBackground(new Color(sliderCervena.getValue(), sliderZelena.getValue(),sliderModra.getValue()));
		}
	}
}

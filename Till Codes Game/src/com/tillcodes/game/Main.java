package com.tillcodes.game;

import java.awt.Canvas;

import javax.swing.JFrame;

public class Main extends Canvas implements Runnable{

	private static final long serialVersionUID = 1L;

	
	public static final int WIDTH = 860;
	public static final int HEIGHT = 620;
	
	public static final String NAME = "Game"; 
	
	private JFrame frame;
	
	private boolean running = false;
	
	public void run() {
		
		while(running){
			
			
			
		}
		
	}

	public Main(){
		
		this.setSize(WIDTH, HEIGHT);
		
		frame = new JFrame(NAME);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setResizable(false);
		
		frame.add(this);
		frame.pack();
		
		frame.setLocationRelativeTo(null);
		
		frame.setVisible(true);
		
		start();
	}
	
	private synchronized void start() {
		running = true;
	}

	@SuppressWarnings("unused")
	private synchronized void stop() {
		running = false;
	}
	
	public static void main(String[] args){
		
		new Thread(new Main()).start();
		
	}
	
}

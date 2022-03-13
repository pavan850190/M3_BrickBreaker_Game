import java.awt.*;

import java.awt.event.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.*;

/**
 * Game Main class that specifies the frame and widgets of the GUI
 */
public class Game implements Runnable {

	private static int maxScore;
	
    public void run() {
    	JFrame frame0 = new JFrame("Enhanced Brickbreaker Start Menu");
    	frame0.setLocation(300,300);
    	
    	JPanel menu = new JPanel(new GridLayout(3,1));
    	
    	JButton start = new JButton("Start Game");
    	start.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	frame0.setVisible(false);
                runGame();
            }
        });
    	
    	menu.add(start);
    	
    	frame0.add(menu);
    	
    	frame0.pack();
    	frame0.setSize(800,500);
        frame0.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame0.setVisible(true);
    	
    	
        
    }
    public static void runGame() {
    	final JFrame frame = new JFrame("Enhanced Brickbreaker");
        frame.setLocation(300, 300);
        
        // Status panel
        final JPanel status_panel = new JPanel(new GridLayout(1,3));
        frame.add(status_panel, BorderLayout.SOUTH);
        final JLabel status = new JLabel("Running...");
        status_panel.add(status);
        
        final JLabel score = new JLabel("Score: "   + 0);
        status_panel.add(score); 
    
        
        final JLabel highScore = new JLabel("High Score: " + 0);
        status_panel.add(highScore);

        // Main playing area
        final GameCourt court = new GameCourt(status, score, highScore);
        frame.add(court, BorderLayout.CENTER);
   

        // Reset button
        final JPanel control_panel = new JPanel(new GridLayout(1,3));
        frame.add(control_panel, BorderLayout.NORTH);

        final JButton reset = new JButton("Reset");
        reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                court.reset();
            }
        });
        control_panel.add(reset);
        
        final JButton quit = new JButton("Quit");
        quit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
        control_panel.add(quit);

        // Put the frame on the screen
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        // Start game
        court.newGame();
    }
    
    public static void loadOld() {
    	final JFrame frame = new JFrame("Enhanced Brickbreaker");
        frame.setLocation(300, 300);
        
        
        // Status panel
        final JPanel status_panel = new JPanel(new GridLayout(1,3));
        frame.add(status_panel, BorderLayout.SOUTH);
        final JLabel status = new JLabel("Running...");
        status_panel.add(status);
        
        final JLabel score = new JLabel("Score: "   + 0);
        status_panel.add(score);
        
     
        
        final JLabel highScore = new JLabel("High Score: " + 0);
       status_panel.add(highScore);
       

        // Main playing area
        final GameCourt court = new GameCourt(status, score, highScore);
        frame.add(court, BorderLayout.CENTER);
   

        // Reset button
        final JPanel control_panel = new JPanel(new GridLayout(1,3));
        frame.add(control_panel, BorderLayout.NORTH);

        final JButton reset = new JButton("Reset");
        reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                court.reset();
            }
        });
        control_panel.add(reset);
        
        final JButton quit = new JButton("Quit");
        quit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
        control_panel.add(quit);
        
        final JButton save = new JButton("Save and Quit");
        save.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                court.saveGame();
                frame.dispose();
            }
        });
        control_panel.add(save);

        // Put the frame on the screen
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Start game
        court.loadGame();
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Game());
    }
}

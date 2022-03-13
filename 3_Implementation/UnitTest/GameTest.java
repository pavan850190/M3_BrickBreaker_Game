import org.junit.*;
import static org.junit.Assert.*;

import java.io.File;
import java.util.NoSuchElementException;

import javax.swing.JLabel;

import org.junit.Test;

public class GameTest {

	  @Test
	  public void testLoseCondition() {
	  	GameCourt court = new GameCourt(new JLabel(), new JLabel(), new JLabel());
	  	court.newGame();
	  	court.getBall().setPy(460);
	  	court.tick();
	  	assertEquals(false, court.playingState());
	  }
	  
	  @Test
	  public void testPlayingCondition() {
	  	GameCourt court = new GameCourt(new JLabel(), new JLabel(), new JLabel());
	  	court.newGame();
	  	court.tick();
	  	assertEquals(true, court.playingState());
	  }
	  
	  
	  @Test
	  public void testWinCondition() {
	  	GameCourt court = new GameCourt(new JLabel(), new JLabel(), new JLabel());
	  	court.newGame();
	  	court.getBall().setVy(0);
	  	court.getBall().setVx(0);
	  	for(int row = 0; row < court.getBricks().length; row++) {
	  		for(int col = 0; col < court.getBricks()[0].length; col++) {
	  			court.getBricks()[row][col].setState(0);
	  		}
	  	}
	  	court.tick();
	  	assertEquals(false, court.playingState());
	  	
	  }	
	  
	  @Test
	  public void testGameStartScore() {
	  	GameCourt court = new GameCourt(new JLabel(), new JLabel(), new JLabel());
	  	court.newGame();
	  	assertEquals(0, court.getScore());
	  }
	  
	 
	  
	  @Test
	  public void testNormalBrickCollision() {
	  	GameCourt court = new GameCourt(new JLabel(), new JLabel(), new JLabel());
	  	court.newGame();
	  	court.getBricks()[5][8].collisionReact();
	  	assertEquals(1, court.getBricks()[5][8].getStatus());	
	  }	
}
	 
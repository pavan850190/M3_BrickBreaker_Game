import org.junit.*;
import static org.junit.Assert.*;

import java.io.File;
import java.util.NoSuchElementException;

import javax.swing.*;

import org.junit.Test;

public class Gameplay_test {

	  @Test
	  public void testLoseCondition() {
	  	Gameplay tb = new Gameplay();
	  	tb.ballposX();
	  	assertEquals(120, tb.play());
	  }
	  
	  @Test
	  public void testPlayingCondition() {
	  	Gameplay tb = new Gameplay();
	  	tb.ballposY();
	  	assertEquals(350, tb.play());
	  }
	  
	  
	  @Test
	  public void testWinCondition() {
	  	Gameplay tb = new Gameplay();
	  	tb.totalBricks();
	  	assertEquals(0, tb.play());
	  }	
	  
	  @Test
	  public void testGameStartScore() {
	  	Gameplay tb = new Gameplay(  );
	  	tb.score();
	  	assertEquals(0, tb.play());
	  }
  
    

}

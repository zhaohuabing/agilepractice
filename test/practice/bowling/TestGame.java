package practice.bowling;

import junit.framework.TestCase;

public class TestGame extends TestCase
{

//    public void testoneThrow()
//    {
//	Game g = new Game();
//	g.addThrow(5);
//	assertEquals(5,g.score());
//    }
    
    public void testtwoThrow()
    {
	Game g = new Game();
	g.addThrow(5);
	g.addThrow(4);
	assertEquals(9,g.scoreForFrame(1));
    }
    
    public void testthreeThrow()
    {
	Game g = new Game();
	g.addThrow(5);
	g.addThrow(5);
	g.addThrow(4);
	assertEquals(14,g.scoreForFrame(1));
	assertEquals(14,g.score());
    }
    
    public void testsixThrow()
    {
	Game g = new Game();
	g.addThrow(5);
	g.addThrow(5);
	g.addThrow(10);
	g.addThrow(5);
	g.addThrow(5);
	g.addThrow(4);
	assertEquals(20,g.scoreForFrame(1));
	assertEquals(40,g.scoreForFrame(2));
	assertEquals(54,g.scoreForFrame(3));
	assertEquals(54,g.score());
    }

}

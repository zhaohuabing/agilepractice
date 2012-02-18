package practice.bowling;

import junit.framework.TestCase;

public class TestGame extends TestCase
{
    private Game g;

    protected void setUp() throws Exception
    {
	g = new Game();
    }
    public void testtwoThrow()
    {
	g.addThrow(5);
	g.addThrow(4);
	assertEquals(9, g.scoreForFrame(1));
    }

    public void testthreeThrow()
    {
	g.addThrow(5);
	g.addThrow(5);
	g.addThrow(4);
	assertEquals(14, g.scoreForFrame(1));
	assertEquals(14, g.score());
    }

    public void testsixThrow()
    {
	g.addThrow(5);
	g.addThrow(5);
	
	g.addThrow(10);
	
	g.addThrow(5);
	g.addThrow(5);
	
	g.addThrow(4);
	assertEquals(20, g.scoreForFrame(1));
	assertEquals(40, g.scoreForFrame(2));
	assertEquals(54, g.scoreForFrame(3));
	assertEquals(54, g.score());
    }
    
    public void testtenThrow()
    {
	g.addThrow(5);
	g.addThrow(5);//20
	
	g.addThrow(10);//20
	
	g.addThrow(5);
	g.addThrow(5);//14
	
	g.addThrow(4);
	g.addThrow(4);//8
	
	g.addThrow(4);
	g.addThrow(4);//8
	
	g.addThrow(4);
	g.addThrow(4);//8
	
	g.addThrow(4);
	g.addThrow(4);//8
	
	g.addThrow(4);
	g.addThrow(4);//8
	
	g.addThrow(4);
	g.addThrow(4);//8
	
	g.addThrow(4);
	g.addThrow(4);//8
	assertEquals(20, g.scoreForFrame(1));
	assertEquals(40, g.scoreForFrame(2));
	assertEquals(54, g.scoreForFrame(3));
	assertEquals(110, g.scoreForFrame(10));
	assertEquals(110, g.score());
    }
    
    public void testtenThrowSpare()
    {
	g.addThrow(5);
	g.addThrow(5);//20
	
	g.addThrow(10);//20
	
	g.addThrow(5);
	g.addThrow(5);//14
	
	g.addThrow(4);
	g.addThrow(4);//8
	
	g.addThrow(4);
	g.addThrow(4);//8
	
	g.addThrow(4);
	g.addThrow(4);//8
	
	g.addThrow(4);
	g.addThrow(4);//8
	
	g.addThrow(4);
	g.addThrow(4);//8
	
	g.addThrow(4);
	g.addThrow(4);//8
	
	g.addThrow(4);
	g.addThrow(6);//16
	
	g.addThrow(6);//
	assertEquals(20, g.scoreForFrame(1));
	assertEquals(40, g.scoreForFrame(2));
	assertEquals(54, g.scoreForFrame(3));
	assertEquals(118, g.scoreForFrame(10));
	assertEquals(118, g.score());
    }

    public void testtenThrowStrike()
    {
	g.addThrow(5);
	g.addThrow(5);//20
	
	g.addThrow(10);//20
	
	g.addThrow(5);
	g.addThrow(5);//14
	
	g.addThrow(4);
	g.addThrow(4);//8
	
	g.addThrow(4);
	g.addThrow(4);//8
	
	g.addThrow(4);
	g.addThrow(4);//8
	
	g.addThrow(4);
	g.addThrow(4);//8
	
	g.addThrow(4);
	g.addThrow(4);//8
	
	g.addThrow(4);
	g.addThrow(4);//8
	
	g.addThrow(10);//22
	
	g.addThrow(6);	
	g.addThrow(6);
	assertEquals(20, g.scoreForFrame(1));
	assertEquals(40, g.scoreForFrame(2));
	assertEquals(54, g.scoreForFrame(3));
	assertEquals(124, g.scoreForFrame(10));
	assertEquals(124, g.score());
    }
    
    public void testtenThrowStrike10()
    {
	g.addThrow(5);
	g.addThrow(5);//20
	
	g.addThrow(10);//20
	
	g.addThrow(5);
	g.addThrow(5);//14
	
	g.addThrow(4);
	g.addThrow(4);//8
	
	g.addThrow(4);
	g.addThrow(4);//8
	
	g.addThrow(4);
	g.addThrow(4);//8
	
	g.addThrow(4);
	g.addThrow(4);//8
	
	g.addThrow(4);
	g.addThrow(4);//8
	
	g.addThrow(4);
	g.addThrow(4);//8
	
	g.addThrow(10);//22
	
	g.addThrow(10);	
	g.addThrow(10);
	assertEquals(20, g.scoreForFrame(1));
	assertEquals(40, g.scoreForFrame(2));
	assertEquals(54, g.scoreForFrame(3));
	assertEquals(132, g.scoreForFrame(10));
	assertEquals(132, g.score());
    }

}

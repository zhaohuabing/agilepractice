import junit.framework.TestCase;


public class TestTurnstile extends TestCase
{

    @Override
    protected void setUp() throws Exception
    {
	Turnstile turnstile = new Turnstile();
	turnstile.reset();
    }
    
    public void testInit()
    {
	Turnstile turnstile = new Turnstile();
	assertTrue(turnstile.isLocked());
	assertTrue(!turnstile.isAlarm());
    }
    
    public void testCoin()
    {
	Turnstile turnstile = new Turnstile();
	turnstile.coin();
	assertTrue(!turnstile.isLocked());
    }
    
    public void testCoinAndPass()
    {
	Turnstile turnstile = new Turnstile();
	turnstile.coin();
	assertTrue(!turnstile.isLocked());
	
	turnstile.pass();
	assertTrue(turnstile.isLocked());
    }
    
    public void testPassWhenLocked()
    {
	Turnstile turnstile = new Turnstile();
	turnstile.pass();
	assertTrue(turnstile.isAlarm());
    }
    
    
}

package practice.pattern.command;

import junit.framework.TestCase;

public class TestSleepCommand extends TestCase
{
    private  boolean isWakeUp=false;
    public void testSleep()
    {
	 Command wakeUp =new Command()
	{

	    @Override
	    public void execute()
	    {
		isWakeUp=true;
	    }
	    
	};
	ActiveObjectEngine e = new ActiveObjectEngine();
	SleepCommand sleepCommand = new SleepCommand(1000,e,wakeUp);
	e.addCommand(sleepCommand);
	long start = System.currentTimeMillis();
	e.run();
	long end = System.currentTimeMillis();
	long sleepTime = end-start;

	assertTrue("sleepTime"+sleepTime +" expected >1000",sleepTime>1000);
	assertTrue("sleepTime"+sleepTime +" expected <1100",sleepTime<1100);
	assertTrue(isWakeUp);
    }
}

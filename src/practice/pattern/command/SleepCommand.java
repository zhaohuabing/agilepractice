package practice.pattern.command;

public class SleepCommand implements Command
{
	private long sleepTime;
	private boolean started = false;
	private long startTime;
	private ActiveObjectEngine engine;
	private Command wakeup;

	public SleepCommand(long milliseconds, ActiveObjectEngine e, Command c)
	{
		this.sleepTime = milliseconds;
		this.engine = e;
		this.wakeup = c;
	}

	@Override
	public void execute()
	{
		long currentTime = System.currentTimeMillis();
		if (!started)
		{
			startTime = currentTime;
			started = true;
			engine.addCommand(this);
		} else if (currentTime - startTime < sleepTime)
		{
			engine.addCommand(this);
		} else
		{
			engine.addCommand(wakeup);
		}
	}

}

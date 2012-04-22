package practice.pattern.command;

public class DelayedTyper implements Command
{
	private int typeChar;
	private long delay;
	ActiveObjectEngine engine;
	private static boolean isStop = false;

	public static void main(String[] args)
	{
		Command stopCommand = new Command()
		{

			@Override
			public void execute()
			{
				isStop = true;

			}
		};
		ActiveObjectEngine engine = new ActiveObjectEngine();
		engine.addCommand(new DelayedTyper(1, 100, engine));
		engine.addCommand(new DelayedTyper(3, 300, engine));
		engine.addCommand(new DelayedTyper(5, 500, engine));
		engine.addCommand(new DelayedTyper(7, 700, engine));
		engine.addCommand(new SleepCommand(10000, engine, stopCommand));
		engine.run();
	}

	public DelayedTyper(int typeChar, long delay, ActiveObjectEngine e)
	{
		super();
		this.typeChar = typeChar;
		this.delay = delay;
		this.engine = e;
	}

	@Override
	public void execute()
	{
		System.out.print(this.typeChar);
		if (!isStop)
			engine.addCommand(new SleepCommand(this.delay, engine, this));

	}
}

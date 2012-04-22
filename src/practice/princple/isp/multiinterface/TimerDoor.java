package practice.princple.isp.multiinterface;

import practice.princple.isp.Door;
import practice.princple.isp.Timer;
import practice.princple.isp.TimerClient;

public class TimerDoor implements TimerClient, Door
{
	private Timer timer;

	public TimerDoor()
	{
		timer.register(10, 0, this);
	}

	@Override
	public void lock()
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void unlock()
	{
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isDoorOpen()
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void timeOut(int timeOutID)
	{
		// TODO Auto-generated method stub

	}

}

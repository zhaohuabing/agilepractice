package practice.princple.isp.adapter;

import practice.princple.isp.Door;
import practice.princple.isp.Timer;

public class TimerDoor implements Door
{
	private Timer timer;

	public TimerDoor()
	{
		timer.register(10, 0, new DoorTimerAdapter(this));
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

	public void doorTimeOut(int timeOutID)
	{

	}

}

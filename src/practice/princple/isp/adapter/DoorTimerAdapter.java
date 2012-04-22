package practice.princple.isp.adapter;

import practice.princple.isp.TimerClient;

public class DoorTimerAdapter implements TimerClient
{
	private TimerDoor timerDoor;

	public DoorTimerAdapter(TimerDoor timerDoor)
	{
		super();
		this.timerDoor = timerDoor;
	}

	@Override
	public void timeOut(int timeOutID)
	{
		timerDoor.doorTimeOut(timeOutID);
	}

}

public class Locked implements TurnstileState
{

	@Override
	public void coin()
	{
		Turnstile.locked = false;
		Turnstile.state = Turnstile.UNLOCKED;
	}

	@Override
	public void pass()
	{
		Turnstile.alarm = true;
	}

}

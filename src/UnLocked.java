public class UnLocked implements TurnstileState
{
	public void coin()
	{
		Turnstile.refund = true;
	}

	@Override
	public void pass()
	{
		Turnstile.locked = true;
		Turnstile.state = Turnstile.LOCKED;
	}
}

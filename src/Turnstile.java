public class Turnstile
{
    protected static final TurnstileState LOCKED = new Locked();
    protected static final TurnstileState UNLOCKED = new UnLocked();
    protected static boolean locked = true;
    protected static boolean alarm = false;

    protected static boolean refund = false;

    protected static TurnstileState state = LOCKED;

    public boolean isLocked()
    {
	return locked;
    }

    public void coin()
    {
	state.coin();

    }

    public void pass()
    {
	state.pass();

    }

    public boolean isAlarm()
    {
	return alarm;
    }

    public void reset()
    {
	state = LOCKED;
	locked = true;
	alarm = false;
	refund = false;
	
    }

}

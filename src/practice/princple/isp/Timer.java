package practice.princple.isp;

public interface Timer
{
    void register(int timeout, int timeOutID,TimerClient client);
}

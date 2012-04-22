package practice.salary;

public class TimeCard
{
	private String date;
	private int hour;
	private int employeeId;

	public TimeCard(String date, int hour, int employeeId)
	{
		this.date = date;
		this.hour = hour;
		this.employeeId = employeeId;
	}

	public int getHour()
	{
		return hour;
	}

	public String getDate()
	{
		return this.date;
	}

}

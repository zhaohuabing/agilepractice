package practice.salary;

import java.util.Date;

public class TimeCard
{
	private Date date;
	private int hour;
	private int employeeId;

	public TimeCard(Date date, int hour, int employeeId)
	{
		this.date = date;
		this.hour = hour;
		this.employeeId = employeeId;
	}

	public int getHour()
	{
		return hour;
	}

	public Date getDate()
	{
		return this.date;
	}

}

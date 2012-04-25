package practice.salary;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PayrollDatabase
{
	private Map<Integer, Employee> map = new HashMap<Integer, Employee>();
	private Map<Integer, Employee> unionMap = new HashMap<Integer, Employee>();

	private static PayrollDatabase instance = new PayrollDatabase();

	private void PayrollDatabase()
	{

	}

	public static PayrollDatabase getInstance()
	{
		return instance;
	}

	public Employee getEmployee(int id)
	{
		return map.get(id);
	}

	public void addEmployee(Employee e)
	{
		map.put(e.getId(), e);

	}

	public void deleteEmployee(int id)
	{
		map.remove(id);

	}

	public void AddUnionMember(int memberId, Employee e)
	{
		unionMap.put(memberId, e);

	}

	public Employee getUnionMember(int memberId)
	{
		return unionMap.get(memberId);
	}
	
	public int[] getAllEmployeeIds()
	{		
		int[] employids = new int[map.size()];
		int i=0;
		Iterator<Integer> it = this.map.keySet().iterator();
		while(it.hasNext())
		{
	       		employids[i++]=it.next().intValue();
		}
		return employids;
	}
}

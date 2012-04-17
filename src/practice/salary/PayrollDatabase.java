package practice.salary;

import java.util.HashMap;
import java.util.Map;

public class PayrollDatabase
{
    private Map<Integer,Employee> map= new HashMap<Integer,Employee>();
    
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
}

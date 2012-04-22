package practice.princple.strategy;

public class BubbleSorter
{
	private SortHandle sortHandle;

	public BubbleSorter(SortHandle sortHandle)
	{
		super();
		this.sortHandle = sortHandle;
	}

	public void sort()
	{
		for (int i = 0; i < sortHandle.length(); i++)
		{
			for (int j = i + 1; j < sortHandle.length(); j++)
			{
				if (sortHandle.outOfOrder(i, j))
				{
					sortHandle.swap(i, j);
				}
			}
		}
	}

}

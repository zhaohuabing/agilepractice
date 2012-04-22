package practice.princple.templatemethod;

public abstract class BubbleSorter
{
	protected int length = 0;

	public void sort()
	{
		for (int i = 0; i < length; i++)
		{
			for (int j = i + 1; j < length; j++)
			{
				if (outOfOrder(i, j))
				{
					swap(i, j);
				}
			}
		}
	}

	public abstract void swap(int i, int j);

	public abstract boolean outOfOrder(int i, int j);
}

package practice.princple.strategy;

public interface SortHandle
{
	void swap(int i, int j);

	boolean outOfOrder(int i, int j);

	int length();
}

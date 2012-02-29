package practice.princple.strategy;

import junit.framework.TestCase;

public class TestBubbleSoter extends TestCase
{
    public void testIntBubbleSorter()
    {
	int[] array = { 4, 5, 7, 2, 9, 0, 6, 3, 4, 0, 1, 6 };
	SortHandle sorter = new IntSortHandle(array);
	new BubbleSorter(sorter).sort();

	assertEquals(array[0], 9);
	assertEquals(array[1], 7);
	assertEquals(array[2], 6);
	assertEquals(array[11], 0);
    }
}

package practice.bowling;

class Score
{
    private int[] hitPinsOfEveryThrow = new int[21];
    private int currentThrow = 0;
    private int ball = 0;

    public void addThrow(int pins)
    {
	hitPinsOfEveryThrow[currentThrow++] = pins;
    }

    public int scoreForFrame(int frame)
    {
	int score = 0;
	ball = 0;
	for (int currentFrame = 0; currentFrame < frame;currentFrame++)
	{
	    // È«ÖÐ
	    if (strike())
	    {
		score = score + 10 + scoreOfNextTwoThrowForStrike();
		
		ball++;
	    }
	    // ²¹ÖÐ
	    else if (spare())
	    {
		score = score + 10 + scoreOfNextThrowForSpare();

		ball += 2;
	    }
	    else
	    {
		score = score + hitPinsOfEveryThrow[ball]
			+ hitPinsOfEveryThrow[ball + 1];

		ball += 2;
	    }

	}
	return score;
    }

    private boolean strike()
    {
	return hitPinsOfEveryThrow[ball] == 10;
    }

    private boolean spare()
    {
	return hitPinsOfEveryThrow[ball]
		+ hitPinsOfEveryThrow[ball + 1] == 10;
    }

    private int scoreOfNextTwoThrowForStrike()
    {
	return hitPinsOfEveryThrow[ball + 1]
		+ hitPinsOfEveryThrow[ball + 2];
    }

    private int scoreOfNextThrowForSpare()
    {
	return hitPinsOfEveryThrow[ball + 2];
    }

}
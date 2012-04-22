package practice.bowling;

public class Game
{
	private int currentFrame = 0;

	private boolean isFirstThrowOfFrame = true;

	private Score score = new Score();

	public void addThrow(int pins)
	{
		score.addThrow(pins);
		recordCurrentFrame(pins);
	}

	private void recordCurrentFrame(int pins)
	{
		if (isFirstThrowOfFrame)
		{
			if (pins == 10)// Strike
			{
				currentFrame++;
			} else
			{
				isFirstThrowOfFrame = false;
			}
		} else
		{
			currentFrame++;
			isFirstThrowOfFrame = true;
		}

		// 最大轮数为10
		if (currentFrame > 10)
		{
			currentFrame = 10;
		}
	}

	public int score()
	{
		return scoreForFrame(currentFrame);
	}

	public int scoreForFrame(int frame)
	{
		return score.scoreForFrame(frame);
	}

}

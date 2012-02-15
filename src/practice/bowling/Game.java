package practice.bowling;

public class Game
{
    private int score = 0;
    private int currentFrame = 0;
    private int[] throwScroes = new int[21];
    private int currentThrow = 0;
    private boolean firstThrow = true;

    public void addThrow(int pins)
    {
	throwScroes[currentThrow++]=pins;
	if(firstThrow)
	{
	    if(pins==10)
	    {
		currentFrame++;
	    }
	    else
	    {
		firstThrow = false;
	    }
	}
	else
	{
	    currentFrame++;
	    firstThrow=true;
	}
    }

    public int score()
    {
	return scoreForFrame(currentFrame);
    }

    public int scoreForFrame(int frame)
    {
	int score = 0;
	int currentFrame =0;
	int currentThrow=0;
	for (currentFrame = 0; currentFrame < frame; )
	{
	    int throw1= throwScroes[currentThrow];
	    score+=throw1;
	    if(throw1==10)
	    {
		score=score+ throwScroes[currentThrow+1]+throwScroes[currentThrow+2];
		currentFrame++;	
		currentThrow++;
		continue;
	    }
	    else
	    {
		currentThrow++;
		int throw2 = throwScroes[currentThrow];
		score+=throw2;
		if(throw1+throw2==10)
		{
		    score+=throwScroes[currentThrow+1];    
		}
		currentFrame++;	
		currentThrow++;
	    }
	}
	return score;
    }

}

package u6_l3_FRQ3_TriangleNumberTracker;

public class TriangleNumberTracker
{
	private int term;
	private int number;

	public TriangleNumberTracker(int startTerm)
	{
		this.term = 1;
		this.number = 1;
		for(int i = 2; i <= startTerm; i++)
		{
			nextTriangle();
		}
	}


	public void nextTriangle()
	{
		this.term++;
		this.number += term;
	}


	public void prevTriangle()
	{
		if (term > 1)
		{
			number -= term;
			term--;
		}
	}


	public int currentTriangle()
	{
		return number;
	}
}
